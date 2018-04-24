import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import freemarker.template.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.sql.*;

@WebServlet("/purchase")
public class purchase extends HttpServlet{
	Configuration cfg;
	HashMap map;
	
	public void init()
	{
		cfg = new Configuration(Configuration.VERSION_2_3_27);
		cfg.setServletContextForTemplateLoading(getServletContext(), "WEB-INF/templates");
		map =  new HashMap<>();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		map.put("msg",false);
		
		try 
		{
			Controller c1 = new Controller();
			HttpSession session = request.getSession(); //Access the session
			String title = (String) session.getAttribute("title");//will use for booking
			String user = (String) session.getAttribute("user");//will use for booking
			String showtime= (String) session.getAttribute("showtime"); //gives me all the movie info
			String r = (String) session.getAttribute("row");//seat
			String c = (String) session.getAttribute("col");//seat

			System.out.println("row: "+r +"col: "+ c);
			//ticket/confirmation email info
			int showtimeID = Integer.parseInt(showtime);
			int row = Integer.parseInt(r);
			int col = Integer.parseInt(c);
			double discount = 0;
			double total = 0;

			//purchasing money details
			PaymentInfo pI = new PaymentInfo();

			//Display at checkout
			int adultPrice = c1.getPrice("adult");
			int childPrice = c1.getPrice("child");
			int bookingFee = c1.getPrice("bookingFee");
			Showtime_obj s = c1.getShowtimeValues(showtimeID);

			String savePayment = request.getParameter("savePayment");

			if (savePayment!=null && savePayment.equals("true")) {
				String cardNumber = request.getParameter("cardNumber");
				String expiration = request.getParameter("expiration");
				String cardCVC = request.getParameter("cardCVC");
				String coupon = request.getParameter("couponCode");
				if (coupon !=null && !c1.checkCoupon(coupon)) {
					map.put("msg", true);
				}
				else
					{
					Promotion p = c1.getCoupon(coupon);
					String expi = p.getExpiration();

					Date expirationDate = new SimpleDateFormat("MM/dd/yyyy").parse(expi);
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
					LocalDate localDate = LocalDate.now();
					String date2 = dtf.format(localDate);
					Date currentDate = new SimpleDateFormat("MM/dd/yyyy").parse(date2);
					System.out.println("Date is valid: "+currentDate.after(expirationDate));
					if (currentDate.after(expirationDate)) {
						map.put("msg", true);
					} else {
						pI = new PaymentInfo(cardNumber, expiration, cardCVC, coupon);
						discount = (double) p.getPercentage();

					}

				}
				double subtotal = c1.getSubTotal();

				int ticketPrice = 0;
				String addTicketA = request.getParameter("addTicketA");
				String addTicketC = request.getParameter("addTicketC");

				if (addTicketA != null && addTicketA.equals("1")) {
					subtotal += adultPrice;
					c1.setSubTotal(subtotal);


				} else if (addTicketC != null && addTicketC.equals("1")) {
					subtotal += childPrice;
					c1.setSubTotal(subtotal);

				}


				if (total == 0) {
					subtotal += bookingFee;
					c1.setSubTotal(subtotal);

					total = (subtotal - (subtotal) * (discount / 100));
					c1.setSubTotal(total);
				}
			}
			//SUBMIT PAYMENT
			String submitOrder = request.getParameter("submitOrder");
			if(submitOrder != null && submitOrder.equals("true"))
			{
				Ticket t = new Ticket(showtimeID, row, col, c1.getSubTotal());
				c1.createTicket(t);
				int ticketID=c1.getTicketID(t);
				c1.createPaymentInfo(pI,user);
				String date = s.getMonth()+"/"+s.getDay()+"/2018";
				c1.createBooking(user,ticketID,s.getMovieTitle(),t.getRow(),t.getCol(),date,s.getTime());
				c1.updateSeats(showtimeID, row,col);
				SendMail.sendOrderConfirmation(t, s, c1.getEmail(user),ticketID);
				response.sendRedirect("/MovieTix/purchaseConfirmation");
			}


			Profile.loggedOut=false;

			map.put("row",row);
			map.put("col", col);
			map.put("title",title);
			map.put("bookingFee",bookingFee);
			map.put("childPrice",childPrice);
			map.put("adultPrice",adultPrice);
			map.put("total",total);
			Template template = cfg.getTemplate("purchase.ftl");
			template.process(map,out);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}

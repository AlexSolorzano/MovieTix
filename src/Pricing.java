public class Pricing {
    private double adultTicket;
    private double childTicket;
    private double bookingFee;


    public Pricing(){}

    public Pricing(double adultTicket, double childTicket,double bookingFee)
    {
        this.adultTicket=adultTicket;
        this.childTicket=childTicket;
        this.bookingFee = bookingFee;
    }

    public double getAdultTicket()
    {
        return this.adultTicket;
    }

    public void setAdultTicket(double adultTicket) {
        this.adultTicket = adultTicket;
    }

    public double getBookingFee() {
        return bookingFee;
    }

    public void setBookingFee(double bookingFee) {
        this.bookingFee = bookingFee;
    }

    public void setChildTicket(double childTicket) {
        this.childTicket = childTicket;
    }

    public double getChildTicket() {
        return childTicket;
    }
}

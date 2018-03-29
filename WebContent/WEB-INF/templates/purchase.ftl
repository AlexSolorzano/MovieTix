<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <title>MoviePage</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">

  <!-- Facebook Opengraph integration: https://developers.facebook.com/docs/sharing/opengraph -->
  <meta property="og:title" content="">
  <meta property="og:image" content="">
  <meta property="og:url" content="">
  <meta property="og:site_name" content="">
  <meta property="og:description" content="">

  <!-- Twitter Cards integration: https://dev.twitter.com/cards/  -->
  <meta name="twitter:card" content="summary">
  <meta name="twitter:site" content="">
  <meta name="twitter:title" content="">
  <meta name="twitter:description" content="">
  <meta name="twitter:image" content="">

  <!-- Place your favicon.ico and apple-touch-icon.png in the template root directory -->
  <link href="favicon.ico" rel="shortcut icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Raleway:300,400,500,700,800" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="../Resources/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="../Resources/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="../Resources/lib/animate-css/animate.min.css" rel="stylesheet">
    
  <!-- Main Stylesheet File -->
  <link href="../Resources/css/style.css" rel="stylesheet">
  <link href="../Resources/css/purchase.css" rel="stylesheet">
  <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
  <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>    
  <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
  
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
    
 <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<style>
    .table>tbody>tr>td, .table>tfoot>tr>td{
    vertical-align: middle;
}
@media screen and (max-width: 600px) {
    table#cart tbody td .form-control{
		width:20%;
		display: inline !important;
	}
	.actions .btn{
		width:36%;
		margin:1.5em 0;
	}
	
	.actions .btn-info{
		float:left;
	}
	.actions .btn-danger{
		float:right;
	}
	
	table#cart thead { display: none; }
	table#cart tbody td { display: block; padding: .6rem; min-width:320px;}
	table#cart tbody tr td:first-child { background: #333; color: #fff; }
	table#cart tbody td:before {
		content: attr(data-th); font-weight: bold;
		display: inline-block; width: 8rem;
	}
	
	
	
	table#cart tfoot td{display:block; }
	table#cart tfoot td .btn{display:block;}
	
}
    
</style>

  <!-- =======================================================
    Theme Name: Imperial
    Theme URL: https://bootstrapmade.com/imperial-free-onepage-bootstrap-theme/
    Author: BootstrapMade.com
    Author URL: https://bootstrapmade.com
  ======================================================= -->
</head>

<body>
  <div id="preloader"></div>


  <!--==========================
  Header Section
  ============================-->
  <header id="header">
    <div class="container">

      <div id="logo" class="pull-left">
       <!-- <a href="#hero"><img src="img/logo.png" alt="" title="" /></img></a>-->
        <!-- Uncomment below if you prefer to use a text image -->
        <!--<h1><a href="#hero">Header 1</a></h1>-->
      </div>

      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li class="menu-active"><a href="#hero"></a></li>
            <li><a href="index.html">Home </a></li>
            <li><a href="#upcomingMovies">Payment Information </a></li>
            <li><a href="#movieListings">Order Summary</a></li>
            <li><a href="#subscribe">Submit Payment</a></li>         
        </ul>
      </nav>
      <!-- #nav-menu-container -->
    </div>
  </header>
  <!-- #header -->

  <!--==========================
  About Section
  ============================-->
  
<!--==========================
  Upcoming movies Section
  ============================--> 
    
    
    <section id="upcomingMovies">
    <div class="container wow fadeInUp">
      <div class="row">
        <div class="col-md-12">
          <h3 class="section-title">Payment Information</h3>
          <div class="section-title-divider"></div>
          <p class="section-description">Pay by credit/debit card</p>
        </div>
      </div>
        <div class="row">
        <div class="col-md-6">
            
        <div class="panel panel-default credit-card-box">
            <div class="panel-heading display-table" >
                <h3 class="panel-title display-td" >Billing Information</h3>
                <div class="display-td"></div>
                <div class="display-td"></div>
                </div>
                <div class="panel-body">
                <form>
                <div class="row">
                    <div class="col-xs-6">
                      <div class="form-group">
                            <label for="couponCode">First Name</label>
                             <input type="text" class="form-control" name="couponCode" placeholder="Ex. John"/>
                      </div>       
                 </div>
                 <div class="col-xs-6">
                      <div class="form-group">
                            <label for="couponCode">Last Name</label>
                             <input type="text" class="form-control" name="couponCode" placeholder="Ex. Doe"/>
                      </div>       
                 </div>   
                </div>
                <div class="row">
                    <div class="col-xs-12">
                        <div class="form-group">
                            <label for="couponCode">Address</label>
                                <input type="text" class="form-control" name="couponCode" placeholder="Ex. 123 Baxter St"/>
                      </div>       
                 </div>      
                </div>
                <div class="row">
                <div class="col-xs-6">
                        <div class="form-group">
                            <label for="couponCode">City</label>
                                <input type="text" class="form-control" name="couponCode" placeholder="Ex. Athens"/>
                        </div>       
                 </div>
                 <div class="col-xs-6">
                    <div class="form-group">
                        <label for="couponCode">Zipcode</label>
                        <input type="text" class="form-control" name="couponCode" placeholder="Ex. 30605"/>
                        </div>       
                 </div>  
                </div>
                    <div class="row">
                    <div class="col-xs-12">
                        <div class="form-group">
                            <label for="couponCode">Email</label>
                                <input type="text" class="form-control" name="couponCode" placeholder="Ex.johnDoe@email.com"/>
                      </div>       
                 </div>      
                </div>
                </form>
                
                </div>
              
        </div>
        </div>
         <div class="col-md-6">
        
            <!-- CREDIT CARD FORM STARTS HERE -->
            <div class="panel panel-default credit-card-box">
                <div class="panel-heading display-table" >
                    
                        <h3 class="panel-title display-td" >Payment Details       </h3>
                    <div class="display-td"></div>
                        <div class="display-td" >                            
                            <img class="img-responsive" src="http://i76.imgup.net/accepted_c22e0.png">
                        </div>
                                     
                </div>
                <div class="panel-body">
                    <form role="form" id="payment-form" method="POST" action="javascript:void(0);">
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="form-group">
                                    <label for="cardNumber">CARD NUMBER</label>
                                    <div class="input-group">
                                        <input 
                                            type="tel"
                                            class="form-control"
                                            name="cardNumber"
                                            placeholder="Valid Card Number"
                                            autocomplete="cc-number"
                                            required autofocus 
                                        />
                                        <span class="input-group-addon"><i class="fa fa-credit-card"></i></span>
                                    </div>
                                </div>                            
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-7 col-md-7">
                                <div class="form-group">
                                    <label for="cardExpiry"><span class="hidden-xs">EXPIRATION</span><span class="visible-xs-inline">EXP</span> DATE</label>
                                    <input 
                                        type="tel" 
                                        class="form-control" 
                                        name="cardExpiry"
                                        placeholder="MM / YY"
                                        autocomplete="cc-exp"
                                        required 
                                    />
                                </div>
                            </div>
                            <div class="col-xs-5 col-md-5 pull-right">
                                <div class="form-group">
                                    <label for="cardCVC">CV CODE</label>
                                    <input 
                                        type="tel" 
                                        class="form-control"
                                        name="cardCVC"
                                        placeholder="CVC"
                                        autocomplete="cc-csc"
                                        required
                                    />
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="form-group">
                                    <label for="couponCode">COUPON CODE</label>
                                    <input type="text" class="form-control" name="couponCode" />
                                </div>
                            </div>                        
                        </div>
                        <div class="row">
                        <div class="col-md-offset-3 col-md-9">
                            </div>
                            </div>
                        <div class="row" style="display:none;">
                            <div class="col-xs-12">
                                <p class="payment-errors"></p>
                            </div>
                        </div>
                    </form>
                </div>
            </div>                 
            </div>  
        </div> 
    </div>
  </section>
    <section id="movieListings">
    <div class="container wow fadeInUp">
      <div class="row">
        <div class="col-md-12">
            <br>
          <h3 class="section-title">Order Summary</h3>
          <div class="section-title-divider"></div>
        </div>
      </div>
    </div>
    <div class="container about-container wow fadeInUp">
        <div class="container"> 
      <div class="row">
        <div class=" col-md-push-5 about-content">
	       <table id="cart" class="table table-hover table-condensed">
    				<thead>
						<tr>
							<th style="width:50%">Movie</th>
							<th style="width:10%">Price</th>
							<th style="width:8%">Quantity</th>
							<th style="width:22%" class="text-center">Subtotal</th>
							<th style="width:10%"></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td data-th="Product">
								<div class="row">
									<div class="col-sm-10">
										<h4 class="nomargin">Black Panther</h4>
										<p>ADULT TICKET</p>
									</div>
								</div>
							</td>
							<td data-th="Price">$7.99</td>
							<td data-th="Quantity">
								<input type="number" class="form-control text-center" value="1">
							</td>
							<td data-th="Subtotal" class="text-center">7.99</td>
							<td class="actions" data-th="">
								<button class="btn btn-info btn-sm"><i class="fa fa-refresh"></i></button>
								<button class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i></button>								
							</td>
						</tr>
                        <tr>
							<td data-th="Product">
								<div class="row">
									<div class="col-sm-10">
										<h4 class="nomargin">Black Panther</h4>
										<p>CHILD TICKET</p>
									</div>
								</div>
							</td>
							<td data-th="Price">$5.99</td>
							<td data-th="Quantity">
								<input type="number" class="form-control text-center" value="1">
							</td>
							<td data-th="Subtotal" class="text-center">5.99</td>
							<td class="actions" data-th="">
								<button class="btn btn-info btn-sm"><i class="fa fa-refresh"></i></button>
								<button class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i></button>								
							</td>
						</tr>
					</tbody>
					<tfoot>
						<tr class="visible-xs">
							<td class="text-center"><strong>Total 1.99</strong></td>
						</tr>
						<tr>
							<td>
                                <!--<a href="moviePage.html" class="btn btn-warning"><i class="fa fa-angle-left"></i> Continue Shopping</a>-->
                            </td>
							<td colspan="2" class="hidden-xs"></td>
							<td class="hidden-xs text-center"><strong>Total: $13.98</strong></td>
							<td></td>
						</tr>
					</tfoot>

				</table>
                <a href="index.html"><button class="btn btn-warning">CANCEL ORDER</button><br></a>

            <br>
            <br>
            </div>
        </div>
        </div>
    </div>
  </section>
    <!--==========================
  Purchase Section
  ============================-->
  <section id="subscribe">
    <div class="container wow fadeInUp">
      <div class="row">
        <div class="col-md-8">
          <h3 class="subscribe-title">Complete Purchase</h3>
          <p class="subscribe-text"> Be sure to review your order at the top before hitting this button</p>
        </div>
        <div class="col-md-4 subscribe-btn-container">
          <a class="subscribe-btn" href="purchaseConfirmation.html">SUBMIT PAYMENT</a>
            
        </div>
      </div>
    </div>
  </section>
  
  
  <footer id="footer">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="copyright">
            &copy; Copyright <strong>Imperial Theme</strong>. All Rights Reserved
          </div>
          <div class="credits">
            Bootstrap Templates by <a href="https://bootstrapmade.com/">BootstrapMade</a>
          </div>
        </div>
      </div>
    </div>
  </footer>
  <!-- #footer -->

  <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

  <!-- Required JavaScript Libraries -->
  <script src="../Resources/lib/jquery/jquery.min.js"></script>
  <script src="../Resources/lib/bootstrap/js/bootstrap.min.js"></script>
  <script src="../Resources/lib/superfish/hoverIntent.js"></script>
  <script src="../Resources/lib/superfish/superfish.min.js"></script>
  <script src="../Resources/lib/morphext/morphext.min.js"></script>
  <script src="../Resources/lib/wow/wow.min.js"></script>
  <script src="../Resources/lib/stickyjs/sticky.js"></script>
  <script src="../Resources/lib/easing/easing.js"></script>

  <!-- Template Specisifc Custom Javascript File -->
  <script src="../Resources/js/custom.js"></script>
</body>
</html>
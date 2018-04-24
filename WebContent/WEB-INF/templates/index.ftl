<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <title>MovieTickets</title>
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
  <link href="Resources/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="Resources/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="Resources/lib/animate-css/animate.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="Resources/css/style.css" rel="stylesheet">
    
 <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

  <!-- =======================================================
    Theme Name: Imperial
    Theme URL: https://bootstrapmade.com/imperial-free-onepage-bootstrap-theme/
    Author: BootstrapMade.com
    Author URL: https://bootstrapmade.com
  ======================================================= -->
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
  <div id="preloader"></div>

  <!--==========================
  Hero Section
  ============================-->
  <section id="hero">
    <div class="hero-container">
      <div class="wow fadeIn">
        <div class="hero-logo">
        </div>

        <h1>Movie Tix</h1>
        <h2>Welcome ${user} <span class="rotating"> to the ultimate movie booking experience</span></h2>
        <div class="actions">
          <a href="#about" class="btn-get-started">Get started</a>
          <a href="#signIn" class="btn-signIn">Sign in</a>
        </div>
      </div>
    </div>
  </section>

  <!--==========================
  Header Section
  ============================-->
  <header id="header">
    <div class="container">

      <div id="logo" >
       <!-- <a href="#hero"><img src="img/logo.png" alt="" title="" /></img></a>-->
        <!-- Uncomment below if you prefer to use a text image -->
        <!--<h1><a href="#hero">Header 1</a></h1>-->
      </div>

      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li class="menu-active"><a href="#hero">Home</a></li>
          <li><a href="#about">About Us</a></li>
         <!--FREE MARKER IF LOGGED IN-->
        <li class="menu-has-children"><a href="#signIn">${user}</a>
            <ul>
              <li><a href="/MovieTix/profile">My Account</a></li>
            </ul>
          </li>
         !

            <li><a href="#movieListing">Movie Listings</a></li>
          <li><a href="#upcomingMovies">Upcoming Movies</a>
          <li><a href="#subscribe">Subscribe</a></li>
            
            

        </ul>
      </nav>
      <!-- #nav-menu-container -->
    </div>
  </header>
  <!-- #header -->

  <!--==========================
  About Section
  ============================-->
  <section id="about">
    <div class="container wow fadeInUp">
      <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8">
          <h3 class="section-title">About Us</h3>
          <div class="section-title-divider"></div>
          <p class="section-description">Welcome to the easiest movie booking website! Simply click on any movie, pick a time and then select your seat. In order to purchase a movie you'll have to create an account but that takes seconds. Once you're done, proceed to check out and then enjoy the movie! </p>
        </div>
        <div class="col-md-2"></div>

      </div>
    </div>

  </section>

  <!--==========================
  Sign In Section
  ============================-->
  <section id="signIn">
    <div class="container"> 
        <h3 class="section-title">Sign In</h3>
        <div class="section-title-divider"></div>

        <div id="loginbox" style="margin-top:10px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
            <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title">Sign In</div>
                        <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="/MovieTix/forgotPassword">Forgot password?</a></div>
                    </div>     

                    <div style="padding-top:30px" class="panel-body" >
                        <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>               
                        <form id="loginform" class="form-horizontal" role="form">                          
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input  type="text" class="form-control" name="username" id="username" value="" placeholder="username or email">                                        
                            </div>                      
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input type="password" class="form-control" name="password" placeholder="password" id="password">
                                    </div>     
                            


                                <div style="margin-top:10px" class="form-group">
                                    <!-- Button -->
                                    <div class="col-sm-12 controls">
                                      <button id="submitSignIn" class="btn btn-success">Sign In  </button>
                                       <#if vMsg>
                                            <h5>Incorrect login information or you haven't verified your account. <br> Check email for a verification code. </h5> 
                                        </#if>          
                                        <h5 id="message1"></h5>

                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12 control">
                                        <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
                                            Don't have an account! 
                                        <a href="#signIn" onClick="$('#loginbox').hide(); $('#signupbox').show()">
                                            Sign Up Here
                                        </a>
                                        </div>
                                    </div>
                                </div>    
                            </form>     



                        </div>                     
                    </div>  
        </div>
        <div id="signupbox" style="display:none; margin-top:50px" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <div class="panel-title">Sign Up</div>
                            <div style="float:right; font-size: 85%; position: relative; top:-10px"><a id="signinlink" href="#signIn" onclick="$('#signupbox').hide(); $('#loginbox').show()">Sign In</a></div>
                        </div>  
                        <div class="panel-body" >
                            <form id="signupform" class="form-horizontal" role="form">
                                
                                <div id="signupalert" style="display:none" class="alert alert-danger">
                                    <p>Error:</p>
                                    <span></span>
                                </div>    
                                
                                  
                                <div class="form-group">
                                    <label for="email" class="col-md-3 control-label">*Email</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="emailInput" placeholder="Email Address" id="emailInput">
                                    </div>
                                </div>
                                    
                                <div class="form-group" >
                                    <label for="firstname" class="col-md-3 control-label">*First Name</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="firstnameInput" placeholder="First Name" id="firstNameInput">
                                    </div>
                                </div>
                                <div class="form-group" >
                                    <label for="lastname" class="col-md-3 control-label">*Last Name</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="lastnameInput" placeholder="Last Name" id="lastNameInput">
                                    </div>
                                </div>
                                <div class="form-group" >
                                    <label for="password" class="col-md-3 control-label">*Password</label>
                                    <div class="col-md-9">
                                        <input type="password" class="form-control" name="passwordInput" placeholder="Password" id="psswd">
                                    </div>
                                </div>
                                    
                                   <div class="form-group">
                                    <label for="password" class="col-md-3 control-label">*Confirm Password</label>
                                    <div class="col-md-9">
                                        <input type="password" class="form-control" name="passwd" placeholder="Confirm password" id="psswdCon">
                                    </div>
                                </div>
                                <center>
                                    <button id="submitSignUp" type="submit" class="btn btn-success">Sign Up</button>
                                    <br>
                                    <#if eMsg>
                                            <h5>An account with that email already exist. Go to login or use a different email. </h5> 
                                        </#if>  
                                    <h5 id="message"></h5>
                                 </center>

                                
                                
                                
                            </form>
                         </div>
                    </div>

               
               
                
         </div> 
    </div>
  </section>

  

  <!--==========================
  Movie Listing Section
  ============================-->
  <section id="movieListing">
    <div class="container wow fadeInUp">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h3 class="section-title">Movie Listings</h3>
                <div class="section-title-divider"></div>
                </div>
            </div>
            <div class="row">
                <center>
                <div class="col-md-6">
                    <h4>Rating</h4>
                    <button type="submit" value="r" id="ratedR" name="ratedR" class="btn btn-primary">R</button>
                    <button type="submit" value="pg13" id="ratedPG13" name="ratedPG13" class="btn btn-success">PG-13</button>
                    <button type="submit" value="pg" id="ratedPG" name="ratedPG" class="btn btn-warning">PG</button>
                </div>
                <div class="col-md-6">
                    <h4>Genre</h4>
                    <button type="submit" value="action" id="action" name="action" class="btn btn-primary">action</button>
                    <button type="submit" value="adventure" id="adventure" name="adventure" class="btn btn-success">adventure</button>
                    <button type="submit" value="thriller" id="thriller" name="thriller" class="btn btn-warning">thriller</button>
                    <button type="submit" value="drama" id="drama" name="drama" class="btn btn-danger">drama</button>
                </div>
                </center>
            </div>
            <br>
            <div class="row">
                <#list movies as movie>
                    <div class="col-sm-3">
                        <form id="sendMovie">
                        <button type="submit" value="${movie.getTitle()}" name="goToMovie" id="goToMovie" class="btn-outline-primary"t">
                            <img src="${movie.getImagePath()}" height="275" widght="180">
                        </button>
                        </form>
                    </div>
                </#list>
            </div>
            </div>
    </div>
    </div>
  </section>
    

    <!--==========================
  Subscrbe Section
  ============================-->
  <section id="subscribe">
    <div class="container wow fadeInUp">
      <div class="row">
        <div class="col-md-8">
          <h3 class="subscribe-title">Subscribe For Promotions</h3>
          <p class="subscribe-text">Join our 1000+ subscribers and get access to the latest news and movie promotions!</p>
        </div>
        <div class="col-md-4 subscribe-btn-container">
          <a class="subscribe-btn" href="/MovieTix/subscribed">Subscribe Now</a>
        </div>
      </div>
    </div>
  </section>

 
  

  <!--==========================
  Footer
============================-->
  <footer id="footer">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="copyright">
            &copy; Copyright <strong>Imperial Theme</strong>. All Rights Reserved
          </div>
          <div class="credits">
            <!--
              All the links in the footer should remain intact.
              You can delete the links only if you purchased the pro version.
              Licensing information: https://bootstrapmade.com/license/
              Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=Imperial
            -->
            Bootstrap Templates by <a href="https://bootstrapmade.com/">BootstrapMade</a>
          </div>
        </div>
      </div>
    </div>
  </footer>
  <!-- #footer -->

  <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

  <!-- Required JavaScript Libraries -->
  <script src="Resources/lib/jquery/jquery.min.js"></script>
  <script src="Resources/lib/bootstrap/js/bootstrap.min.js"></script>
  <script src="Resources/lib/superfish/hoverIntent.js"></script>
  <script src="Resources/lib/superfish/superfish.min.js"></script>
  <script src="Resources/lib/morphext/morphext.min.js"></script>
  <script src="Resources/lib/wow/wow.min.js"></script>
  <script src="Resources/lib/stickyjs/sticky.js"></script>
  <script src="Resources/lib/easing/easing.js"></script>

  <!-- Template Specisifc Custom Javascript File -->
  <script src="Resources/js/custom.js"></script>
    <script src="Resources/js/home.js"></script>

</body>

</html>

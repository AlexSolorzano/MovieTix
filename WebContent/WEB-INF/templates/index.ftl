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
        <h2>Welcome  ${person}<span class="rotating"> to the ultimate movie booking experience</span></h2>
        <div class="actions">
          <a href="#about" class="btn-get-started">Get Started</a>
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
        <li class="menu-has-children"><a href="#signIn">${person}</a>
            <ul>
              <li><a href="/MovieTix/profile">My Account</a></li>
            </ul>
          </li>
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
                        <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#">Forgot password?</a></div>
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
                                            <p>Incorrect login information. Try agan</p> 
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
                                    <h5 id="message"></h5>
                                 </center>
                                
                                <!-- FANCY BUTTON STARTS HERE -->
                                <div class="form-group">
                                    <!-- Button -->                                        
                                    <div class="col-md-offset-3 col-md-9">
                                          
                                        <!-- Modal -->
                                        <!-- Trigger the modal with a button -->
                                        <!--<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal" id="signUpButton">Sign Up</button>
                                        <!--<div class="modal fade" id="myModal" role="dialog">
                                            <div class="modal-dialog">
                                            <!-- Modal content-->
                                            <!--<div class="modal-content">
                                                <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                    <h4 class="modal-title">Account Confirmation</h4>
                                                </div>
                                                    <div class="modal-body">
                                                        <p>You've officially been signed up, proceed to the login page.</p>
                                                    </div>
                                                <div class="modal-footer">
                                                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                                </div>
                                            </div>
                                        </div>
                                        </div>-->
                                        <span style="margin-left:8px;"></span>  
                                    </div>
                                
                               
                                    
<!--
                                    <div class="col-md-offset-3 col-md-9">
                                        <button id="btn-fbsignup" type="button" class="btn btn-primary"><i class="icon-facebook"></i>Sign Up with Facebook</button>
                                    </div>                                           
-->
                                        
                                </div>
                                
                                
                                
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
            <p class="section-description"> </p>
        </div>
        <input class="form-control" id="myInput" type="text" placeholder="Search..">
        <br>
        <div id="myDIV">
            <div class="row">
                <div class="col-md-2>
                <div class="filterDiv fantasy scienceFiction">
                    <a class="portfolio-item" style="background-image: url(Resources/img/blackPanther.jpg);" href="/MovieTix/moviePage">
                        <div class="details">
                            <h4>Black Panther</h4>
                                <span>February 16th</span>
                                    <br>
                                        Fantasy/Science fiction<br>
                                        Rated: PG-13
                                    </div>
                    </a>
                </div>
                </div>

                <div class="col-md-2">
                <div class="filterDiv thriller mystery">
                    <a class="portfolio-item" style="background-image: url(Resources/img/redSparrow.jpg);" href="">
                        <div class="details">
                        <h4>Red Sparrow</h4>
                            <span>March 2nd</span>
                                <br>
                                    Thriller film/Mystery
                                <br>
                                    Rated: R
                        </div>
                    </a>
                </div>
                </div>
                <div class="col-md-2">
                <div class="filterDiv thriller fantasy">
                    <a class="portfolio-item" style="background-image: url(Resources/img/annihalation.jpg);" href="">
                    <div class="details">
                    <h4>Annihalation</h4>
                        <span>February 23rd</span>
                        <br>
                        Thriller film/Fantasy
                        <br>
                        Rated: R
                    </div>
                    </a>
                </div>
                </div>
                <div class="col-md-2">
                <div class="filterDiv drama crime">
                    <a class="portfolio-item" style="background-image: url(Resources/img/deathWish.jpg);" href="">
                    <div class="details">
                        <h4>Death Wish</h4>
                        <span>March 2nd</span>
                        <br>
                        Drama/Crime 
                        <br>
                        Rated: R
                    </div>
                    </a>
                </div>
                </div>
                <div class="col-md-2">
                <div class="filterDiv mystery crime">
                    <a class="portfolio-item" style="background-image: url(Resources/img/gameNight.jpg);" href="">
                    <div class="details">
                    <h4>Game Night</h4>
                    <span>February 23rd</span>
                    <br>
                    Mystery/Crime film 
                    <br>
                    Rated: R
                    </div>
                </a>
                </div>
                </div>
                
                <div class="col-md-2">
                <div class="filterDiv fantasy adventure">
                <a class="portfolio-item" style="background-image: url(Resources/img/rascalRebelRabbit.jpg);" href="">
                    <div class="details">
                    <h4>Rascal Rebel Rabbit</h4>
                    <span>February 9th</span>
                    <br>
                    Fantasy/Adventure
                    <br>
                    Rated: PG
                    </div>
                </a>
                </div>
                </div>
                
                <div class="col-md-2">
                <div class="filterDiv thriller drama">
                <a class="portfolio-item" style="background-image: url(Resources/img/fiftyShadesFreed.jpg);" href="">
                <div class="details">
                    <h4>Fifty Shades Freed</h4>
                    <span>February 9th</span>
                    <br>
                    Drama/Thriller film
                    <br>
                    Rated: R
                    </div>
                </a>
                </div>
                </div>
                
            <div class="col-md-2">
            <div class="filterDiv fantasy drama">
                <a class="portfolio-item" style="background-image: url(Resources/img/everyDay.jpg);" href="">
                <div class="details">
                <h4>Every day(2018)</h4>
                <span>February 9th</span>
                <br>
                    Fantasy/Drama
                <br>
                    Rated: PG-13
                </div>
                </a>
            </div>
            </div>
            <div class="col-md-2">
            <div class="filterDiv drama romance">
                <a class="portfolio-item" style="background-image: url(Resources/img/greatestShowman.jpg);" href="">
                    <div class="details">
                        <h4>The Greatest Showman</h4>
                            <span>December 20th</span>
                            <br>
                            Drama/Romance
                            <br>
                            Rated: PG
                            </div>
                </a>
            </div>
            </div>
            <div class="col-md-2">
            <div class="filterDiv thriller fantasy">
                <a class="portfolio-item" style="background-image: url(Resources/img/jumanii.jpg);" href="">
                <div class="details">
                    <h4>Jumanji: Welcome to the Jungle</h4>
                    <span>December 20th</span>
                    <br>
                    Fantasy/Thriller
                    <br>
                    Rated: PG
                    </div>
                </a>
            </div>
            </div>
            <div class="col-md-2">
            <div class="filterDiv fantasy action">
                <a class="portfolio-item" style="background-image: url(Resources/img/earlyMan.jpg);" href="">
                <div class="details">
                    <h4>Early Man</h4>
                    <span>February 16th</span>
                    <br>
                    Fantasy/Action
                    <br>
                    Rated: PG
                </div>
            </a>
            </div>
            </div>
            
            <div class="col-md-2">
            <div class="filterDiv thriller drama">
            <a class="portfolio-item" style="background-image: url(Resources/img/the1517.jpg);" href="">
                <div class="details">
                <h4>The 15:17 to Paris</h4>
                <span>February 9th</span>
                <br>
                Drama/Thriller film
                <br>
                Rated: P
                </div>
                </a>
                </div>
            </div>
            </div>
        </div> <!---Container--->
    </div>
    </div>
  </section>
    
    <!--==========================
  Upcoming movies Section
  ============================--> 
    
    
    <section id="upcomingMovies">
    <div class="container wow fadeInUp">
      <div class="row">
        <div class="col-md-12">
          <h3 class="section-title">Upcoming Movies</h3>
          <div class="section-title-divider"></div>
          <p class="section-description">Coming soon to theaters</p>
        </div>
      </div>
        <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-2">
          <a class="portfolio-item" style="background-image: url(Resources/img/aWrinkleInTime.jpg);" href="">
            <div class="details">
              <h4>A Wrinkle in Time</h4>
              <span>March 9th</span>
            </div>
          </a>
        </div>
            <div class="col-md-2">
          <a class="portfolio-item" style="background-image: url(Resources/img/tombRaider.jpg);" href="">
            <div class="details">
              <h4>Tomb Raider</h4>
              <span>March 16th</span>
            </div>
          </a>
        </div>
        <div class="col-md-4"></div>

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
          <a class="subscribe-btn" href="#">Subscribe Now</a>
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

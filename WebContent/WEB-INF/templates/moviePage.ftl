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
            <li><a href="/MovieTix/home">Home </a></li>
          <li><a href="#movieInfo">Movie Info </a></li>
            <li><a href="#subscribe">Purchase</a></li>
            <li><a href="#testimonials">Reviews</a></li>
            

        </ul>
      </nav>
      <!-- #nav-menu-container -->
    </div>
  </header>
  <!-- #header -->

  <!--==========================
  About Section
  ============================-->
  <section id="movieInfo">
    <div class="container wow fadeInUp">
      <div class="row">
        <div class="col-md-12">
          <h3 class="section-title">${title}</h3>
          <div class="section-title-divider"></div>
        </div>
      </div>
    </div>

    <div class="container about-container wow fadeInUp">
      <div class="row">
          <div class="col-md-5">
              <img src="${imagePath}" height="552" width="380">
          </div>
        <div class="col-md-6">
          <h4>Rated: ${rating} | Genre:  ${genre} | Now Playing: ${nowPlaying} </h4>
         <hr style="width:5px">
          <h5> <b>Director: </b> ${directors}<p>   </p><b>Producers: </b> ${producers}<br></h5>
            <h5><b>Cast: </b> ${cast}</h5>
            <br>
          <h5>
           <center>${synopsis}</center>
          </h5>

            <iframe width="560" height="315" src="${trailerPath}" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
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
          <h3 class="subscribe-title">Purchase Tickets</h3>
          <p class="subscribe-text"> Click on the link to select a time and date to view this movie</p>
        </div>
        <div class="col-md-4 subscribe-btn-container">
            <form id="buyTicket"> <button type="submit" value="true" name="buyMovie" id="buyMovie" class="subscribe-btn">Buy</button></form>
        </div>
      </div>
    </div>
  </section>
  <!--==========================
  Testimonials Section
  ============================-->
  <section id="testimonials">
    <div class="container wow fadeInUp">
      <div class="row">
        <div class="col-md-12">
          <h3 class="section-title">Reviews</h3>
          <div class="section-title-divider"></div>
          <p class="section-description">Reviews left by users.</p>
        </div>
      </div>

      <div class="row">
        <div class="col-md-3">
          <div class="profile">
            <div class="pic"><img src="Resources/img/becky.jpg" alt=""></div>
            <h4>Rebecca Slimming</h4>
          </div>
        </div>
        <div class="col-md-9">
          <div class="quote">
            <b><img src="Resources/img/quote_sign_left.png" alt=""></b> AHHHH stop! This movie almost made me drop my croissant! It really buttered my crispy flakes. I almost mistook Shalissa for beyonce. Major faiL!!!  <small><img src="Resources/img/quote_sign_right.png" alt=""></small>
          </div>
        </div>
      </div>

      <div class="row">
        <div class="col-md-9">
          <div class="quote">
            <b><img src="Resources/img/quote_sign_left.png" alt=""></b> This movie was legitness. I mean at different points I would ask... oh my freaking gosh, she's freaking dead. Other times, I would just sit there and say wow. All I have to say to other movies, is that they need to step the freak up. <small><img src="Resources/img/quote_sign_right.png" alt=""></small>
          </div>
        </div>
        <div class="col-md-3">
          <div class="profile">
            <div class="pic"><img src="Resources/img/ridhaAli.jpeg" alt=""></div>
            <h4>Ridha Ali</h4>
          </div>
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

</body>

</html>

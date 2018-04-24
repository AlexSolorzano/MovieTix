<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Seating Page</title>
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
        </div>

        <nav id="nav-menu-container">
            <ul class="nav-menu">
                <li class="menu-active"><a href="#hero"></a></li>
                <li><a href="/MovieTix/home">Home </a></li>
                <li><a href="#movieListing">Select Showtime</a></li>
            </ul>
        </nav>
        <!-- #nav-menu-container -->
    </div>
</header>
<section id="movieListing">
        <div class="container wow fadeInUp">
            <div class="row">
                <div class="col-md-12">
                    <h3 class="section-title">Select A Showtime</h3>
                    <div class="section-title-divider"></div>
                </div>
                <div class="container">
                    <div class="row">
                        <br>
                        <br>
                    </div>
                    <div class="row">
                        <div class = "col-md-12">
                            <#list showtimes as showtime>
                                <form showtime>
                                <button name="selectShowtime" id="selectShowtime" class="btn btn-primary" type="submit"
                                        value="${showtime.getMovieTitle()}-${showtime.getTheater()}-${showtime.getMonth()}-${showtime.getDay()}-${showtime.getTime()}-" >
                                    ${showtime.getMonth()}/${showtime.getDay()}  at  ${showtime.getTime()} </button>
                                </form>
                            </#list>
                            </div>
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
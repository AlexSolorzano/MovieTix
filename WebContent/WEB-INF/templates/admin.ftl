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
            <li><a href="MovieTix/home">Home </a></li>
          <li><a href="#movieListing">Users</a></li> 
            <li><a href="#upcomingMovies">Company Performance</a></li>
            <li><a href="#about">Manage Movies</a></li>


        </ul>
      </nav>
      <!-- #nav-menu-container -->
    </div>
  </header>
  <!-- #header -->

  <!--==========================
  About Section
  ============================-->
  <section id="movieListing">
    <div class="container wow fadeInUp">
      <div class="row">
        <div class="col-md-12">
          <h3 class="section-title">Users</h3>
          <div class="section-title-divider"></div>
        </div>
      </div>
    </div>
    <div class="container about-container wow fadeInUp">
         <div class="row">
                  <div class="col-md-10"></div>
                  <div class="col-md-2">
                      <button type="button" class="btn btn-warning">EDIT</button>
                      <button type="button" class="btn btn-success">SAVE</button>
                  </div>
              </div>    
      <div class="row">
       
          <div class="container">           
                <table class="table">
                <thead>
                    <tr>
                        <th>User ID</th>
                        <th>Firstname</th>
                        <th>Lastname</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>18292</td>
                        <td>Michael </td>
                        <td>Scott</td>
                        <td>mscott@dunderMif.com</td>                    </tr>
                    <tr>
                        <td>91282</td>
                        <td>Dwight K.</td>
                        <td>Schrute</td>
                        <td>dkschrute@dunderMif.com</td>
                    </tr>
                    <tr>
                        <td>19283</td>
                        <td>Jim</td>
                        <td>Halpert</td>
                        <td>jhalpert@dunderMif.com</td>
                    </tr>
                    </tbody>
              </table>
          </div>
      </div>
    </div>
  </section>

   <section id="upcomingMovies">
    <div class="container wow fadeInUp">
      <div class="row">
        <div class="col-md-12">
          <h3 class="section-title">Company Performance</h3>
          <div class="section-title-divider"></div>
        </div>
          <div class="container">
              <div class="row">
                  <div class="col-md-2"></div>
                <div class="col-md-8">  
                  <img src="Resources/img/moneyGraph.gif">
                  </div>
                <div class="col-md-2"></div>

              </div> 
          </div>
      </div>
    </div>
    </section>
    <section id="about">
        <br>
        <br>
    <div class="container wow fadeInUp">
      <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8">
          <h3 class="section-title">Manage Movies</h3>
          <div class="section-title-divider"></div>    
        </div>
        <div class="col-md-2"></div>
      </div>
    </div>    
          <div class="container about-container wow fadeInUp">
              <div class="row">
                  <div class="col-md-10"></div>
                  <div class="col-md-2">
                      <button type="button" class="btn btn-warning">EDIT</button>
                      <button type="button" class="btn btn-success">SAVE</button>
                  </div>
              </div>           
    <div class="row">
          <div class="container">           
                <table class="table">
                <thead>
                    <tr>
                        <th>Movie</th>
                        <th>Room</th>
                        <th>Viewing Dates</th>
                        <th>Viewing Times</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Black Pather</td>
                        <td>Screen 1</td>
                        <th>02/14/2018 - 05/04/2018</th>
                        <td>11:00am - 12:30pm <br>
                            1:00pm - 2:30pm <br>
                            3:00pm - 4:30pm <br>
                            7:00pm - 8:30pm 
                        </td>
                    </tr>
                    <tr>
                        <td>Red Sparrow</td>
                        <td>Screen 2</td>
                        <th>03/14/2018 - 06/04/2018</th>
                        <td>11:00am - 12:30pm <br>
                            1:00pm - 2:30pm <br>
                            3:00pm - 4:30pm <br>
                            7:00pm - 8:30pm 
                        </td>
                    </tr>
                    <tr>
                        <td>Greatest Showman</td>
                        <td>Screen 3</td>
                        <th>12/01/2017 - 03/031/2018</th>
                        <td>11:00am - 12:30pm <br>
                            1:00pm - 2:30pm <br>
                            3:00pm - 4:30pm <br>
                            7:00pm - 8:30pm 
                        </td>
                    </tr>
                    <tr>
                        <td>Annihalationr</td>
                        <td>Screen 4</td>
                        <th>01/01/2018 - 04/24/2018</th>
                        <td>11:00am - 12:30pm <br>
                            1:00pm - 2:30pm <br>
                            3:00pm - 4:30pm <br>
                            7:00pm - 8:30pm 
                        </td>
                    </tr>
                    <tr>
                        <td>Death Wish</td>
                        <td>Screen 1</td>
                        <th>02/08/2018 - 06/01/2018</th>
                        <td>9:00am - 10:30pm <br>
                            5:00pm - 6:30pm <br>
                            9:00pm - 10:30pm <br>
                            11:00pm - 12:30pm 
                        </td>
                    </tr>
                    <tr>
                        <td>Game Night</td>
                        <td>Screen 2</td>
                        <th>03/18/2018 - 07/11/2018</th>
                        <td>9:00am - 10:30pm <br>
                            5:00pm - 6:30pm <br>
                            9:00pm - 10:30pm <br>
                            11:00pm - 12:30pm 
                        </td>
                    </tr>
                    <tr>
                        <td>Fifty Shades Freed</td>
                        <td>Screen 3</td>
                        <th>02/14/2018 - 06/14/2018</th>
                        <td>9:00am - 10:30pm <br>
                            5:00pm - 6:30pm <br>
                            9:00pm - 10:30pm <br>
                            11:00pm - 12:30pm 
                        </td>
                    </tr>
                    <tr>
                        <td>Greatest Showman</td>
                        <td>Screen 4</td>
                        <th>12/31/2018 - 04/01/2018</th>
                        <td>9:00am - 10:30pm <br>
                            5:00pm - 6:30pm <br>
                            9:00pm - 10:30pm <br>
                            11:00pm - 12:30pm 
                        </td>
                    </tr>
                    </tbody>
              </table>
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

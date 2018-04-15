<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <title>Admin Page</title>
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
<nav id="nav-menu-container">
        <ul class="nav-menu">
          <li class="menu-active"><a href="#hero"></a></li>
            <li><a href="/MovieTix/home">Log out </a></li>
          <li><a href="#movieListing">Manage Users</a></li> 
            <li><a href="#upcomingMovies">Manage Employees</a></li>
            <li><a href="#about">Manage Movies</a></li>
            <li><a href="#testimonials">Manage Tickets</a></li>



        </ul>
      </nav>
      <!-- #nav-menu-container -->
    </div>
  </header>
  <!-- #header -->

  <section id="movieListing">
    <div class="container wow fadeInUp">
      <div class="row">
        <div class="col-md-12">
          <h3 class="section-title">Manage Users</h3>
          <div class="section-title-divider"></div>
        </div>
      </div>
    </div>
    <div class="container about-container wow fadeInUp">
         <div class="row">
                  <div class="col-md-8"></div>
                  <div class="col-md-4">
                      <button type="button" class="btn btn-warning">DELETE</button>
                      <button type="button" class="btn btn-success">ADD</button>
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
                        <td>mscott@dunderMif.com</td>                    
                    </tr>
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
          <h3 class="section-title">Manage Ticket Prices and Promotions</h3>
          <div class="section-title-divider"></div>
        </div>
          <div class="container">
              <div class="row">
       
          <div class="container">           
                <table class="table" id="employees">
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
                        <td>mscott@dunderMif.com</td>   
                    </tr>
                    </tbody>
              </table>
          </div>
      </div>
          </div>
      </div>
    </div>
    </section>

    <section id="about">
    <br><br>
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
    <br>
    <div class="container">
    <form id="movieTable">
    
        <div class="row">
        <br>
            <div class="col-md-1"> </div>
            <div class="col-md-4" align="left">
                <label>Movie Title </label>
                <input type="text" placeholder="title" id="title" name="title"> 
            </div>
        <center>
            <div class="col-md-6">
                <button type="button" class="btn btn-success" id="addMovie" >ADD MOVIE</button>
                <button type="button" class="btn btn-info" id="editMovie" >EDIT MOVIE</button>
                <button type="button" class="btn btn-danger" id="deleteMovie" >DELETE MOVIE</button>
            </div>
            <div class="col-md-1"></div>
        </center>                      
        </div>
        <br>  <br>
        <div class="row"> 
                <div class ="col-md-4" align="left">
                    <label>Genre</label><br>
                    <input type="text" placeholder="ei. Drama" id="genre" name="genre">  
                    <br><br>
                    <label>Cast</label> <br>
                    <input type="text" placeholder="seperate names with ';' " id="cast" name="cast">
                    <br><br>
                    <label>Director</label><br>
                    <input type="text" placeholder="seperate names with ';'" id="Director" name="Director">
                </div>
                <div class ="col-md-4" align="left">
                    <label>Producer </label><br>
                    <input type="text" placeholder="seperate name with ';'" id="producer" name="producer"> 
                    <br><br>
                    <label>Description </label><br>
                    <input type="text" placeholder="synopsis" id="synopsis" name="synopsis">  
                    <br><br>
                    <label>Trailer Picture </label><br>
                    <input type="text" placeholder="paste url" id="picturePath" name="picturePath">
                </div>
                <div class ="col-md-4" align="left"> 
                    <label>Trailer Video</label><br>
                    <input type="text" placeholder="paste url" id="trailerPath" name="trailerPath"> 
                    <br><br>
                    <label>Rating </label><br>
                    <input type="text" placeholder="MPAA_rating" id="rating" name="rating">
                    <br><br>
                    <label>Status </label><br>
                    <input type="text" placeholder="Status" id="status" name="nowPlaying">
                </div>
            </div>
    
    </form>
    </div>
    <br> <br>
    <div class="row">
    <center> <h3>Movies</h3>
          <div class="container">           
                <table class="table">
                <thead>
                    <tr>
                        <th>Title</th>
                        <th>Genre</th>
                        <th>Cast</th>
                        <th>Director</th>
                        <th>Producer</th>
                        <th>Description</th>
                        <th>TrailerPicture</th>
                        <th>TrailerVideo</th>
                        <th>MPAA_rating</th>
                        <th>Status</th>

                    </tr>
                </thead>
                <tbody>
                    <tr>        
                        <td>Title</td>
                        <td>Genre</td>
                        <td>Cast</td>
                        <td>Director</td>
                        <td>Producer</td>
                        <td>Description</td>
                        <td>TrailerPicture</td>
                        <td>TrailerVideo</td>
                        <td>MPAA_rating</td>
                        <td>Status</td>
                    </tr>
                    
                    </tbody>
              </table>
          </div>
          </center>
      </div>
    </div>
    <br><br>
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

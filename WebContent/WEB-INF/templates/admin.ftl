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
            <li><a href="#upcomingMovies">Manage Tickets</a></li>
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
                <div class="col-md-4">
                    <form id="disableUser">
                        <h4><u>Suspend User</u></h4>
                        <label>Email</label>
                        <input type="text" placeholder="email" id="email" name="email"> <br>
                        <button type="submit"  value="true" id="disable" name="disable" class="btn btn-danger">DISABLE</button>
                        <button type="submit"  value="true" id="enable" name="enable" class="btn btn-success">ENABLE</button>
                        <h5 id="message"></h5>
                        <#if noUser> <h5>This User doesn't exist. </h5 </#if>
                    </form>
                </div>
             <div class="col-md-4">
                 <form id="changeAuth">
                        <h4><u>Change Authorization</u></h4>
                        <label>Email</label>
                        <input type="text" placeholder="email" id="email" name="email"><br>
                        <label>Authorization</label>
                        <input type="text" placeholder="level" id="authorization" name="authorization">
                 <button type="submit" name="addAuth" id="addAuth"   value="true" class="btn btn-success">SUBMIT</button>
                 <h5 id="message"></h5>
                 <#if noUser> <h5>This User doesn't exist. </h5 </#if>
                 </form>
             </div>
             <div class="col-md-4">
                 <form id="removeUser">
                     <h4><u>Delete User</u></h4>
                    <label>Email</label>
                    <input type="text" placeholder="email" id="email" name="email">
                     <button type="submit"  name="deleteUser" id="deleteUser" value="true" class="btn btn-danger">DELETE</button>
                     <h5 id="message"></h5>
                     <#if noUser> <h5>This User doesn't exist. </h5 </#if>
                 </form>
             </div>
         </div>
      <div class="row">
       <br> <br>
          <div class="container">
              <center><h3><u>Users</u></h3></center>
                <table class="table">
                <thead>
                    <tr>
                        <th>User ID</th>
                        <th>Firstname</th>
                        <th>Lastname</th>
                        <th>Email</th>
                        <th>Address</th>
                        <th>Suspended</th>
                        <th>Authorization</th>
                        <th>Subscribed</th>
                    </tr>
                </thead>
                <tbody>
                <#list users as user>
                    <tr>
                        <td>${user.getUserID()}</td>
                        <td>${user.getFirstname()}</td>
                        <td>${user.getLastname()}</td>
                        <td>${user.getEmail()}</td>
                        <td>${user.getAddress()}</td>
                        <td>${user.getSuspended()}</td>
                        <td>${user.getAuthorization()}</td>
                        <td>${user.getSubscribed()}</td>
                    </tr>
                </#list>
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
          <h3 class="section-title">Manage Tickets & Promotions</h3>
          <div class="section-title-divider"></div>
        </div>
          <div class="container">
              <div class="row">
                  <div class="col-md-4">
                      <form id="createShowtime">
                          <h3><u>ADD/UPDATE SHOWTIMES</u></h3>
                          <label>MovieTitle</label><br>
                          <input type="text" placeholder="title" id="title" name="title">
                          <br>
                          <label>Theater</label><br>
                          <input type="text" placeholder="theater number" id="theater" name="theater">
                          <br>
                          <label>Month</label><br>
                          <input type="text" placeholder="05 for May" id="month" name="month">
                          <br>
                          <label>Day</label><br>
                          <input type="text" placeholder="10 for 10th" id="day" name="day">
                          <br>
                          <label>Time</label><br>
                          <input type="text" placeholder="2:30pm" id="time" name="time">
                          <br> <br>
                          <button type="submit" value="true"  class="btn btn-success" id="addShowtime" name="addShowtime">ADD SHOWTIME</button><br>
                          <br>
                          <button type="submit" value="true" class="btn btn-danger" id="deleteShowtime" name="deleteShowtime">DELETE SHOWTIME</button>
                          <h5 id="message"></h5>
                          <#if noMovie> <h5>This Movie doesn't exist or the showtime alredy exist.</h5 </#if>

                      </form>
                  </div>
                  <div class="col-md-4">
                      <h3> <u>UPDATE PRICING</u></h3>
                      <br>
                      <form id="updatePricing">

                          <h4>Current Pricing</h4>
                          <p>Adult: $${adultTicket}</p>
                          <p>Child: $${childTicket}</p>
                          <p>Booking Fee: $${bookingFee}</p>
                          <br><br>

                      <label>Adult Price</label>
                      <input type="text" placeholder="9.00" id="adultTicket" name="adultTicket">
                      <br>
                      <label>Child Price</label>
                      <input type="text" placeholder="7.00'" id="childTicket" name="childTicket">
                      <br>
                          <label>Booking Fee</label>
                          <input type="text" placeholder="7.00'" id="bookingFee" name="bookingFee">
                          <br><br>
                          <button type="submit" value="true"  class="btn btn-info" id="updatePrice" name="updatePrice">UPDATE PRICE</button>
                          <h5 id="message"></h5>
                      </form>
                  </div>
                  <div class="col-md-4">
                      <form id="createPromotion">
                          <h3><u>ADD PROMOTIONS</u></h3>
                          <label>Discount %</label> <br>
                          <input type="text" placeholder="10%" id="discount" name="discount">
                          <br>
                          <label>Expiration Date</label> <br>
                          <input type="text" placeholder="10/25/18" id="expiration" name="expiration">
                          <br><br>
                          <button type="submit" name="addPromo" id="addPromo" value="true" class="btn btn-success">ADD PROMOTION</button>
                          <h5 id="message"></h5>
                      </form>
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
    <form id="movieForm">
    
        <div class="row">
        <br>
            <div class="col-md-1"></div>
            <div class="col-md-4" align="left">
                <label>Movie Title </label>
                <input type="text" placeholder="title" id="title" name="title">
                <br>
                <#if noMovie> <h5>This Movie doesn't exist</h5> </#if>
                <h5 id="message"> </h5>


            </div>
        <center>
            <div class="col-md-6">
                <button type="submit" class="btn btn-success" name="addMovie" id="addMovie" value="true" >ADD MOVIE</button>
                <button type="submit" class="btn btn-info" id="editMovie" name="editMovie" value="true" >EDIT MOVIE</button>
                <button type="submit" class="btn btn-danger" id="deleteMovie" name="deleteMovie" value="true">DELETE MOVIE</button>
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
                    <input type="text" placeholder="seperate names with ';'" id="director" name="director">
                </div>
                <div class ="col-md-4" align="left">
                    <label>Producer </label><br>
                    <input type="text" placeholder="seperate name with ';'" id="producer" name="producer"> 
                    <br><br>
                    <label>Description </label><br>
                    <input type="text" placeholder="synopsis" id="synopsis" name="synopsis">  
                    <br><br>
                    <label>Trailer Picture </label><br>
                    <input type="text" placeholder="paste url" id="imagePath" name="imagePath">
                </div>
                <div class ="col-md-4" align="left"> 
                    <label>Trailer Video</label><br>
                    <input type="text" placeholder="paste url" id="trailerPath" name="trailerPath"> 
                    <br><br>
                    <label>Rating </label><br>
                    <input type="text" placeholder="MPAA_rating" id="rating" name="rating">
                    <br><br>
                    <label>Status </label><br>
                    <input type="text" placeholder="Status" id="nowPlaying" name="nowPlaying">
                </div>
            </div>
    
    </form>
    </div>
    <br> <br>
    <div class="row">
    <center> <h3><u>Movies</u></h3>
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
                        <th>Now Playing</th>

                    </tr>
                </thead>

                <tbody>

                <#list movies as movie>
                     <tr>
                        <td>${movie.getTitle()}</td>
                        <td>${movie.getGenre()}</td>
                        <td>${movie.getCast()}</td>
                        <td>${movie.getDirectors()}</td>
                        <td>${movie.getProducers()}</td>
                        <td>${movie.getSynopsis()}</td>
                        <td><img src="${movie.getImagePath()}" width="100" height="150"> </td>
                        <td>${movie.getTrailerPath()}</td>
                        <td>${movie.getRating()}</td>
                        <td>${movie.getNowPlaying()}</td>
                    </tr>
                </#list>
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
  <script src="Resources/js/home.js"></script>



</body>

</html>

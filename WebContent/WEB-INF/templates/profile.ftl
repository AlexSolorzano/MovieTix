<!DOCTYPE html>
<html lang="en">
<head>
<title>Profile Page</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
</head>
<script>

         $(document).ready(function()
      {
        var navItems = $('.admin-menu li > a');
        var navListItems = $('.admin-menu li');
        var allWells = $('.admin-content');
        var allWellsExceptFirst = $('.admin-content:not(:first)');
        allWellsExceptFirst.hide();
        navItems.click(function(e)
        {
            e.preventDefault();
            navListItems.removeClass('active');
            $(this).closest('li').addClass('active');
            allWells.hide();
            var target = $(this).attr('data-target-id');
            $('#' + target).show();
        });
        });
</script>

<style>
    body{
        background-color: black;
        margin-top: 40px;
        margin-bottom: 10px;
    }
    .menu{
        background-color: white;
    }
    .container {
  background: linear-gradient(rgba(255, 255, 255, .0), rgba(255, 255, 255, 0.9)), url("Resources/img/ticketStubs.jpg");
  padding: 40px 40px 40px 10px;
}
</style>
<body bgcolor="000">
<div class="container">
  
        <div class="row">
            <div class="col-md-3">
            <div class="menu">

                <ul class="nav nav-pills nav-stacked admin-menu" >
                    <li class="active"><a href="" data-target-id="profile"><i class="glyphicon glyphicon-user"></i> Profile</a></li>
                    <li><a href="" data-target-id="change-password"><i class="glyphicon glyphicon-lock"></i> Edit Profile</a></li>
                    <li><a href="" data-target-id="settings"><i class="glyphicon glyphicon-cog"></i> Settings</a></li>
                    <li><a href="" data-target-id="logout"><i class="glyphicon glyphicon-log-out"></i> Logout</a></li>
                    <li><a href="" data-target-id="logout2" ><i class="glyphicon glyphicon-log-out"></i> Go Home </a></li>
                </ul>
            </div>
            </div>

            <div class="col-md-9  admin-content" id="profile">
                <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title">Name</h3>
                    </div>
                    <div class="panel-body">
                        Ridha Ali   
                    </div>
                </div>
                <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title">Email</h3>
                    </div>
                    <div class="panel-body">
                        ridhaC00lG!rl@gmail.com
                    </div>
                </div>
                <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title">Phone Number</h3>
                    </div>
                    <div class="panel-body">
                        404-128-2901
                    </div>
                </div>
                <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title">Address</h3>
                    </div>
                    <div class="panel-body">
                        Go Dawgs Ave Apt #1 <br>
                        Athens, Ga 30605
                    </div>
                </div>
                 <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title">Last Password Change</h3>

                    </div>
                    <div class="panel-body">
                        4 days Ago
                    </div>
                </div>
                <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title">My Orders</h3>

                    </div>
                    <div class="panel-body">
                        <div class="row">
                    <div class="col-md-9"></div>
                            <div class="col-md-2">
                      <button type="button" class="btn btn-warning">REFUND TICKET</button>
                  </div>
              </div>
                        <br>
                <table class="table">
                <thead>
                    <tr>
                        <th>Ticket Number</th>
                        <th>Movie</th>
                        <th>Date Purchased</th>
                        <th>Time of Movie</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>18292</td>
                        <td>Black Panther </td>
                        <td>02/15/18</td>
                        <td>6:00pm</td>             
                    </tr>
                    </tbody>
                          </table>
                    </div>
                </div>

            </div>
            
   <div class="col-md-9  admin-content" id="settings">
                <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title">Notification</h3>
                    </div>
                    <div class="panel-body">
                        <div class="label label-success">allowed</div>
                    </div>
                </div>
                <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title">Newsletter</h3>
                    </div>
                    <div class="panel-body">
                        <div class="badge">Monthly</div>
                    </div>
                </div>
                <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title">Admin</h3>

                    </div>
                    <div class="panel-body">
                        <a href="/MovieTix/admin" class="label label-success"> <span >  Access Admin Tools  </span></a>
                    </div>
                </div>

            </div>
            <div class="col-md-9  admin-content" id="settings">
                <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title"></h3>
                    </div>
                    <div class="panel-body">
                        <div class="label label-success">allowed</div>
                    </div>
                </div>
                <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title">Newsletter</h3>
                    </div>
                    <div class="panel-body">
                        <div class="badge">Monthly</div>
                    </div>
                </div>
                <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title">Admin</h3>

                    </div>
                    <div class="panel-body">
                        <a href="/MovieTix/admin" class="label label-success"> <span >  Access Admin Tools  </span></a>
                    </div>
                </div>

            </div>

            <div class="col-md-9  admin-content" id="change-password">
                <form action="/password" method="post">

           
                    <div class="panel panel-info" style="margin: 1em;">
                        <div class="panel-heading">
                            <h3 class="panel-title"><label for="new_password" class="control-label panel-title">New Password</label></h3>
                        </div>
                        <div class="panel-body">
                            <div class="form-group">
                                <div class="col-sm-10">
                                    <input type="password" class="form-control" name="password" id="new_password" >
                                </div>
                            </div>

                        </div>
                    </div>

             
                    <div class="panel panel-info" style="margin: 1em;">
                        
                        <div class="panel-heading">
                            <h3 class="panel-title"><label for="confirm_password" class="control-label panel-title">Confirm password</label></h3>
                        </div>
                        <div class="panel-body">
                            <div class="form-group">
                                <div class="col-sm-10">
                                    <input type="password" class="form-control" name="password_confirmation" id="confirm_password" >
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-info" style="margin: 1em;">
                        
                        <div class="panel-heading">
                            <h3 class="panel-title"><label for="new_address" class="control-label panel-title">New Address</label></h3>
                        </div>
                        <div class="panel-body">
                            <div class="form-group">
                                <div class="col-sm-10">
                                    <input type="address" class="form-control" name="new_address" id="confirm_password" >
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-info" style="margin: 1em;">
                        
                        <div class="panel-heading">
                            <h3 class="panel-title"><label for="new_number" class="control-label panel-title">New Number </label></h3>
                        </div>
                        <div class="panel-body">
                            <div class="form-group">
                                <div class="col-sm-10">
                                    <input type="number" class="form-control" name="new_phone" id="new_number" >
                                </div>
                            </div>
                        </div>
                    </div>
                     

           
                    <div class="panel panel-info border" style="margin: 1em;">
                        <div class="panel-body">
                            <div class="form-group">
                                <div class="pull-left">
                                    <input type="submit" class="form-control btn btn-primary" name="submit" id="submit">
                                </div>
                            </div>
                        </div>
                    </div>

                </form>
            </div>

            <div class="col-md-9  admin-content" id="settings"></div>

            <div class="col-md-9  admin-content" id="logout">
                <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title">Confirm Logout</h3>
                    </div>
                    <div class="panel-body">
                        Do you really want to logout ?  
                        <a  href="/MovieTix/home" class="label label-danger" >
                        <!--onclick="event.preventDefault();document.getElementById('logout-form').submit()-->
                            
                            <span >   Yes   </span>
                        </a>    
                        <a href="/MovieTix/admin" class="label label-success"> <span >  No   </span></a>
                    </div>
                    <form id="logout-form" action="#" method="POST" style="display: none;">
                    </form>

                </div>
            </div>
            <div class="col-md-9  admin-content" id="logout2">
                <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title">Leave Profile</h3>
                    </div>
                    <div class="panel-body">
                       Are you sure you want to go home?  
                        <a  href="/MovieTix/home" class="label label-danger">
                            <span >  Yes </span>
                        </a>
                        <a  href="/MovieTix/profile" class="label label-success">
                            <span> No </span>
                        </a>
                      </div>

                </div>
            </div>
        </div>
    </div>
    </body>
    </html>

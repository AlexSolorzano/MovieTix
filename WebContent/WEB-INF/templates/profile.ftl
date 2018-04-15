<!DOCTYPE html>
<html lang="en">
<head>
<title>Profile Page</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
</head>
<script src="Resources/js/home.js"></script>
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
                    <li><a href="" data-target-id="home"><i class="glyphicon glyphicon-log-out"></i>Go Home</a></li>
                    <li><a href="" data-target-id="logout2"><i class="glyphicon glyphicon-log-out"></i>Logout</a></li>
                </ul>
            </div>
            </div>

            <div class="col-md-9  admin-content" id="profile">
                <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title">Name</h3>
                    </div>
                    <div class="panel-body">
                        ${name}   
                    </div>
                </div>
                <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title">Email</h3>
                    </div>
                    <div class="panel-body">
                         ${email}
                    </div>
                </div>
                <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title">Address</h3>
                    </div>
                    <div class="panel-body">
                        ${address}
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
                      <button class="btn btn-warning">REFUND TICKET</button>
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
                        <h3 class="panel-title">Promotion</h3>
                    </div>
                    <div class="panel-body">
                        <#if sub>
                             <div class="label label-success">subscribed</div> 
                        <#else>
                             <div class="label label-danger">not subscribed</div>
                        </#if>   
                    </div>
                </div>

            </div>
            <div class="col-md-9  admin-content" id="home">
                <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title">Go home</h3>
                    </div>
                    <div class="panel-body">
                        <a href="/MovieTix/home"><button class="btn btn-info" type="button">Go Home </button></a>
                        </a>
                    </div>

                </div>
            </div>

            <div class="col-md-9  admin-content" id="change-password">
                <form id="changeInfo" name="changeInfo">

           
                    <div class="panel panel-info" style="margin: 1em;">
                        <div class="panel-heading">
                            <h3 class="panel-title"><label for="new_password" class="control-label panel-title">New Password</label></h3>
                        </div>
                        <div class="panel-body">
                            <div class="form-group">
                                <div class="col-sm-10">
                                    <input type="password" class="form-control" name="new_password" id="new_password" >
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
                                    <input type="password" class="form-control" name="password_confirmation" id="password_confirmation" >
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
                                    <input type="text" class="form-control" name="new_address" id="new_address" >
                                </div>
                            </div>
                        </div>
                    </div>     
           
                    <div class="panel panel-info border" style="margin: 1em;">
                        <div class="panel-body">
                            <div class="form-group">
                                <div class="pull-left">
                                    <button class="btn btn-info" name="submitInfoChange" id="submitInfoChange">SUBMIT </button>
                                </div>
                                <br> <br>
                                <h5 id="message"></h5>
                            </div>
                        </div>
                    </div>

                </form>
            </div>

            <div class="col-md-9  admin-content" id="settings"></div>
            
            <form id="logout">
            <div class="col-md-9  admin-content" id="logout2">
                <div class="panel panel-info" style="margin: 1em;">
                    <div class="panel-heading">
                        <h3 class="panel-title">Log out</h3>
                    </div>
                    <div class="panel-body">
                       Are you sure you want to go home?  <br> <br>
                        <button class="btn btn-info" type="submit" name="logout" id="logout" value="true">LOG OUT</button>
                        </a>
                    </div>

                </div>
            </div>
            </form>
        </div>

    </div>
    </body>
    </html>

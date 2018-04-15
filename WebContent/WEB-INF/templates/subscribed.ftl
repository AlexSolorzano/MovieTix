<!DOCTYPE html>
<html lang="en">
<head>
<title>Subscribed</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <style src="Resources/css/style.css type="text/css"></style>
<!------ Include the above in your HEAD tag ---------->
</head>


<body>    
<style>    
    body{
        background-color: black;
        margin-top: 20px;
        margin-bottom: 15px;
        margin-left: 15px;
        margin-right: 15px;
        margin: auto;
    }
    .container {
  background: linear-gradient(rgba(255, 255, 255, .0), rgba(255, 255, 255, 0.9)), url("Resources/img/popcorn.jpg");
  padding: 150px 50px 100px 50px;
}
</style>
    <div>
        <br>
        <br>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-1">
            </div>           
            <div class="col md-5">
                 <div class="panel-group">
                    <div class="panel panel-default">
                    <div class="panel-heading"><center><h3>Subscribed Confirmation Confirmation</h3></center> </div>
                        
                    <div class="panel-body"><center><h4>Thank you for wanting to subscribe. <br> Enter your email below to be added to the list. <br> Note, you must be a registered user. </h4><br>
                        <form> 
                        <input type="text" placeholder="Email" name="email">
                        <button type="submit" class="btn btn-success">SUBMIT</button>
                        </form>
                        <br>
                        <br>
                        <#if vMsg>
                            <p> You're not registered as user, please register and then comeback. <br>Thank you!</p> 
                        </#if>    
                        
                       <a href="/MovieTix/home"> <button type="button" class="btn btn-primary"> HOME</button></a> 
                        </center></div>
                </div>
                </div>
           </div>
            <div class="col-md-4"></div>
        </div>
    </div>
    </body>
</html>

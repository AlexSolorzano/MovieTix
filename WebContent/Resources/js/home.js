    $(document).ready(function()
    {                
        $("#submitSignUp").click(function(event)
        {
            var email = $("#emailInput").val();
            var firstName= $("#firstNameInput").val();
            var lastName= $("#lastNameInput").val();
            var psswd = $("#psswd").val();
            var psswdCon = $("#psswdCon").val();
            
           if( email=="")
                {
                    event.preventDefault();
                     $("#message").html("Please fill out all indicated fields!");
                }
            else if( firstName=="")
                {
                    event.preventDefault();
                     $("#message").html("Please fill out all indicated fields!");
                }
            else if( lastName=="")
                {
                    event.preventDefault();
                     $("#message").html("Please fill out all indicated fields!");
                }
           else if(psswd=="")
                {
                    event.preventDefault();
                    $("#message").html("Please fill out all indicated fields!");
                }
            else if(psswdCon=="")
                {
                    event.preventDefault();
                    $("#message").html("Please fill out all indicated fields!");
                }
            else if(psswdCon!==psswd)
                {
                    event.preventDefault();
                    $("#message").html("Passwords don't match. Please try again.");
                }
            else{
                    $("#signupform").submit();

            }
                
        }
        ); 
    }
    );

    //Payment Details
    $(document).ready(function()
        {
            $("#savePayment").click(function(event)
                {
                    $("#payment-form").submit();

                }
            );
        }
    );

    $(document).ready(function()
        {
            $("#addMovie").click(function(event)
                {
                    $("#movieForm").submit();


                }
            );
        }
    );
$(document).ready(function()
    {                
        $("#submitSignIn").click(function(event)
        {
            var username = $("#username").val();
            var psswd = $("#password").val();
            
           if(!username)
                {
                    event.preventDefault();
                     $("#message1").html("Please fill out all indicated fields!");
                }
            else if(!psswd)
                {
                    event.preventDefault();
                     $("#message1").html("Please fill out all indicated fields!");
                }
            else{
                    $("#loginform").submit();

            }
                
        }
        ); 
    }
    );

$(document).ready(function()
    {
        $("#editMovie").click(function(event)
        {
            var title = $("#title").val();
            var genre= $("#genre").val();
            var cast= $("#cast").val();
            var producer = $("#producer").val();
            var director = $("#director").val();
            var synopsis = $("#synopsis").val();
            var picturePath= $("#picturePath").val();
            var trailerPath= $("#trailerPath").val();
            var rating = $("#rating").val();
            var nowPlaying = $("#nowPlaying").val();

            var count =0;

            if(genre!="")
            {
                count++;
            }
            if(cast!="")
            {
                count++;
            }
            if(producer!="")
            {
                count++;
            }
            if(director!="")
            {
                count++;
            }
            if(synopsis!="")
            {
                count++;
            }
            if(picturePath!="")
            {
                count++;
            }
            if(trailerPath="")
            {
                count++;
            }
            if(rating!="")
            {
                count++;
            }
            if(nowPlaying!="")
            {
                count++;
            }

            if(title=="")
            {
                event.preventDefault();
                $("#message").html("Please fill out a title");
            }
            else if( (genre=="") && (cast=="") && (producer=="") && (director=="")
                && (synopsis=="") && (picturePath=="") && (trailerPath=="") &&
                (rating=="") && (nowPlaying=="") )
            {
                event.preventDefault();
                $("#message").html("Please indicate which field you want to edit. ");
            }
            else if(count>1)
            {
                event.preventDefault();
                $("#message").html("You can only edit one thing at a time. Please try again. ");
            }
            else
            {
                $("#movieForm").submit();
            }

        }
        );
    }
    );

    //UPDATE PRICING
    $(document).ready(function()
        {
            $("#updatePrice").click(function(event)
                {
                    var adultTicket = $("#adultTicket").val();
                    var childTicket= $("#childTicket").val();
                    var bookingFee= $("#bookingFee").val();
                    if ( (adultTicket=="" && adultTicket!= "") && (childTicket=="" && childTicket != "")
                        && (bookingFee=="" && bookingFee != ""))
                        {
                            event.preventDefault();
                            $("#message").html("Please fill out one of the sections");
                        }
                    else
                        $("#updatePricing").submit();

                }
            );
        }
    );




//PROFILE EDIT SECTION
$(document).ready(function()
    {                
        $("#submitInfoChange").click(function(event)
        {
            var pssd = $("#new_password").val();
            var pssdCon= $("#password_confirmation").val();
            
           
            if(pssd=="" && pssdCon != "")
                {
                    event.preventDefault();
                    $("#message").html("Please fill out both 'password' and 'password confirmation' ");
                }
            else if(pssdCon=="" && pssd != "")
                {
                    event.preventDefault();
                    $("#message").html("Please fill out both 'password' and 'password confirmation' ");
                }
            else if(pssdCon!==pssd)
                {
                    event.preventDefault();
                    $("#message").html("Passwords don't match. Please try again.");
                }
            else{
                    $("#changeInfo").submit();

            }
                
        }
        ); 
    }
    );

    //SUBMIT NEW SHOWTIME
    $(document).ready(function()
        {
            $("#addShowTime").click(function(event)
                {
                    var title = $("#title").val();
                    var theater= $("#theater").val();
                    var month= $("#month").val();
                    var day= $("#day").val();
                    var time= $("#time").val();

                    if(title=="" && title != "")
                    {
                        event.preventDefault();
                        $("#message").html("Please fill out all indicated fields ");
                    }
                    else if(theater=="" && theater != "")
                    {
                        event.preventDefault();
                        $("#message").html("Please fill out all indicated fields ");
                    }
                    else if(month=="" && month != "")
                    {
                        event.preventDefault();
                        $("#message").html("Please fill out all indicated fields ");
                    }
                    else if(day=="" && day != "")
                    {
                        event.preventDefault();
                        $("#message").html("Please fill out all indicated fields ");
                    }
                    else if(time=="" && time != "")
                    {
                        event.preventDefault();
                        $("#message").html("Please fill out all indicated fields ");
                    }
                    else{
                        $("#createShowtime").submit();

                    }

                }
            );
        }
    );


    //DELETE SHOWTIME
    $(document).ready(function()
        {
            $("#deleteShowtime").click(function(event)
                {
                    var title = $("#title").val();
                    var theater= $("#theater").val();
                    var month= $("#month").val();
                    var day= $("#day").val();
                    var time= $("#time").val();

                    if(title=="" && title != "")
                    {
                        event.preventDefault();
                        $("#message").html("Please fill out all indicated fields ");
                    }
                    else if(theater=="" && theater != "")
                    {
                        event.preventDefault();
                        $("#message").html("Please fill out all indicated fields ");
                    }
                    else if(month=="" && month != "")
                    {
                        event.preventDefault();
                        $("#message").html("Please fill out all indicated fields ");
                    }
                    else if(day=="" && day != "")
                    {
                        event.preventDefault();
                        $("#message").html("Please fill out all indicated fields ");
                    }
                    else if(time=="" && time != "")
                    {
                        event.preventDefault();
                        $("#message").html("Please fill out all indicated fields ");
                    }
                    else{
                        $("#createShowtime").submit();

                    }

                }
            );
        }
    );
    //ADDS PROMO
    $(document).ready(function()
        {
            $("#addPromo").click(function(event)
                {
                    var discount = $("#discount").val();
                    var expiration = $("#expiration").val();
                    if(discount=="" && discount != "")
                     {
                          event.preventDefault();
                          $("#message").html("Please fill out all indicated fields ");
                     }
                    else if(expiration=="" && expiration != "")
                    {
                        event.preventDefault();
                        $("#message").html("Please fill out all indicated fields ");
                    }
                     else {
                           $("#createPromotion").submit();
                    }
                }
            );
        }
    );

    //DISABLE USER
    $(document).ready(function()
        {
            $("#disable").click(function(event)
                {
                    var email = $("#email").val();
                    if(email=="" && email != "")
                    {
                        event.preventDefault();
                        $("#message").html("Please fill out the user email ");
                    }
                    else {
                        $("#disableUser").submit();
                    }
                }
            );
        }
    );
    //ENABLE USER
    $(document).ready(function()
        {
            $("#enable").click(function(event)
                {
                    var email = $("#email").val();
                    if(email=="" && email != "")
                    {
                        event.preventDefault();
                        $("#message").html("Please fill out the user email ");
                    }
                    else {
                        $("#disableUser").submit();
                    }
                }
            );
        }
    );

    //CHANGE AUTHORIZATION
    $(document).ready(function()
        {
            $("#addAuth").click(function(event)
                {
                    var email = $("#email").val();
                    var auth = $("#authorization").val();
                    if(email=="" && email != "")
                    {
                        event.preventDefault();
                        $("#message").html("Please fill out the user email");
                    }
                    else if(auth=="" && auth != "")
                    {
                        event.preventDefault();
                        $("#message").html("Please fill out the authentication level");
                    }
                    else {
                        $("#changeAuth").submit();
                    }
                }
            );
        }
    );


    //DELETE USER
    $(document).ready(function()
        {
            $("#deleteUser").click(function(event)
                {
                    var email = $("#email").val();
                    if(email=="" && email != "")
                    {
                        event.preventDefault();
                        $("#message").html("Please fill out the user email");
                    }
                    else {
                        $("#removeUser").submit();
                    }
                }
            );
        }
    );



    //TRAVELS TO MOVIE PAGE
    $(document).ready(function()
        {
            $("#goToMovie").click(function(event)
                {
                    $("#sendMovie").submit();
                }
            );
        }
    );
    //TRAVELS TO TICKET
    $(document).ready(function()
        {
            $("#buyMovie").click(function(event)
                {
                    $("#buyTicket").submit();
                }
            );
        }
    );
    //TRAVELS To SEATING
    $(document).ready(function()
        {
            $("#selectShowtime").click(function(event)
                {
                    $("#showtime").submit();
                }
            );
        }
    );
    //travels to purchasing
    $(document).ready(function()
        {
            $("#pickSeatA").click(function(event)
                {
                    $("#seatingA").submit();
                }
            );
        }
    );
    $(document).ready(function()
        {
            $("#pickSeatB").click(function(event)
                {
                    $("#seatingB").submit();
                }
            );
        }
    );
    $(document).ready(function()
        {
            $("#pickSeatC").click(function(event)
                {
                    $("#seatingC").submit();
                }
            );
        }
    );
    $(document).ready(function()
        {
            $("#pickSeatD").click(function(event)
                {
                    $("#seatingD").submit();
                }
            );
        }
    );
    //Adds Child Price
    $(document).ready(function()
        {
            $("#addTicketC").click(function(event)
                {
                    $("#pickTicketC").submit();
                }
            );
        }
    );
    //Adds Adult Price
    $(document).ready(function()
        {
            $("#addTicketA").click(function(event)
                {
                    $("#pickTicketA").submit();
                }
            );
        }
    );

    //SUBMIT
    $(document).ready(function()
        {
            $("#submitOrder").click(function(event)
                {
                    $("#submitAll").submit();
                }
            );
        }
    );
    $(document).ready(function()
        {
            $("#refundButton").click(function(event)
                {
                    $("#refundForm").submit();
                }
            );
        }
    );



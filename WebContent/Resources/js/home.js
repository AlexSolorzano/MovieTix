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
                    $("#submitInfoChange").submit();

            }
                
        }
        ); 
    }
    );
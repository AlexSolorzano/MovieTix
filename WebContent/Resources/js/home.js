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
            
           if( username=="")
                {
                    event.preventDefault();
                     $("#message1").html("Please fill out all indicated fields!");
                }
            else if( psswd=="")
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


filterSelection("all")function filterSelection(c) {
  var x, i;
  x = document.getElementsByClassName("filterDiv");
  if (c == "all") c = "";
  for (i = 0; i < x.length; i++) {
    w3RemoveClass(x[i], "show");
    if (x[i].className.indexOf(c) > -1) w3AddClass(x[i], "show");
  }
}

function w3AddClass(element, name) {
  var i, arr1, arr2;
  arr1 = element.className.split(" ");
  arr2 = name.split(" ");
  for (i = 0; i < arr2.length; i++) {
    if (arr1.indexOf(arr2[i]) == -1) {element.className += " " + arr2[i];}
  }
}

function w3RemoveClass(element, name) {
  var i, arr1, arr2;
  arr1 = element.className.split(" ");
  arr2 = name.split(" ");
  for (i = 0; i < arr2.length; i++) {
    while (arr1.indexOf(arr2[i]) > -1) {
      arr1.splice(arr1.indexOf(arr2[i]), 1);     
    }
  }
  element.className = arr1.join(" ");
}

// Add active class to the current button (highlight it)
var btnContainer = document.getElementById("myBtnContainer");
var btns = btnContainer.getElementsByClassName("btn");
for (var i = 0; i < btns.length; i++) {
  btns[i].addEventListener("click", function(){
    var current = document.getElementsByClassName("active");
    current[0].className = current[0].className.replace(" active", "");
    this.className += " active";
  });
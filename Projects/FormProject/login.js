

btn.addEventListener("click",function(e){

    e.preventDefault();
    let name=document.getElementById("name");

    let password=document.getElementById("password");
    
    let btn=document.getElementById("btn");


    let formdata=JSON.parse(localStorage.getItem("formdatas"))
let loginsuccessfull=false;

let usernameExists=false;
let passwordmatchng=false;


    for(let i=0;i<formdata.length;i++)
    {
       let uname= formdata[i].name
       let upass=formdata[i].password

       if(name.value===""){
        document.getElementById("namepara").innerHTML="Enter the UserName";
        document.getElementById("namepara").style.color="red";
       }
       
        if(name.value!=="")
       { 
      
        if(uname!==name.value)
         {
            document.getElementById("namepara").innerHTML="Login userid is not matching";  
            document.getElementById("namepara").style.color="red";
         }
          
            if(uname===name.value)
            {
                document.getElementById("namepara").style.color="none";
                usernameExists=true;
                 if(password.value==="")
                {
                    document.getElementById("passpara").innerHTML="Enter the Password";
                    document.getElementById("passpara").style.color="red";
                }
                 else if(password.value!=="")
                {
                  
                   if(password.value===upass)
                   {
                    document.getElementById("passpara").style.color="none";
                    passwordmatchng=true;
                    loginsuccessfull=true;
                    break;
                   }
                   else if(upass!==password.value)
                   {
                    document.getElementById("passpara").innerHTML="Login password is not matching";  
                    document.getElementById("passpara").style.color="red";
                   }

                }

                
            }
            

       }
    }
    if(usernameExists==true )
        {
          if(passwordmatchng==true)
          {
            alert("login successfull");
          }
        }
  
})


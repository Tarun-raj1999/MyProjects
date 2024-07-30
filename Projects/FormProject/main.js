let name=document.getElementById("name");
let email=document.getElementById("email");


let password=document.getElementById("password");
let repassword=document.getElementById("repassword");

let btn=document.getElementById("btn");





btn.addEventListener("click",function(e){

   usernamecorrect=false;
   emailcorrect=false;
   passwordcorrect=false;
   Retypass=false;

    

    e.preventDefault();

    if(name.value==="")
    {
       document.getElementById("namepara").innerHTML="Enter the UserName";
       document.getElementById("namepara").style.color="red";
      
    }
    else if(name.value!==""){
        document.getElementById("namepara").style.color="none";
        usernamecorrect=true;
    }

    
    if(email.value==="")
        {
           document.getElementById("emailpara").innerHTML="Enter the Email";
           document.getElementById("emailpara").style.color="red";
        }
        else if(email.value!==""){
            document.getElementById("emailpara").style.color="none";
            emailcorrect=true;
        }

        if(password.value==="")
            {
               document.getElementById("passpara").innerHTML="Enter the Password";
               document.getElementById("passpara").style.color="red";
            }
            else if(password.value!==""){
                if(password.value.length>8)
                    {
                        document.getElementById("passpara").innerHTML="Password length sholud be only 8";
                        document.getElementById("passpara").style.color="red";
                    }
                else{
                    document.getElementById("passpara").style.display="none";
                    passwordcorrect=true;
                }
               
            }   
             
            if(repassword.value==="")
                {
                   document.getElementById("repasspara").innerHTML="Enter the Re-Type Password";
                   document.getElementById("repasspara").style.color="red";
                }
                else if(password.value!==""){
                    
                  if(password.value!==repassword.value)
                    {
                        document.getElementById("repasspara").innerHTML="Password is not matching";
                        document.getElementById("repasspara").style.color="red";
                    }
                   
                    else{
                        document.getElementById("repasspara").style.display="none";
                        Retypass=true;
                    }
                   
                }
                if(usernamecorrect==true && passwordcorrect==true && Retypass==true && emailcorrect==true)
                    {
                        location.href="./login.html";
                    } 
                  

                let obj={
                    name:name.value,
                    password:password.value,
                    email:email.value,

                }

                setFormData(obj);
               

   
})


function setFormData(data){


    let formdata=JSON.parse(localStorage.getItem("formDatas"))||[]

    formdata.push(data);
localStorage.setItem("formdatas",JSON.stringify(formdata));    

}
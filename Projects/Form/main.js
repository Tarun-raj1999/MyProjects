let name=document.getElementById("name");

let password=document.getElementById("password");


let repassword=document.getElementById("repassword");

let email=document.getElementById("email");
let phnum=document.getElementById("phnum");


let namepara=document.getElementById("namepara");
let passpara=documemnt.getElementById("passpara")
let repasspara=document.getElementById("repasspara");
let emailpara=document.getElementById("emailpara");
let phnumpara=document.getElementById("phnumpara");

let btn=document.getElementById("btn");




     if(repassword.value!==password.value)
            {
                repasspara.innerHTML="Password is not matching"
                repasspara.innerHTML.style.color="red";
            }else{
                repasspara.style.display="none";
            }


btn.addEventListener("click",function(e){

    e.preventDefault();

    if(name.value===""){
       
        namepara.innerHTML="no username";
        namepara.style.color="red";
        }          


   
   let obj={
    name:name.value,
    password:password.value,
    repassword: repassword.value,
    email:email.value,
    phnum:phnum.value

   }

   storage(obj);
location.href="./login.html";

})



function storage(data){
let formdata=JSON.parse(localStorage.getItem("formdatas"))||[];

formdata.push(data);

localStorage.setItem("formdatas",JSON.stringify(formdata));

}
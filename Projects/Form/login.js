
let btn=document.getElementById("btn");

btn.addEventListener("click",function(){
let name=document.getElementById("name").value;
let password=document.getElementById("password").value;


let formdata=JSON.parse(localStorage.getItem("formdatas"));
let loginSuccessful=false;
let usernameexists=false;
let passwordcorrect=false;

for(let i =0;i<formdata.length;i++)
{
    let uname=formdata[i].name;
    let upass=formdata[i].password;

    if(uname===name)
    {
        usernameexists=true;
        if(password===upass)
        {
            passwordcorrect=true;
            loginSuccessful=true;
            break;
        }
    }

}

if(name=="")
{
    alert("Enter the username");
}else if(password==""){
alert("Enter the password")
}
else if(loginSuccessful)
{
    alert("login successful")
    location.herf="home.html"
}
else if(!usernameexists)
{
    alert("username not correct")
}
else if(!passwordcorrect)
{
    alert("password not correct");
}


})


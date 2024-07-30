let name=document.getElementById("name").value;

let pass=document.getElementById("pass").value;




let formDatas=JSON.parse(localStorage.getItem("formDatas"));


let loginSuccessful=false;
let usernameavailable=false;
let passwordMatches=false;





for(let i=0;i<=formDatas.length;i++)
{
    let uname=formDatas[i].username;
let upass=formDatas[i].Password;


console.log(uname=name)
    if(uname===name)
    {
    
   alert("Username correct")
        usernameavailable=true;
        if(upass==pass)
        {
           
            passwordMatches=true;
            loginSuccessful=true;
            break;
        }
    }
}

if(loginSuccessful)
{
   alert("login successfull")
   
}else if(!usernameavailable){
    alert("username is not correct");
}
else if(!passwordMatches)
{
    alert("password is not correct");
}

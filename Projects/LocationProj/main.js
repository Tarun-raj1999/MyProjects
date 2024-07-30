let name=document.getElementById("name");

let pass=document.getElementById("pass");

let email=document.getElementById("email");

let phnum=document.getElementById("phnum");

let Repass=document.getElementById("Repass");


let btn=document.getElementById("btn");


btn.addEventListener("click",function(){

let obj={
    username:name.value,
    Password:pass.value,
    Email:email.value,
    Phonenum:phnum.value,
    Repass:Repass.value

}

window.location.assign=("login.html");

})


function setFormData(data){
    let formData=JSON.parse(localStorage.getItem("formDatas"))||[]

    formData.push(data)

    localStorage.setItem("formDatas",JSON.stringify(formData));
}



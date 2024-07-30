let name=document.getElementById("name");


let btn=document.getElementById("btn");

btn.addEventListener("click",function(e){

    e.preventDefault();
    if(name.value===""){
       
    namepara.innerHTML="no username";
    namepara.style.color="red";
    }
})
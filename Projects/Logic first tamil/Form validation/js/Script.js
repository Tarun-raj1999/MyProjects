const form=document.getElementById("form");
const username=document.getElementById("username");
const email=document.getElementById("email");
const password=document.getElementById("password");
const reenter=document.getElementById("password");

function checkRequired(inputs){
    inputs.forEach(input =>{
        if(input.value.trim()===""){
            errorInput(input, "please fill")
        }else{
            successInput(input)
        }
    })
}

function errorInput(input,message){}
function successInput(input){
const formGroup=input.parentElement
formGroup.className="Form-group success";
const p=formGroup.querySelector('p')
p.innerHtml="";
}
form.addEventListener("submit", function(e){
    e.preventDefault();
    checkRequired([username,email,password,reenter])
})



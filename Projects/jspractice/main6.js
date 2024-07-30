let cart=document.getElementById("cart");

let cart_content=document.getElementById("cart-increordecre")


cart.addEventListener("click",function(){

cart.style.display="none";

display()
})


function display(){

cart_content.innerHTML=`<div id="btn" style="display:flex; ">
<button onclick="incre()" style="margin:10px; ">+</button>
 <p id="count" style="margin:10px; font-size:20px ">0</p>
            <button onclick="decre()" style="margin:10px; ">-</button>
           
</div> `

}



let countt=0;
function incre(){

  let count=  document.getElementById("count");

count.innerHTML=countt+=1;
}

function decre(){

    let count=  document.getElementById("count");


    count.innerHTML=countt-=1;


let btn=document.getElementById("btn")
if(count.innerHTML==0){


btn.style.display="none";
cart.style.display="block";

}
  
  }
  



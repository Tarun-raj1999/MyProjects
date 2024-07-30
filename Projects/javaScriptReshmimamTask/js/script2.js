
let change=document.getElementById("change");






change.addEventListener('click',function(){
  
    let arr=["images/card1img.jpg","images/card2img.jpg","images/card3img.jpg","images/card4img.jpg"]
    let rand=Math.floor(Math.random()*arr.length);
    console.log(rand);
document.getElementById("img1").src=arr[rand];

})







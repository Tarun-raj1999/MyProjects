let card_section=document.getElementById("card-section");
let inp=document.getElementById("inp-val");

function createpost()
{
storevalue=inp.value
post()
}


function post(){

   
    let images=["images/pexels-alex-qian-1180283-2343465.jpg","images/pexels-amelia-hallsworth-5461644.jpg","images/pexels-bemistermister-2442904.jpg"
        ,"images/pexels-charlotte-may-5825527.jpg","images/pexels-divinetechygirl-1181359.jpg"]

        let rand=(Math.floor(Math.random()*images.length))

        card_section.innerHTML+=`<div class="card-col">
        <div class="image">
        <img src=${images[rand]} style="width:100px">
        </div>
          <p>${storevalue}</p>
<button onclick="deletePost(this)">delete</button>
        </div>
        `

        
}


function deletePost(e)
{
e.parentElement.remove();
}
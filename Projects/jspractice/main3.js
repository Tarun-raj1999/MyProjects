let card_content=document.getElementById("card-content");

let arr=[{
id:1,
type:"veg",
food:"dosa"
},
{
id:2,
type:"veg",
food:"poori"
},
{
id:3,
type:"non-veg",
food:"chicken"
}

]

display(arr)

function display(data){

data.forEach(function(e){

    card_col=document.createElement("div");
    card_col.classList.add("col");
    card_content.appendChild(card_col);

    let foodna=document.createElement("p");
    foodna.innerHTML=e.food;
    card_col.appendChild(foodna);

    let foodtype=document.createElement("h4");
    foodtype.innerHTML=e.type;
    card_col.appendChild(foodtype);

})
}

function veg()
{

  let x=  arr.filter(function(e){

        return e.type==="veg";
    })
 

let a=document.querySelectorAll(".col");

let rem=a.forEach(function(e){

    e.remove();
})

display(x);
}


function relevance()
{
  
   let a=document.querySelectorAll(".col");

   a.forEach(function(e){
e.remove()
   })
   display(arr);
}
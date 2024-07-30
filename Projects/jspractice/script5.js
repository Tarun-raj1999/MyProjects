let card_content=document.querySelector(".card-content")

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

function display(data)
{

    data.forEach(function(e){
  let col=document.createElement("div");
  col.classList.add("food-items");
card_content.appendChild(col);

let foodna=document.createElement("p");
foodna.innerHTML=e.food;
col.appendChild(foodna);

let foodtype=document.createElement("h4")
foodtype.innerHTML=e.type;
col.appendChild(foodtype);




    })
}



function veg()
{
let x=    arr.filter(function(e){
return e.type==="veg";
    })

let a=document.querySelectorAll(".food-items")

a.forEach(function(e){
e.remove();
})
display(x);
}


function relevance()
{
let a=document.querySelectorAll(".food-items")

a.forEach(function(e){
    e.remove()
})

display(arr);
}
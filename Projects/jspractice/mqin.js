let card_content=document.getElementById("card-content")

let arr=[
{
id:1,
type:"veg",
foodname:"Dosa"


},
{
    id:2,
    type:"veg",
    foodname:"poori"
},
{
    id:3,
    type:"non veg",
    foodname:"Biriyani"
}


]


display(arr)

function display(data){

    data.forEach(function (e){
     let cardcol=document.createElement("div");
     cardcol.classList.add("card-col");
     card_content.appendChild(cardcol);


     let foodna=document.createElement("p");
foodna.innerHTML=e.foodname;
cardcol.appendChild(foodna);

let foodtype=document.createElement("h4");
foodtype.innerHTML=e.type;
cardcol.appendChild(foodtype);

    });
}




function veg(){

 let x=  arr.filter(function(e){

        return e.type==="veg";
    })
    console.log(x);
let a=document.querySelectorAll(".card-col");

     a.forEach(function(e){
  e.remove();
     })
    display(x);


}


function relevance(){
    let a=document.querySelectorAll(".card-col");

    a.forEach(function(e){
 e.remove();
    })
   display(arr);

}



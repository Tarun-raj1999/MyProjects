const stars=document.querySelectorAll('.star');
const current_rating=document.querySelector('.current_rating')
stars.forEach((star,index)=>{
 
star.addEventListener('click',()=>{

    let current_star=index+1;
  current_rating.innerText=`${current_star} out of 5`;
 
  stars.forEach((star,i)=>{
if(current_star>=i+1){
    star.innerHTML='&#9733;';
}
else{
    star.innerHTML='&#9734;'
}

  });

})
    
})


const btncart=document.querySelector('#cart-icon');
const cart=document.querySelector('.cart');
const btnclose=document.querySelector('.cart-close');

btncart.addEventListener('click',()=>{
    cart.classList.add('cart-active');
});

btnclose.addEventListener('click',()=>{
     cart.classList.remove('cart-active');

});


document.addEventListener('DOMContentLoaded',loadfood);

function loadfood()
{
  
    loadContent();
}

function loadContent()
{
let btnRemove=document.querySelectorAll('.cart-remove');
btnRemove.forEach((btn)=>{
    btn.addEventListener('click',removeItem);
})
let qtnElement=document.querySelectorAll('.cart-quantity');
qtnElement.forEach((input)=>{
input.addEventListener('change',changeQty)

});

let cartBtns=document.querySelectorAll('.add-cart')
cartBtns.forEach((btn)=>{
    btn.addEventListener('click',addCart)
});
updatetotal();
}

function removeItem()
{
    let title=this.parentElement.querySelector('.cart-food-title').innerHTML;
    itemList=itemList.filter(el=>el.title!=title)
 this.parentElement.remove();
loadContent();

}

let itemList=[];

function changeQty()
{
    if(isNaN(this.value) || this.value<1){
        this.value=1;
    }

}

function addCart()
{
  
let food=this.parentElement;
let title=food.querySelector('.food-title').innerHTML;

let price=food.querySelector('.food-price').innerHTML;
let imgsrc=food.querySelector('.food-img').src;

let newProduct={title,price,imgsrc}
if(itemList.find(el=>el.title==newProduct.title)){

    alert("product already added in cart")
    return;
}
else{
        itemList.push(newProduct);
    }



let newProductElement=createCartProduct(title,price,imgsrc);
let element=document.createElement('div');
element.innerHTML=newProductElement;
let cartBasket=document.querySelector('.cart-content');
cartBasket.append(element)
loadContent();

}

function createCartProduct(title,price,imgsrc)
{
return ` <div class="cart-box">
<img src="${imgsrc}" class="cart-img">
<div class="detail-box">
    <div class="cart-food-title">${title}</div>
    <div class="price-box">
        <div class="cart-price">${price}</div>
        <div class="cart-amt">${price}</div>
    </div>
    <input type="number" value="1" class="cart-quantity">
</div>
<ion-icon name="trash-outline" class="cart-remove"></ion-icon>



</div>`;

}

function updatetotal()
{

    const cartItems=document.querySelectorAll('.cart-box');
    const totalValue=document.querySelector('.total-price');

    let total=0;

    cartItems.forEach(product=>{
  let priceElement=product.querySelector('.cart-price');
  let price=parseFloat(priceElement.innerHTML.replace("RS.","")); 

  let qty=product.querySelector('.cart-quantity').value;
  total+=(price*qty);
  product.querySelector('.cart-amt').innertext="Rs."+price*qty;
    });

    totalValue.innerHTML='Rs.'+total;

}





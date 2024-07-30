const data = [
    {
      id: 1,
      name: "Fire Boltt Ninja 2",
      img: "https://m.media-amazon.com/images/I/617eiZeFtNL._SL1500_.jpg",
      amt: 1599,
      seller: "Boltt Store",
      catagory: "Watch",
    },
  
    {
      id: 2,
      name: "Noise Pulse Go",
      img: "https://m.media-amazon.com/images/I/61akt30bJsL._SL1500_.jpg",
      amt: 1300,
      seller: "Noise Store",
      catagory: "Watch",
    },
  
    {
      id: 3,
      name: "boAt Xtend Pro",
      img: "https://m.media-amazon.com/images/I/61ZuL8CUigL._SL1500_.jpg",
      amt: 2799,
      seller: "Rajesh Watchs",
      catagory: "Watch",
    },
    {
      id: 4,
      name: "Lenovo Tab M8",
      img: "https://m.media-amazon.com/images/I/71SvqTFPXJL._SL1500_.jpg",
      amt: 9270,
      seller: "Stonehenge Retail",
      catagory: "Tablets",
    },
    {
      id: 5,
      name: "Honor PAD X8",
      img: "https://m.media-amazon.com/images/I/710G-VKcgtL._SL1500_.jpg",
      amt: 12999,
      seller: "Honor india",
      catagory: "Tablets",
    },
  
    {
      id: 6,
      name: "IKALL N9 ",
      img: "https://m.media-amazon.com/images/I/7185GL6hPlL._SL1500_.jpg",
      amt: 3999,
      seller: "IKALL Store",
      catagory: "Tablets",
    },
  
    {
      id: 7,
      name: "Oppo Pad Air",
      img: "https://m.media-amazon.com/images/I/513FD4w8hGL._SL1500_.jpg",
      amt: 15999,
      seller: "Oppo Store",
      catagory: "Tablets",
    },
    {
      id: 8,
      name: "Acer EK220Q",
      img: "https://m.media-amazon.com/images/I/8150iUXkc5L._SL1500_.jpg",
      amt: 6249,
      seller: "Accer Store",
      catagory: "Monitors",
    },
    {
      id: 9,
      name: "Samsung 24",
      img: "https://m.media-amazon.com/images/I/81TjRLHaz1L._SL1500_.jpg",
      amt: 9799,
      seller: "Samsung Store",
      catagory: "Monitors",
    },
  
    {
      id: 10,
      name: "ZEBRONICS AC32FHD ",
      img: "https://m.media-amazon.com/images/I/813Y1TIZwfL._SL1500_.jpg",
      amt: 12799,
      seller: "ZEBRONICS Store",
      catagory: "Monitors",
    },
  ];
  

  const productsContainer=document.querySelector(".products");
  const categoryList=document.querySelector(".category-list");

  function displayProducts(products){

   const product_details=products.map((product)=>`   <div class="product">
                <div class="img">
                <img src="${product.img}" alt="${product.name}">
            </div>
            <div class="product-details">
            <span class="name">${product.name}</span>
            <span class="amt">${product.amt}</span>
            <span class="seller">${product.seller}</span>
            </div>
        </div>`).join("");
       // console.log(product_details);
        productsContainer.innerHTML=product_details;

  }

function setCategories(){
const allCategories=data.map((product)=> product.catagory)

//console.log(allCategories)
const categories=[
    "All",
    ...allCategories.filter((product,index)=>{
        return allCategories.indexOf(product)===index;
    })
];
//console.log(categories);
categoryList.innerHTML=categories.map((catagory)=>`<li>${catagory}<li>`).join("");

categoryList.addEventListener("click",(e)=>{
    const selectedCategory=e.target.textContent;
   selectedCategory==="All"? displayProducts(data): displayProducts(data.filter((product)=>product.catagory== selectedCategory));
})

}
const privevalue=document.querySelector("#priceRange");
const pricevalue=document.querySelector(".priceValue");

function setPrices(){

    const priceList=data.map((product)=>product.amt);
    console.log(priceList);
    const minPrice=Math.min(...priceList);


    const maxPrice=Math.max(...priceList);
    priceRange.max=maxPrice;
    priceRange.min=minPrice;
    pricevalue.textContent="Rs." +maxPrice;

    priceRange.addEventListener("input",(e)=>{
        pricevalue.textContent="Rs." +e.target.value;
        displayProducts(data.filter((product)=>product.amt<=e.target.value));
    })
  
   
}

const textSearch=document.querySelector("#textSearch");

textSearch.addEventListener("keyup",(e)=>{
    const value=e.target.value.toLowerCase().trim();
  if(value){
    displayProducts(data.filter((product)=>product.name.toLowerCase().indexOf(value)!==-1));
  }
  else{
    displayProducts(data);
  }
})

  displayProducts(data);
  setCategories();
  setPrices()
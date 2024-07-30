

function updateClock(){

let Months=["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"];

let Weekdays=["Sun","Mon","Tue","Wed","Thu","Fri","Sat"]
    let Today=new Date();
    let d=Today.getDate();
    let m=Months[Today.getMonth()];
    let y=Today.getFullYear();
    document.getElementById("date").innerHTML=d;
    document.getElementById("mon").innerHTML=m;
   document.getElementById("year").innerHTML=y;

   let h=Today.getHours();
let mi=Today.getMinutes();
let s=Today.getSeconds();

h=h<10? "0"+h:h;
mi=mi<10? "0"+mi:mi;
s=s<10? "0"+s:s;



document.getElementById("ho").innerText=h;
document.getElementById("min").innerHTML=mi;
document.getElementById("sec").innerHTML=s;





h<12?document.getElementById("AM").style.color="red":document.getElementById("PM").style.color="red";
let realDay=Weekdays[Today.getDay()];


if(realDay==="Sun")
{
    document.getElementById("Sun").style.color="red"   
}
if(realDay==="Mon")
{
   document. getElementById("Mon").style.color="red"   
}
if(realDay==="Tue")
    {
       document. getElementById("Tue").style.color="red"   
    }

    if(realDay==="Wed")
        {
           document. getElementById("Wed").style.color="red"   
        }
        if(realDay==="Thu")
            {
               document. getElementById("Thu").style.color="red"   
            }
            if(realDay==="Fri")
                {
                   document. getElementById("Fri").style.color="red"   
                }
                if(realDay==="Sat")
                    {
                       document. getElementById("Sat").style.color="red"   
                    }


}let inter=setInterval(updateClock,400);
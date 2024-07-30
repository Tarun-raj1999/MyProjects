function clock(){

var monthsNames=["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"]
var dayNames=["Sun","Mon","Tue","Wed","Thur","Fri","Sat"]
var Today=new Date();

document.getElementById("Date").innerHTML=(dayNames[Today.getDay()]+" "+ Today.getDate()+ " "+ monthsNames[Today.getMonth()]+ " "+Today.getFullYear())

var h=Today.getHours();
var m=Today.getMinutes();
var s=Today.getSeconds();
var day=h<11?"AM":"PM";

h=h<10? "0"+h:h;
m=m<10? "0"+m:m;
s=s<10?"0"+s:s;

document.getElementById("hours").innerHTML=h;
document.getElementById("min").innerHTML=m;
document.getElementById("sec").innerHTML=s;
document.getElementById("day").innerHTML=day;
}var inter=setInterval(clock,400);
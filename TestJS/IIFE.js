(function fun(){console.log("test")})()
//use when u need to execute something which runs on the fly and its details are not needed to be used later
//scope is closed to itself

let x={
  test:"true",
  love:"true"
}

const  value=Object.entries(x)//2 d array

console.log(value)

function  reverse(s) {
  return s.split('').reverse().join('');

}

function reverseRecurssive(s){
  if(s==='') return s;
  s.split[s.split.length]+reverseRecurssive(s.splice());
}

console.log(reverse("hi"))
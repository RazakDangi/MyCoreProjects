var bar=Object.create(null);
console.log(typeof bar ==="object")
console.log(toString.call(bar))
var a=[];
console.log(toString.call(a))
console.log(typeof a)
var b={};
console.log(toString.call(b))
console.log(typeof b)
var fun=function(){};
console.log(toString.call(fun))
console.log(typeof fun)
console.log(Array.isArray(a))
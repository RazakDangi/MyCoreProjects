"use strict";

(function(){
  //  var a=b=3
	console.log(this)
})()

/*console.log(b)
console.log(a)*/

var xyz=function(x){
    return function(y){
        return function(z){
            return x*y*z;
        }
    }
};
console.log(xyz(2)(4)(6))

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
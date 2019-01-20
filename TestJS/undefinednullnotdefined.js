//not defined or not declared
//null
//undefiend :declared but not given value

//console.log(notdefined);//throws reference error

var declared
console.log(declared)

defined="defined and declared"
console.log(defined)

console.log(null)//its a nothing value,not zero,not empty object/array/string,its predefined value which is nothing
//

console.log(typeof  undefined)
console.log(typeof  null)
console.log(typeof  declared)
console.log(undefined==null)//checks for equality
console.log(undefined===null)//checks for equality and type

let x=2
let x1="2"
console.log(x==x1)//true as only value check
console.log(x===x1)//false as type is different


let ar=new Array();
ar.push(1);
ar.unshift(2)

console.log(ar.map(e=> e*e).filter(e=>e%2==0).join(''));

let name="razak"
let chars=name.split('')
console.log(chars.reduce((ch,rev)=>rev+ch).toString())
console.log(ar.concat(chars))

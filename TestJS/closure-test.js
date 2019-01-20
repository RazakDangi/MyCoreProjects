//lexical scoping
//methods carry body and its environments 
function countMinus(minus) {
    let total=0;
    let name=""
    let msg="Hello, ${name}"
    return function add(total,name) {
        this.name=name;
        console.log(msg)
           return total-minus;
    }
}
//here add method is the closure
//lets return inner function to call it outside
let add=countMinus(10)

console.log(add(100,"Razak"))

//call back functions use this ,differed execution use setTimeout

//covering entire file in a functional block creates closure ,creates private namespace and avoid name clashes between java files
//noconflict use for $ reference replacement


//${} ->interpreted to string
//rest and spread
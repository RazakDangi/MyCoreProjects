let fetch=require("node-fetch")//npm install node-fetch

async function fetchurl1() {
  return fetch('http://localhost:8080/v1/images')
    .then(res=>res.json())
}
async function fetchurl2(jobId) {
  let res=await fetch('http://localhost:8080/v1/images/upload/'+jobId)
return await res.json();
  /*fetch('http://localhost:8080/v1/images/upload/2e8efc0c-d3a3-4708-9c95-0a25c9fcb09e')
    .then(res=>res.json())
    .catch(e=>console.log(e))
*/
}

const  result1=fetchurl1()//promise status :pending promise value undefined
const  result2=fetchurl2("2e8efc0c-d3a3-4708-9c95-0a25c9fcb09e")
console.log(result2)
setTimeout(function (){console.log(result1)},2000)
setTimeout(function (){console.log(result2)},2000)
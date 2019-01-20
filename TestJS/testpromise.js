let a=10
let b=12
let ans=new Promise(function (resolve,reject) {
  if(b>0)
    resolve(console.log(a/b))
  else
    reject(-1)
})
async  function divide(){
  await ans.catch(console.log)
}
divide()

ans.then(console.log)
  .catch(console.log)
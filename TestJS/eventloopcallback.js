//js is single threaded,non blocking ,asynchronus ,concurrent ,dynamic typed,interpreted scripting language
//js says
//i have a call stack
//i have event loop
//i have a call back queue
//i have a heap to manage memory
//I have web apis for Document DOM ,ajax

//hey JS,if its one thread->one call stack(one stack starce)->one thing at a time ,how it is non blocking and asynchronous
//range error maximum call stack size reached
//blocking ,resilience
//we are running js in browser
//window.setTimeOut(callback,time)//browser pushes call back function to task queue after timer exits

//event loop keeps an eye on running stack and task queue(call back function) ,
// event loop pushes call back into stack when call stack is clear(js engine does this)
//ajax request works same way


//even deligation is diffent from event loop
//event deligation is web API functionality and event loop is js engine
[1,2,3,4].forEach(function (i) {
  console.log(i)
})


function asyncForEach(array,mycallback){
  array.forEach(function (i) {
        this.setTimeout(mycallback(i),0)
  })
}

asyncForEach([1,2,3,4],function(i) {
  console.log(i)

})




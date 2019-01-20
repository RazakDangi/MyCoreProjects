console.log("test")

var objLiteral={
  name:"Razak",
  talk:function () {
    console.log(this.name);
  }
}

objLiteral.talk()

var fun=objLiteral.talk;
fun()

var boundFunction=fun.bind(objLiteral)

boundFunction()

function myFun() {
  console.log(this.sound);
}

myFun()

var obj={
  talk:myFun,
  sound:"burre"
}
var boundFunction=myFun.bind(obj);
boundFunction();
var obj2={
  talk:obj.talk.obj,
  sound:"murr"
}
obj2.talk()


//when we add objLiterral.talk function to event listner of a button, calling context is window object
//to make it bound to objectLiteral use bind to everFunctioin.bind(everObject)
//context is important,this will be infered based on object which called this function,this will be evalution happens when we call

//bind associates this to an object of your choice.

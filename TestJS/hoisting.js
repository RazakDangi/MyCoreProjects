//js engine scans all variables and function statements brings it to top of the defined/declared scope
//if vars under window/global scope all such variables and function statements will be brought to top of the file(entire function)
//if under function,top of that function
"use strict";
function fun(asha){
  if(asha==="on leave")
    var action ="enjoy"
  if(asha==="in office")
    var action="sucks"

  return action;//in java u need to declare variable before referring it,in js all references will be hoisted to top
  //done by js engine //even use strict did not help as they are not scoped to block but to a function or context
  //but const and let are block scoped and are not hoisted
}
console.log(fun())

function fun2(asha){
  if(asha==="on leave")
    let action ="enjoy"
  if(asha==="in office")
    let action="sucks"

  return action;//in java u need to declare variable before referring it,in js all references will be hoisted to top
  //done by js engine //even use strict did not help as they are not scoped to block but to a function or context
  //but const and let are block scoped and are not hoisted
}
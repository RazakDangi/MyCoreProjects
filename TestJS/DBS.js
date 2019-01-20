'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
  inputString += inputStdin;
});

process.stdin.on('end', _ => {
  inputString = inputString.trim().split('\n').map(str => str.trim());

  main();
});

let readLine = () => inputString[currentLine++];

let pi=3.14
// Complete the calculateArea function below.
// It returns a Promise which on success, returns area of the shape, and on failure returns [-1].
let calculateArea = (shape, values) => {
  return new Promise(function (resolve,reject) {
    switch (shape) {
      case "square":new Promise(function (resolve,reject) {
        resolve(values[0]*values[0])
      })
      break;
      case "rectangle":new Promise(function (resolve,reject) {
        resolve(values[0]*values[1])
      })
        break;
      case "circle":new Promise(function (resolve,reject) {
        resolve(2*pi*values[0]*values[0])
      })
        break;
      case "triangle":new Promise(function (resolve,reject) {
        resolve(0.5*values[0]*values[0])
      })
        break;
      default:reject(-1)
    }
  })
}

// Complete the generateArea function below.
// It returns a Promise which on success, returns an array of areas of all the shapes and on failure, returns [-1].
let getAreas = (shapes, values_arr) => {
  shapes.forEach(shape=>{
    Promise.all(calculateArea(shape, values_arr)).then((areas)=>{
      console.log(areas)
    })
      .catch(-1);
  })

}

let callCalculateArea = async (shapes, values) => await calculateArea(shapes[0], values[0]).catch(error => error) instanceof Promise;
getAreas(inputString[0],inputString[1])
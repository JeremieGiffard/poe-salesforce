let array1 = [];
let array2 = [];
const lengthArray = prompt("nombre elements des tableau");

for (let index = 0; index < lengthArray; index++) {
  let askNumber = parseInt(prompt(`valeur ${1 + index} du tableau`));
  array1.push(askNumber);
}
for (let j = 0; j < lengthArray; j++) {
  let askNumber = parseInt(prompt(`valeur ${1 + j} du 2em tableau`));
  array2.push(askNumber);
}

let sum = [];
for (var i = 0; i < lengthArray; i++) {
  sum.push(array1[i] + array2[i]);
}

console.log(array1);
console.log(array2);
console.log(`somme ${sum}`);

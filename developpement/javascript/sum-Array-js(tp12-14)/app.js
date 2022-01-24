let numbers = [];
const lengthArray = prompt("nombre elements du tableau");

for (let index = 0; index < lengthArray; index++) {
  let askNumber = parseInt(prompt(`valeur ${1 + index} du tableau`));
  numbers.push(askNumber);
}

let sum = 0;
for (let i = 0; i < lengthArray; i++) {
  sum += numbers[i];
}

const moyenne = sum / lengthArray;
console.log(sum);
document.write(
  `Array : ${numbers} . Somme du tableau : ${sum} .  Moyenne du tableau : ${moyenne} .  La valeur max : ${Math.max(
    ...numbers
  )} et la plus petite : ${Math.min(...numbers)}`
);

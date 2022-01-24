/*//TP8 Boucle + Array

const number = parseInt(prompt("choisi un nombre"));
const suite = [];
for (let i = 1; i <= 10; i++) {
  suite.push(number + i);
}
console.log(suite);
document.write(
  `nombre choisi: ${number} . Les dix nombres suivant sont ${suite}`
);*/

// TP9 FIZZBUZZ
let number = prompt("choisi un nombre");
const suite = [];
for (let i = 1; i <= number; i++) {
  if (i % 15 == 0) {
    suite.push("FizzBuzz");
  } else if (i % 3 == 0) {
    suite.push("Fizz");
  } else if (i % 5 == 0) {
    suite.push("Buzz");
  } else {
    suite.push(i);
  }
}
console.log(suite);

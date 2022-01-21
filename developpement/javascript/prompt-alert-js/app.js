// variables

let number1 = prompt(`distance parcourue(m)`);
let number2 = prompt(`temps(s)`);
//parseInt converti str en int
const somme = parseInt(number1) / parseInt(number2);
console.log(number1);
console.log(number2);
console.log(`vitesse: ${somme} m/s`);
document.write(`vitesse: ${somme} m/s`);

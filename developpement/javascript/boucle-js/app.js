/*

// variables

const mail = prompt(`email`);
console.log(mail);
const mdp = prompt(`mot de pass`);
console.log(mdp);
let tentativeMail;
let tentativeMdp;
let i = 0;
//boucle
while ((tentativeMail != mail || tentativeMdp != mdp) && i < 5) {
  tentativeMail = prompt("verifier email");
  tentativeMdp = prompt("verifier mdp");
  i++;
  if (tentativeMail != mail || tentativeMdp != mdp) {
    alert(`do not match!! il vous reste ${5 - i} tentatives`);
  } else {
    alert("log_in");
  }
}
*/

let number = prompt("entrez un nombre");

while (isNaN(number) || number < 1 || number > 3) {
  number = prompt("entrez un nombre");
}
console.log(number);

/*// TP5
const mail = prompt(`email`); //console.log(mail);
const mdp = prompt(`mot de pass`); //console.log(mdp);
let tentativeMail;
let tentativeMdp;
let i = 0;
//boucle
while ((tentativeMail != mail || tentativeMdp != mdp) && i < 5) {
  tentativeMail = prompt("verifier email");
  tentativeMdp = prompt("verifier mdp");
  i++;
  if (tentativeMail != mail || tentativeMdp != mdp) {
    alert(
      `do not match!! il vous reste ${5 - i} tentatives avant d'etre bloqué`
    );
  } else {
    alert("log_in");
  }
}*/

/*
//TP6
let number = prompt("entrez un nombre");

while (isNaN(number) || number <= 1 || number >= 3) {
  number = prompt("tentez encore un nombre");
}
console.log(number);*/

//TP7
let guessNumber = prompt("entrez un nombre");

while (isNaN(guessNumber) || guessNumber < 10 || guessNumber > 20) {
  if (isNaN(guessNumber)) {
    alert("input non valide : veuillez rentrer un nombre (exemple : 50) ");
    guessNumber = prompt("entrez un nombre");
  } else if (guessNumber < 10) {
    alert(`${guessNumber} : trop petit, essaye encore`);
    guessNumber = prompt("entrez un nombre");
  } else {
    alert(`${guessNumber} : trop grand`);
    guessNumber = prompt("entrez un nombre");
  }
}

if (guessNumber >= 10 && guessNumber <= 20) {
  alert(`réussi`);
}

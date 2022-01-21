let age = prompt("quel age as tu ?");
let result = "";

/*
while (isNaN(age)) {
  age = prompt("veuillez rentrer un age");
}*/

if (age < 7) {
  result = "trop jeune";
} else if (age <= 9) {
  //« Poussin » de 7 à 9 ans
  result = "Poussin";
} else if (age <= 11) {
  //« Pupille » de 10 à 11 ans
  result = "Pupille";
} else if (age <= 13) {
  result = "Benjamin";
} else if (age <= 15) {
  result = "Minime";
} else if (age <= 17) {
  result = "Cadet";
} else if (age > 17) {
  result = "Trop vieux";
}

document.write(`tu as ${age} ans, ta catégorie est : ${result}`);

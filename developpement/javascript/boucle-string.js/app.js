let nameString = prompt("entrez du texte");
//fonction build-in match() + regex
let voyelle = nameString.match(/[aeiouy]/gi);
let consonne = nameString.match(/[bcdfghjklmnpqrstvwxz]/gi);
//retourne un array [" "," "]
console.log(voyelle);
console.log(consonne);

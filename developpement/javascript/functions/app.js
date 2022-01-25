/*
//TP19

function calculDiagonale(matrice) {
  let sommeDiagonale1 = 0;
  let sommeDiagonale2 = 0;
  for (let i = 0; i < matrice.length; i++) {
    sommeDiagonale1 += matrice[i][i];
    sommeDiagonale2 += sommeDiagonale2 + matrice[i][matrice.length - i - 1];
  }
  return sommeDiagonale1 + sommeDiagonale2;
}*/

//TP20
/*
function rotationMatrice(matrice, nombre, sens) {
  console.log("Before: " + matrice);

  for (let i = 0; i < nombre; i++) {
    if (sens == /right/g) {
      matrice.unshift(matrice.pop()); //droite
    } else {
      matrice.push(matrice.shift()); //gauche
    }
  }
  console.log("After: " + matrice);
  return matrice;
}*/
/*
const article = {
  designation: "T-shirt",
  reference: "xabsx",
  prixHT: 15,
  calculePrixTTC: function () {
    return this.prixHT * 1.2;
  },
};

function Article(reference, designation, prixHT) {
  this.reference = reference;
  this.designation = designation;
  this.prixHT = prixHT;
}

Article.prototype.calculePrixTTC = function () {
  return this.prixHT + this.prixHT * 0.2;
};

const tshirt = new Article("xfd24", "tshirt", 20);

*/

class Etudiant {
  constructor(nom, prenom, age, genre, option, pays, cours) {
    this.nom = nom;
    this.prenom = prenom;
    this.age = age;
    this.genre = genre;
    this.option = option;
    this.pays = pays;
    this.cours = cours;
  }
  modifyNom(arr) {
    this.nom = arr;
  }
  modifyPrenom(arr) {
    this.prenom = arr;
  }
  modifyOption(arr) {
    this.option = arr;
  }
}

const etudiants = [];

function enregisterEtudiant() {
  let nom1 = prompt("nom");
  let prenom1 = prompt("prenom");
  let age1 = prompt("age");
  let genre1 = prompt("genre");
  let option1 = prompt("option");
  let pays1 = prompt("pays");
  let liste1 = prompt("liste");

  etudiants.push(
    new Etudiant(nom1, prenom1, age1, genre1, option1, pays1, liste1)
  );
}

function finder() {
  let count = 0;
  let noms = [];
  const listRusseHomme = [];
  const listNomsK = [];
  const listNomsA = [];
  const listNomsM = [];
  for (let i = 0; i < etudiants.length; i++) {
    // 1-
    if (etudiants[i].pays == "chine" && etudiants[i].genre == "f") {
      count += 1;
    }
    // 2-
    noms.push(etudiants[i].nom);
    // 4-
    if (etudiants[i].genre == "m" && etudiants[i].pays == "russe") {
      listRusseHomme.push(etudiants[i]);
    }
    // 5-
    let nom_etudiant = etudiants[i].nom;
    if (nom_etudiant[0] === "K" && etudiants[i].genre == "f") {
      listNomsK.push(etudiants[i]);
    }
    // 2 -
    let prenom_etudiant = etudiants[i].prenom;
    if (prenom_etudiant[nom_etudiant.length - 1] === "a") {
      listNomsA.push(etudiants[i]);
    }
    // 6-
    if (nom_etudiant[0] === "M" && etudiants[i].genre == "m") {
      listNomsM.push(etudiants[i]);
    }
  }
  console.log(`nombre femme chinoises : ${count}`);
  console.log(`liste tous les nom : ${noms}`);
  console.log(listRusseHomme);
  console.log(listNomsK);
  console.log(listNomsA);
  console.log(listNomsM);
}

//filter() et map()

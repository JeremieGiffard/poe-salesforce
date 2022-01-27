const dataStagiaire = JSON.parse(localStorage.getItem("dataStagiaire"));

//SELECTORS
const listeStagiaires = document.querySelector("#listeStagiaires");
const detailStagiaire = document.querySelector("#story");
//FIN SELECTOR

dataStagiaire.forEach((item) => {
  const dataRow = document.createElement("tr");
  const columnNom = document.createElement("td");
  columnNom.innerText = item.nom;
  console.log(item.nom);

  const columnPrenom = document.createElement("td");
  columnPrenom.innerText = item.prenom;

  const columnEmail = document.createElement("td");
  columnEmail.innerText = item.email;

  const columnAction = document.createElement("td");

  //BUTTON VOIR
  const boutonVoir = document.createElement("button");
  boutonVoir.innerText = "Voir";
  boutonVoir.addEventListener("click", function () {
    detailStagiaire.innerText = `${item.nom} ${item.prenom}\nEmail : ${item.email}\nEtudes faites : ${item.etudes}\nBio : ${item.bio}`;

    console.log("test click button voir"); // AFFICHER LES INFO
  });

  columnAction.appendChild(boutonVoir);

  //BUTTON SUPPR
  const boutonSupprimer = document.createElement("button");
  boutonSupprimer.innerText = "Supprimer";
  boutonSupprimer.addEventListener("click", function () {
    // dataRow.remove();
    this.parentElement.parentElement.remove();

    //SUPPR POUR DE BON

    for (let i = 0; i < dataStagiaire.length; i++) {
      if (dataStagiaire[i].id === item.id) {
        dataStagiaire.splice(i, 1);
        localStorage.setItem("dataStagiaire", JSON.stringify(dataStagiaire));
        break;
      }
    }
  });

  columnAction.appendChild(boutonSupprimer);

  // append : Ajouter plusieurs enfant
  dataRow.append(columnNom, columnPrenom, columnEmail, columnAction);
  listeStagiaires.appendChild(dataRow);
});

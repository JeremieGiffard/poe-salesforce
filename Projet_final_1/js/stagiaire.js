const dataStagiaire = JSON.parse(localStorage.getItem("dataStagiaire"));

const listeStagiaires = document.querySelector("#listeStagiaires");

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
    console.log("test click button voir");
  });

  columnAction.appendChild(boutonVoir);

  //BUTTON SUPPR
  const boutonSupprimer = document.createElement("button");
  boutonSupprimer.innerText = "Supprimer";
  boutonSupprimer.addEventListener("click", function () {
    // dataRow.remove();
    this.parentElement.parentElement.remove();
  });

  columnAction.appendChild(boutonSupprimer);

  // append : Ajouter plusieurs enfant
  dataRow.append(columnNom, columnPrenom, columnEmail, columnAction);
  listeStagiaires.appendChild(dataRow);
});

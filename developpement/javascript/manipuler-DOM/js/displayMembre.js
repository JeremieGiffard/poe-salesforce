const data = JSON.parse(localStorage.getItem("data"));

const listeUtilisateurs = document.querySelector("#listeUtilisateurs");

console.log(data);

data.forEach((item) => {
  const dataRow = document.createElement("tr");
  const columnNom = document.createElement("td");
  columnNom.innerText = item.nom;

  const columnPrenom = document.createElement("td");
  columnPrenom.innerText = item.prenom;

  const columnEmail = document.createElement("td");
  columnEmail.innerText = item.email;

  const columnAction = document.createElement("td");

  const boutonSupprimer = document.createElement("button");
  boutonSupprimer.innerText = "Supprimer";
  boutonSupprimer.addEventListener("click", function () {
    // dataRow.remove();
    this.parentElement.parentElement.remove();
  });

  columnAction.appendChild(boutonSupprimer);

  // append : Ajouter plusieurs enfant
  dataRow.append(columnNom, columnPrenom, columnEmail, columnAction);
  listeUtilisateurs.appendChild(dataRow);
});

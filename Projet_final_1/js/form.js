window.onload = function () {
  if (localStorage.getItem("data") === null) {
    localStorage.setItem("data", JSON.stringify([]));
  }
};

/* SELECTORS */
const nom = document.querySelector("#nom");
const prenom = document.querySelector("#prenom");
const email = document.querySelector("#email");
const etudes = document.querySelector("#etudes");
const bio = document.querySelector("#bio");
const btnSubmit = document.querySelector("#btnSubmit");

// Err fields
const errNom = document.querySelector("#err_nom");
const errPrenom = document.querySelector("#err_prenom");
const errEmail = document.querySelector("#err_email");
const errEtudes = document.querySelector("#err_bio");
const errBio = document.querySelector("#err_bio");

btnSubmit.addEventListener("click", submitForm);

function submitForm(event) {
  event.preventDefault();
  console.log("nom : ", nom.value);
  console.log("prenom : ", prenom.value);
  console.log("email : ", email.value);

  //ERROR CONTROL
  if (nom.value === "") {
    errNom.innerText = "Veuillez saisir le nom";
    errNom.classList.add("err");
  } else {
    errNom.innerText = "";
    errNom.classList.remove("err");
  }

  if (prenom.value === "") {
    errPrenom.innerText = "Veuillez saisir le prenom";
    errPrenom.classList.add("err");
  } else {
    errPrenom.innerText = "";
    errPrenom.classList.remove("err");
  }

  if (email.value === "") {
    errEmail.innerText = "Veuillez saisir l'adresse email";
    errEmail.classList.add("err");
  } else {
    errEmail.innerText = "";
    errEmail.classList.remove("err");
  }

  if (etudes.value === "") {
    errEtudes.innerText = "Veuillez saisir vos études";
    errEtudes.classList.add("err");
  } else {
    errEtudes.innerText = "";
    errEtudes.classList.remove("err");
  }
  if (bio.value === "") {
    errBio.innerText = "Veuillez saisir vos études";
    errBio.classList.add("err");
  } else {
    errBio.innerText = "";
    errBio.classList.remove("err");
  }

  //vider tous les champs
  const formData = {
    nom: nom.value,
    prenom: prenom.value,
    email: email.value,
    etudes: etudes.value,
    bio: etudes.value,
  };

  const data = JSON.parse(localStorage.getItem("data"));
  data.push(formData);
  localStorage.setItem("data", JSON.stringify(data));
  nom.value = "";
  prenom.value = "";
  email.value = "";
  etudes.value = "";
  bio.value = "";
}

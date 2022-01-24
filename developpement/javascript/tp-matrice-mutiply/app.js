let matrice = [
  [1, 2, 3, 4],
  [4, 5, 6, 5],
  [7, 8, 9, 7],
  [7, 8, 9, 7],
];

let sum = 0;
let sumReverse = 0;
for (let i = 0; i <= matrice.length - 1; i++) {
  sum += matrice[i][i];
}

for (let i = 0; i <= matrice.length - 1; i++) {
  sumReverse += matrice[i].reverse()[i];
}

let result = sum + sumReverse;
console.log(sum);
console.log(sumReverse);
console.log(result);

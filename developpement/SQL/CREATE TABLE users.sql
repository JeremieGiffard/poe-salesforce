CREATE TABLE users
(
 id      int NOT NULL AUTO_INCREMENT,
 username varchar(50) NOT NULL ,
 avatar   varchar(50) NOT NULL ,
 bio      varchar(100) NULL ,
 nom      varchar(50) NOT NULL ,
 prenom   varchar(50) NOT NULL ,
email    varchar(100) NOT NULL ,
PRIMARY KEY (id)
) ENGINE= InnoDB;



CREATE TABLE post
(
 id      int NOT NULL AUTO_INCREMENT,
 id_user int NOT NULL ,
 picture varchar(250) NOT NULL ,
 text    varchar(50) NOT NULL ,
 PRIMARY KEY (id),
 FOREIGN KEY (id_user)  REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE= InnoDB;



 CREATE TABLE comments
(
 id      int NOT NULL AUTO_INCREMENT,
 id_post int NOT NULL ,
 id_user int NOT NULL ,
 text    varchar(150) NOT NULL ,
 PRIMARY KEY (id),
 FOREIGN KEY (id_user)  REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
 FOREIGN KEY (id_post)  REFERENCES post(id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE= InnoDB;




CREATE TABLE likes
(
 id         int NOT NULL AUTO_INCREMENT,
 id_post    int NULL ,
 id_user    int NOT NULL ,
 id_comment int NULL ,
 PRIMARY KEY (id),
 FOREIGN KEY (id_user)  REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
 FOREIGN KEY (id_post)  REFERENCES post(id) ON DELETE CASCADE ON UPDATE CASCADE,
 FOREIGN KEY (id_comment)  REFERENCES comments(id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE= InnoDB;



INSERT INTO `users` (`username`, `nom`, `prenom`, `avatar`, `bio`, `email`) VALUES
('jerem', 'jeremie', 'giffard', 'http://getdrawings.com/free-icon-bw/anonymous-avatar-icon-19.png', 'lorem ipsum', 'jgiffard@hotmail.fr'),
('telum', 'cesar', 'romulus', 'http://getdrawings.com/free-icon-bw/anonymous-avatar-icon-19.png', 'lorem ipsum pilum', 'cesar@hotmail.fr'),('aliase', 'alia', 'tura', 'http://getdrawings.com/free-icon-bw/anonymous-avatar-icon-19.png', 'lorem ipsum parabelum', 'aliagmail.com');


INSERT INTO `post` (`id_user`, `picture`, `text`) VALUES
(1,'https://i.ytimg.com/vi/xb5v7yG3358/maxresdefault.jpg',' Destroy couch rub face on everything cat snacks '),
(1,'https://www.texas-titleloans.com/blog/wp-content/uploads/2017/06/default-on-a-title-loan.jpg','Stretch intently stare at the same spot'),(2,'https://www.bedetheque.com/media/Couvertures/Couv_156989.jpg','gotlib'),
(2,'https://www.comicstore.ch/159745-large_default/gotlib-t3-rubrique-a-brac-t3.jpg','rubrique à brack');



INSERT INTO `comments` (`id_post`, `id_user`,`text`) VALUES
(4, 1,'Attack feet behind the couch destroy couch flop over give attitude hide when guests come over hopped up on goofballs hunt'),
(4, 2,'anything that moves flop over need to chase tail   rub face on everything  claw drapes  intently sniff hand  all of a sudden go crazy'),
(2, 2,'Why must they do that chase imaginary bugs hopped up on goofballs flop over need to chase tail all of a sudden go crazy  intrigued by the shower'),
(2, 1,' inspect anything brought into the house attack feet destroy couch hunt anything that moves  rub face on everything '),
(2, 1,' hide when guests come over behind the couch leave dead animals as gifts  claw drapes'),
(3, 1,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.'),
(3, 2,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.');




/*insérer un nouvel utilisateur sans lui associer un post(publication de photo)*/
possible

/* Insérer une photo sans lui associer un utilisateur(NULL)*/

INSERT INTO `post` ( `picture`, `text`) VALUES
('https://media.istockphoto.com/vectors/none-sign-isolated-on-white-background-vector-id472468632',' no user here ');

ERROR 1364 (HY000): Field 'id_user' doesn't have a default value

INSERT INTO `post` ('id_user' `picture`, `text`) VALUES
(NULL,'https://media.istockphoto.com/vectors/none-sign-isolated-on-white-background-vector-id472468632',' no user here ');

 ERROR 1064 (42000): Erreur de syntaxe près de ''id_user', `picture`, `text`) VALUES                                 (NULL,'https://media.istockphoto.com/vec...' à la ligne 1 */


/*Pour tous les commentaires, montrer le contenu et le username de l auteur*/

select comments.id, comments.text, users.username, users.bio from comments INNER JOIN users ON comments.id_user=users.id;


/*Pour chaque commentaire, afficher son contenu et l url de la photo a laquel le commentaire a ete ajoute*/

SELECT comments.text, post.picture from comments INNER JOIN post ON comments.id_post=post.id;

/*Afficher l'url de chaque photo et le nom d'utilisateur de l'auteur tout en excluant les utilisateurs sans photos, et photos qui ne sont associées à aucun utilisateur */

SELECT picture, users.username from post INNER JOIN users ON post.id_user = users.id;


/*Trouver tous les commentaires pour la photo d'id 3, avec le username de l'utilisateur qui a commenté*/

SELECT post.id,picture, comments.text, users.username FROM ((post 
INNER JOIN comments ON post.id = comments.id_post)
INNER JOIN users ON post.id_user= users.id) WHERE post.id =3;


/*Pour chaque commentaire, afficher son contenu ,l'url et l’auteur de la photo à laquelle le commentaire a été ajouté
*/

SELECT comments.text, post.picture, users.username from ((comments INNER JOIN post ON comments.id_post=post.id)
INNER JOIN users ON comments.id_user = users.id);

/*Trouver tous les url des photos ainsi que tous les commentaires qui ont été postés par l'auteur des photos publiées.*/
SELECT post.picture, comments.text, post.id_user FROM post INNER JOIN comments ON post.id = comments.id_post WHERE comments.id_user = post.id_user;

/*A l'exercice précedent afficher aussi le nom de l'utilisateur qui a commenté ses propres photos*/
SELECT post.picture, comments.text, post.id_user, username FROM ((post 
INNER JOIN comments ON post.id = comments.id_post)
INNER JOIN users ON post.id_user = users.id) WHERE comments.id_user = post.id_user;




Decouverte Java : typage fort, compile
setup de Idea pour travailler, convention nommage : camelCase
Différents type de variables : double (int avec virgule)
constante déclaré via prefix "final"
system.out.print("%d + %s et %f",nombre1, string, formule)
import classe Scanner pour recuperer input clavier
if / else    
choix imbriqué : mettre des if() dans des if()
typage fort donc pas besoin de ===


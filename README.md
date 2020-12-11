# ProjetYuGiOh
## Présentation
Projet qui utilise l'architecture MVVM et une clean architecture dans une application android codé en kotlin.

Cette application permet de se renseigner sur le jeu de cartes YuGiOh.
Elle utilise l'API de Github permettant d'aller chercher les informations nécessaires pour l'affichage.

## Prérequis
- Installation d'Android Studio
- Si vous utiliser git via un terminal pour récupérer le projet :
    - Pull la branche Master ( git pull origin master )
    
    Ou bien :
    - git clone https://github.com/Raffael93/ProjetYuGiOhKT.git

## Consignes respectées
- Utilisation d'une BDD
- Architecture MVVM
- Clean architecture 
- Appels d'une API Rest
- 8 écrans : 8 activités
- Affichage d'une liste dans une RecyclerView
- design
- Fonctions supplémentaires ajoutés par moi-même :
    - Login / register
    - Pdf Viewer qui permet de lire les règles du jeu de carte
    - Video Viewer permettant d'afficher une vidéo en tant que qu'écran de démarrage
    - Search bar qui permet d'afficher les héros de yugioh et chercher son héros favoris à l'aide de la barre de recherche
    
## Fonctionnalités 

### Premier écran
![Vidéo de démarrage](https://github.com/Raffael93/ProjetYuGiOh/blob/master/image/d%C3%A9but.PNG)

Si vous voulez voir la vidéo en entière, voici le lien : 

https://github.com/Raffael93/ProjetYuGiOh/blob/master/image/video.mp4

### Ecran register
Ecran qui permet de s'enregister afin de se connecter et d'accéder aux autres fonctionnalités

![register](https://github.com/Raffael93/ProjetYuGiOhKT/blob/master/images/register.PNG)

### Ecran Login
Ecran qui permet de s'authetifier une fois inscrit afin d'accéder aux autres fonctionnalités

![login](https://github.com/Raffael93/ProjetYuGiOhKT/blob/master/images/login.PNG)

### Ecran Menu
Menu qui permet d'aller lire les règles, de voir toutes les cartes et les différents héros/méchants de l'univers YuGiOh.

![menu](https://github.com/Raffael93/ProjetYuGiOhKT/blob/master/images/menu.PNG)

### Ecran règles
![regle](https://github.com/Raffael93/ProjetYuGiOh/blob/master/image/regle_debut.PNG)
![regle](https://github.com/Raffael93/ProjetYuGiOh/blob/master/image/regle_scroll.PNG)

### Ecran Héros
- Affiche les noms des héros de YuGiOh, On peut aussi chercher son héros en tapant sur la barre de recherche

![heros](https://github.com/Raffael93/ProjetYuGiOhKT/blob/master/images/search.PNG)
![heros](https://github.com/Raffael93/ProjetYuGiOhKT/blob/master/images/search2.PNG)

### Ecran cartes jouables
- Affiche les noms des cartes qui sont jouables à l'aide d'une API

![cards](https://github.com/Raffael93/ProjetYuGiOhKT/blob/master/images/allCards.PNG)


# Réservations de train

L'objectif de ce TP est de réserver un siège dans un train.

A partir d'un train composé de voiture, on doit pouvoir rechercher une ou des sièges selon certains critères :

- Quand on recherche un seul siège, on peut préciser la classe et une préférence pour le type (si toutes les sièges du type indiqué sont pris, le système ne proposera un autre dans la même classe)
- Quand on voyage à deux, on peut préciser la classe mais pas le type. Le système fera tout pour trouver deux sièges côte à côte

## Avant de commencer

Renommer le répertoire 'A-RENOMMER' en gr01, gr02, gr03, gr10, etc. en fonction du numéro de votre groupe sur MyGES
**Assurez-vous que tous les membres de votre groupe sont bien indiqués dans MyGES. Sinon, ce sera 0**

Pour les listes, utiliser `List` de la façon suivante :

````java
List<String> list = new ArrayList<>();
````

Pour les interfaces fonctionnelles, il faut utiliser l'annotation `@FunctionalInterface`

Dans ce TP, vous n'avez pas le droit d'utiliser de boucles `for` ou `while`

Pour générer des identifiants, utiliser :
```java
IntStream.rangeClosed(1, 10)
         .boxed()
         .map((n) -> {}).toList();
```

## Modéliser les sièges (4 points)

Un siège est défini par :
- un identifiant `SeatId`
- un type `Type` (couloir, fenêtre)
- un statut `Status` (libre, occupé)

1. Créer une classe `Seat` qui modélise un siège
2. Ajouter une méthode pour savoir si le siège est libre ou non
3. Ajouter une méthode pour réserver un siège (`book` est un bon nom)
4. Ecrire un test qui s'assure qu'un siège est libre par défaut. Puis, ne l'est plus quand il est réservé

## Modéliser une voiture (4 points)

Une voiture est définie par :
- un numéro entre 1 et 4
- une classe (seconde ou première)
- 10 sièges numérotés de 1 à 10 dont les numéros pairs sont côté fenêtre, les numéros impairs sont côté couloir


1. Créer une classe `Car`
2. Ajouter une méthode pour savoir si la voiture est de la classe requise

*Deux voitures ont un numéro différent. Mais auront les mêmes numéros de sièges. On pourra donc avoir les places Voiture 1/siège 5 et Voiture 2/siège 5

## Modéliser un train (5 points)

Un train est défini par: 
- une liste de voitures de 1 à 4, ordonnée dans l'ordre (la voiture 2 est avant la voiture 3, qui est avant la 4, etc.)
- par défaut, un train ne contient pas de voitures. Il faut les attacher une à une

1. Créer une classe `Train`
2. Ajouter une méthode `attach` qui permet d'ajouter une voiture
3. Créer un record `Ticket` qui contient uniquement un `CarId` et un `SeatId` 

## La recherche (7 points)

1. Créer une **interface fonctionnelle** `SearchSeatCriteria`
2. Ajouter une méthode `Boolean SearchCriteria.match(Seat)`
3. Dans la classe `Car`, ajouter une méthode `Seat Car.search(SearchSeatCriteria)`
4. Ecrire un test qui valide qu'on peut rechercher tous les sièges côté fenêtre d'une voiture
    - Pour cela, appeler la méthode `Car.search` en lui passant une lambda du style `(seat) -> seat.id() == new SeatId(3)`
5. Dans la classe `Train`, ajouter une méthode `Ticket Train.search(Class, SearchSeatCriteriaCriteria)`
    - Cette méthode doit rechercher dans les voitures ayant la classe précisée, le premier siège respectant les critères demanés et retourne un `Ticket` correspondant
6. Dans la classe `Train`, ajouter une méthode `Train.book(Ticket)` qui réserve le siège de la voiture que désigne le ticket
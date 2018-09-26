#Videotheek

##Movie class
- Maak de `Movie` Class aan
- Voeg de volgende velden toe aan de `Movie` class: `title`, `durationInMinutes`, `isRented`
- Voeg een constructor toe die 2 parameters mee krijgt, namelijk: `title`, `durationInMinutes`
- Voeg een constructor toe aan Movie die 1 parameter mee krijgt, namelijk: `title` (zorg ervoor dat het veld `durationInMinutes` altijd een default waarde van `120` krijgt)
- Maak een methode `watch()` aan in de Movie class
- Voeg aan de methode `watch()` een `if-else statement` toe waarin gecheckt wordt dat je een film alleen mag huren wanneer `isRented` gelijk is aan `true`
- Maak een methode aan in `Movie` die de waarde van isRented terug geeft
- Maak in de class `Movie` een methode aan die de details van de film terug geeft (`title` + `durationInMinutes`)
- Maak in de class `Movie` een methode aan die de `title` teruggeeft 


##VideoRental class
- Maak een class `VideoRental` aan
- Voeg aan `VideoRental` een veld toe, een array van `Movie` genaamd `movies`
- Maak een constructor aan die als parameter een array van `Movie` mee krijgt
- Maak een methode aan genaamd `getAllMovies()` die de namen van elke film uitprint
- Maak een methode aan genaamd `rentMovie()` die als parameter een `String` mee krijgt en een `Movie` `returned`. Gebruik deze meegegeven string om in de lijst `movies` de juiste film te vinden en deze te `returnen` (tip: gebruik een if(movie.getTitle().equals(title)))
- Zorg ervoor dat voordat je de movie returned in `rentMovie()` de waarde van `isRented` van deze `Movie` op `true` gezet wordt
- Maak een methode genaamd `returnMovie()` die als parameter een `Movie` accepteert. Zet vervolgens het veld `isRented` op deze `Movie` op `false` en print dat de film is teruggebracht

##Main methode
- Maak een array aan van `Movie` en voeg hier een paar leuke films aan toe
- Maak een `VideoRental` object aan (`new VideoRental(...)`) en geef de hierboven aangemaakt array van `Movie` mee in de constructor
- Roep de methode `getAllMovies()` aan op het `VideoRental` object
- Roep de methode `rentMovie()` aan op het `VideoRental` object met je favoriete film als parameter
- Roep de methode `watch()` aan op het `VideoRental` object
- Breng de film weer terug naar de `VideoRental` 




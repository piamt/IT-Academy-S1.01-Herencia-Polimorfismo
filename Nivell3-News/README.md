# IT-Academy-S1.01-Herencia-Polimorfismo-Nivel3

### Exercisi 1: News

En una redacció de notícies esportives tenen les notícies classificades per esports: futbol, bàsquet, tenis, F1 i motociclisme.

La redacció pot tenir més d’un redactor, i de cadascun d’ells volem saber el seu nom, el DNI i el sou. Un cop assignat un DNI, aquest no podrà canviar mai. Tots els redactors tenen el mateix sou, i si en un futur l’empresa pot incrementar-lo, ho farà a tothom per igual. De moment el sou actual és de 1500 €.

Cada redactor pot treballar en més d’una notícia. Les notícies han de tenir un titular, un text, una puntuació i un preu. En el moment de crear-se, el text ha d’estar buit.

### Tecnologies Utilitzades

Java

### Requisits

Java 23.0

### Instal·lació

Clona aquest repositori: -> git clone  
Accedeix al directori del projecte:   cd Nivell3-News

### Contribucions

Les contribucions són benvingudes! Per favor, segueix els següents passos per a contribuir:

Fes un fork del repositori  
Crea una nova branca:  git checkout -b feature/NovaFuncionalitat  
Fes els teus canvis i commiteja'ls: git commit -m 'Afegeix Nova Funcionalitat'  
Puja els canvis a la teva branca: git push origin feature/NovaFuncionalitat  
Fes un pull request

### Notes Exercisi 1
He creat una classe principal SportsOffice, que té una llista de redactors (Editors) i els 7 mètodes que es demanen:
1. Add editor
2. Remove editor
3. Add news for editor
4. Remove news for editor & headline
5. Get array of news for editor
6. Get score from news & editor
7. Get price from news & editor
  
Cada redactor alhora conté una llista de notícies (News).  

He creat una classe abstracta News de la que hereden les 5 classes news: Soccer, Basket, Tennis, F1, Motos.
Cada classe específica news calcula el preu i la puntuació internament.
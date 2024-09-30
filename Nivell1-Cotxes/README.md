# IT-Academy-S1.01-Herencia-Polimorfismo-Nivel1

### Exercisi 2: Cotxes

Crea una classe "Cotxe" amb els atributs: marca, model i potència. La marca ha de ser estàtic final, el model estàtic i la potència final. Demostra la diferència entre els tres. N’hi ha algun que es pugui inicialitzar al constructor de la classe?  

Afegeix dos mètodes a la classe "Cotxe". Un mètode estàtic anomenat frenar() i un altre no estàtic anomenat accelerar(). El mètode accelerar ha de mostrar per consola: “El vehicle està accelerant” i el mètode frenar() ha de mostrar: “El vehicle està frenant”.    

Demostra com invocar el mètode estàtic i el no estàtic des del main() de la classe principal.   


### Tecnologies Utilitzades

Java

### Requisits

Java 23.0

### Instal·lació

Clona aquest repositori: -> git clone  
Accedeix al directori del projecte:   cd Nivell1-Instrument

### Contribucions

Les contribucions són benvingudes! Per favor, segueix els següents passos per a contribuir:  

Fes un fork del repositori  
Crea una nova branca:  git checkout -b feature/NovaFuncionalitat  
Fes els teus canvis i commiteja'ls: git commit -m 'Afegeix Nova Funcionalitat'  
Puja els canvis a la teva branca: git push origin feature/NovaFuncionalitat  
Fes un pull request

### Notes Exercisi 2
Una variable static o final es pot inicialitzar al constructor, tot i que el mes comú per una final és que s'inicialitzi quan es declara.
Una variable final sempre ha de tenir un valor assignat o donarà error de compilació.  
Una variable static i final alhora nomes es pot inicialitzar dins un bloc estàtic, tot i que el més comú és que s'inicialitzi quan es declara.  

En quant als mètodes static vs. no static: la diferencia és que el mètode estàtic s'ha de cridar amb el nom de la classe, ja que és inerent a la classe i no a les diferents instancies.  

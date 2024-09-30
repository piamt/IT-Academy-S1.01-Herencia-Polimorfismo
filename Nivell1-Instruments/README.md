## IT-Academy-S1.01-Herencia-Polimorfismo-Nivel1

### Exercisi 1: Instruments musicals

En un grup de música hi ha diferents tipus d’instruments musicals. Hi ha instruments de vent, de corda i de percussió.  

Tots els instruments tenen com a atributs el seu nom, i el seu preu. A més, tenen un mètode anomenat tocar(). Aquest, és abstracte a la classe instrument i, per tant, s’ha d’implementar a les classes filles. Si s’està tocant un instrument de vent, el mètode ha de mostrar per consola: "Està sonant un instrument de vent", si s’està tocant un instrument de corda: “Està sonant un instrument de corda” i si s’està tocant un instrument de percussió: “Està sonant un instrument de percussió”.  

El procés de càrrega d'una classe només té lloc una vegada. Demostra que la càrrega pot ser provocada per la creació de la primera instància d'aquesta classe o per l'accés a un membre estàtic d'aquesta.   

Cerca informació sobre els blocs d'inicialització i blocs estàtics en Java.


### Tecnologies Utilitzades

Java

### Requisits

Java 23.0

### Instal·lació

Clona aquest repositori: -> git clone  
Accedeix al directori del projecte:   cd Nivell1-Instrument

### Execució
Quan executis el programa, apareixerà 1 vegada el print que indica que la classe s'ha carregat, tant per la classe MusicalInstrument com per la seva classe filla WindInstrument.   
Pots afegir noves instancies de les classes al main, però el load no es tornarà a executar. Per tant, provem que les classes només es carreguen 1 vegada durant la creació de la primera instància.

### Contribucions

Les contribucions són benvingudes! Per favor, segueix els següents passos per a contribuir:  

Fes un fork del repositori  
Crea una nova branca:  git checkout -b feature/NovaFuncionalitat  
Fes els teus canvis i commiteja'ls: git commit -m 'Afegeix Nova Funcionalitat'  
Puja els canvis a la teva branca: git push origin feature/NovaFuncionalitat  
Fes un pull request

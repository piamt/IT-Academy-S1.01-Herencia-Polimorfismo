public class Car {

    public enum Marca {
        Audio ,
        Citroen,
        AlfaRomeo,
        Kia
    }

    public enum Model {
        A3, // Audi
        A5, // Audi
        Berlina, // Citroen
        C3, // Citroen
        Giulia, // Alfa Romeo
        Stelvio, // Alfa Romeo
        Sportage, // Kia
        EV9, // Kia
    }

    static final Marca marca = Marca.AlfaRomeo;
    static Model model;
    final double potencia;

    public Car(Model model, double potencia) {
       // Car.marca = marca; // Error
       // this.marca = marca; // Error
        Car.model = model;
        this.potencia = potencia;
    }

    public void updateModel() {
        Car.model = Car.Model.Sportage;
    }

    static public String frenar() {
        return "El vehicle està frenant";
    }

    public String accelerar() {
        return "El vehicle està accelerant";
    }

    @Override
    public String toString() {
        return "Car: " + "marca=" + marca + ", model=" + model + ", potencia=" + potencia;
    }
}
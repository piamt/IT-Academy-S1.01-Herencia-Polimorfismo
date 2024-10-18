public class Car {

    static final protected Marca marca = Marca.AlfaRomeo;
    static protected Model model;
    final protected double potencia;

    static {
        Car.model = Model.A5;
    }

    public Car(double potencia) {
       // Car.marca = marca; // Error
       // this.marca = marca; // Error
        this.potencia = potencia;
    }

    public void updateModel() {
        Car.model = Model.Sportage;
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
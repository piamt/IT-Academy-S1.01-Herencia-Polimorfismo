public class App {
    public static void main(String[] args) throws Exception {
         Car car1 = new Car(Car.Model.Giulia, 200.0);
         System.out.println("car1 instantiation:");
         System.out.println(car1.toString());
 
         Car car2 = new Car(Car.Model.A5, 300.0);
         System.out.println("car2 instantiation:");
         System.out.println(car1.toString()); // car1 changes model automatically, because it is a static value of the class Car
         System.out.println(car2.toString());
 
         car1.updateModel();
         System.out.println("car1 updateModel:");
         System.out.println(car1.toString()); //car2 model is also updated because it is a static value of the class Car
         System.out.println(car2.toString());
 
         //car2.potencia = 200.0; // Compilation error: cannot assign a value to final variable
 
         // Static method vs. non static method:
         System.out.println(car1.accelerar());
         System.out.println(Car.frenar());
    }
}

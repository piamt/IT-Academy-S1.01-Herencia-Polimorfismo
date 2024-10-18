public class App {
    public static void main(String[] args) throws Exception {
         Car car1 = new Car( 200.0);
         Car car2 = new Car(300.0);
         System.out.println(car1.toString());
         System.out.println(car2.toString());
 
         car1.updateModel();
         System.out.println("\ncar1 updateModel - it changes model in both instantiations:");
         System.out.println(car1.toString());
         System.out.println(car2.toString());
 
         //car2.potencia = 200.0; // Compilation error: cannot assign a value to final variable

         System.out.println("\nStatic method vs. non static method");
         System.out.println(car1.accelerar());
         System.out.println(Car.frenar());
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        MusicalInstrument guitarra = new StringInstrument("guitarra", 250.0);
        MusicalInstrument bateria = new PercussionInstrument("batería", 250.0);
        MusicalInstrument flauta = new WindInstrument("flauta", 340.0);
        MusicalInstrument flautaTravesera = new WindInstrument("flauta travesera", 340.0);

        System.out.println("tocar() method for the different instruments:");
        System.out.println(guitarra.tocar());
        System.out.println(bateria.tocar());
        System.out.println(flauta.tocar());
        System.out.println(flautaTravesera.tocar());
    }
}

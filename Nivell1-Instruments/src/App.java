public class App {
    public static void main(String[] args) throws Exception {
        MusicalInstrument guitarra = new StringInstrument("guitarra", 250.0);
        MusicalInstrument bateria = new PercussionInstrument("batería", 250.0);
        MusicalInstrument flauta = new WindInstrument("flauta", 340.0);
        MusicalInstrument flautaTravesera = new WindInstrument("flauta travesera", 340.0);

        System.err.println(guitarra.tocar());
        System.err.println(bateria.tocar());
        System.err.println(flauta.tocar());
        System.err.println(flautaTravesera.tocar());
    }
}

public class WindInstrument extends MusicalInstrument {

    public WindInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public String tocar() {
        return "Està sonant un instrument de vent";
    }

    static {
        System.out.println("WindInstrument class loaded");
    }
}

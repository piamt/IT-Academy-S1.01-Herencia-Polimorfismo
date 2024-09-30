abstract class MusicalInstrument {

    private String name;
    private double price;

    static {
        System.out.println("MusicalInstrument class loaded");
    }

    public MusicalInstrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String tocar();
}

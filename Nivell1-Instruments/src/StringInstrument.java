public class StringInstrument extends MusicalInstrument {

    public StringInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public String tocar() {
        return "Està sonant un instrument de corda";
    }
}
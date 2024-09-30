public class PercussionInstrument extends MusicalInstrument {

    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public String tocar() {
        return "Està sonant un instrument de percusió";
    }

}

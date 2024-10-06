
class Smartphone extends Telephone implements Camera, Clock {

    public Smartphone(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void shoot() {
        System.out.println("A picture is being taken");
    }

    @Override
    public void alarm() {
        System.out.println("Alarm ringing");
    }
}

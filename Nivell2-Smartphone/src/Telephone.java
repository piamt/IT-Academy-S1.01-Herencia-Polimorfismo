class Telephone {
    String marca;
    String model;

    public Telephone(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public void call(String num) {
        System.out.println("Calling " + num);
    }
}

interface Camera {
    public void shoot();
}

interface Clock {
    public void alarm();
}

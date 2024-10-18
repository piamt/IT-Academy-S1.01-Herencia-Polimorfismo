public abstract class News {

    protected String headline;
    private String text = "";
    protected int score;
    protected int price;

   public int getScore() {
       return this.score;
   }

   public int getPrice() {
       return this.price;
   }

    public abstract void calculateNewsPrice();
    public abstract void calculateNewsScore();
}

public abstract class News {

    String headline;
    String text = "";
    int score;
    int price;

   public int getScore() {
       return this.score;
   }

   public int getPrice() {
       return this.price;
   }

    public abstract void calculateNewsPrice();
    public abstract void calculateNewsScore();
}

public class TennisNews extends News {

    String competition;
    String player;

    public TennisNews(String headline, String competition, String player) {
        this.headline = headline;
        this.competition = competition;
        this.player = player;
        calculateNewsPrice();
        calculateNewsScore();
    }

    public void calculateNewsPrice() {
        int price = 150;

        if (player.equals("Federer") || player.equals("Nadal") || player.equals("Djokovic"))  {
            price += 100;
        }
        this.price = price;
    }

    public void calculateNewsScore() {
        int score = 4;
        if (player.equals("Federer") || player.equals("Nadal") || player.equals("Djokovic"))  {
            score += 3;
        }

        this.score = score;
    }
}

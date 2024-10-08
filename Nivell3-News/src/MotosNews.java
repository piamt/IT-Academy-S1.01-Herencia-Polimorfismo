public class MotosNews extends News {

    String team;

    public MotosNews(String headline, String team) {
        this.headline = headline;
        this.team = team;
        calculateNewsPrice();
        calculateNewsScore();
    }

    public void calculateNewsPrice() {
        int price = 100;

        if (team.equals("Honda") || team.equals("Yamaha"))  {
            price += 50;
        }
        this.price = price;
    }

    public void calculateNewsScore() {
        int score = 3;
        if (team.equals("Honda") || team.equals("Yamaha"))  {
            score += 3;
        }
        this.score = score;
    }
}

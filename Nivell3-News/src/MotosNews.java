public class MotosNews extends News {

    private String team;

    private static final String HONDA = "Honda";
    private static final String YAMAHA = "Yamaha";

    public MotosNews(String headline, String team) {
        this.headline = headline;
        this.team = team;
        calculateNewsPrice();
        calculateNewsScore();
    }

    @Override
    public void calculateNewsPrice() {
        int price = 100;

        if (team.equals(HONDA) || team.equals(YAMAHA))  {
            price += 50;
        }
        this.price = price;
    }

    @Override
    public void calculateNewsScore() {
        int score = 3;
        if (team.equals(HONDA) || team.equals(YAMAHA))  {
            score += 3;
        }
        this.score = score;
    }
}

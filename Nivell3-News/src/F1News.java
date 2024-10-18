public class F1News extends News {

    private String team;

    private static final String FERRARI = "Ferrari";
    private static final String MERCEDES = "Mercedes";

    public F1News(String headline, String team) {
        this.headline = headline;
        this.team = team;
        calculateNewsPrice();
        calculateNewsScore();
    }

    @Override
    public void calculateNewsPrice() {
        int price = 100;

        if (team.equals(FERRARI) || team.equals(MERCEDES))  {
            price += 50;
        }
        this.price = price;
    }

    @Override
    public void calculateNewsScore() {
        int score = 4;
        if (team.equals(FERRARI) || team.equals(MERCEDES))  {
            score += 2;
        }

        this.score = score;
    }
}

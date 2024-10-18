public class TennisNews extends News {

    private String competition;
    private String player;

    private static final String FEDERER = "Federer";
    private static final String NADAL = "Nadal";
    private static final String DJOKOVIC = "Djokovic";

    public TennisNews(String headline, String competition, String player) {
        this.headline = headline;
        this.competition = competition;
        this.player = player;
        calculateNewsPrice();
        calculateNewsScore();
    }

    @Override
    public void calculateNewsPrice() {
        int price = 150;

        if (player.equals(FEDERER) || player.equals(NADAL) || player.equals(DJOKOVIC))  {
            price += 100;
        }
        this.price = price;
    }

    @Override
    public void calculateNewsScore() {
        int score = 4;
        if (player.equals(FEDERER) || player.equals(NADAL) || player.equals(DJOKOVIC))  {
            score += 3;
        }

        this.score = score;
    }
}

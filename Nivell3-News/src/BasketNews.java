public class BasketNews extends News {

    private String competition;
    private String club;

    private static final String EUROLLIGA = "Eurolliga";
    private static final String ACB = "ACB";
    private static final String BARÇA = "Barça";
    private static final String MADRID = "Madrid";

    public BasketNews(String headline, String competition, String club) {
        this.headline = headline;
        this.competition = competition;
        this.club = club;
        calculateNewsPrice();
        calculateNewsScore();
    }

    @Override
    public void calculateNewsPrice() {
        int price = 250;
        if (competition.equals(EUROLLIGA)) {
            price += 75;
        }

        if (club.equals(BARÇA) || club.equals(MADRID)) {
            price += 75;
        }

        this.price = price;
    }

    @Override
    public void calculateNewsScore() {
        int score = 4;
        if (competition.equals(EUROLLIGA)) {
            score += 3;
        } else if (competition.equals(ACB)) {
            score += 2;
        }

        if (club.equals(BARÇA) || club.equals(MADRID))  {
            score += 1;
        }

        this.score = score;
    }
}

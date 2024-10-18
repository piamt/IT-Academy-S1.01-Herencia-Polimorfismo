public class SoccerNews extends News {

    private String competition;
    private String club;
    private String player;

    private static final String LLIGADECAMPIONS = "Lliga de Campions";
    private static final String LLIGA = "Lliga";
    private static final String BARÇA = "Barça";
    private static final String MADRID = "Madrid";
    private static final String FERRANTORRES = "Ferran Torres";
    private static final String BENZEMA = "Benzema";

    public SoccerNews(String headline, String competition, String club, String player) {
        this.headline = headline;
        this.competition = competition;
        this.club = club;
        this.player = player;
        calculateNewsPrice();
        calculateNewsScore();
    }

    @Override
    public void calculateNewsPrice() {
        int price = 300;
        if (competition.equals(LLIGADECAMPIONS)) {
            price += 100;
        }

        if (club.equals(BARÇA) || club.equals(MADRID))  {
            price += 100;
        }

        if (player.equals(FERRANTORRES) || player.equals(BENZEMA))  {
            price += 50;
        }
        this.price = price;
    }

    @Override
    public void calculateNewsScore() {
        int score = 5;
        if (competition.equals(LLIGADECAMPIONS)) {
            score += 3;
        } else if (competition.equals(LLIGA)) {
            score += 2;
        }

        if (club.equals(BARÇA) || club.equals(MADRID))  {
            score += 1;
        }

        if (player.equals(FERRANTORRES) || player.equals(BENZEMA))  {
            score += 1;
        }
        this.score = score;
    }
}

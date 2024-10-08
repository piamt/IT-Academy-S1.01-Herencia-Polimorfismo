public class SoccerNews extends News {

    String competition;
    String club;
    String player;

    public SoccerNews(String headline, String competition, String club, String player) {
        this.headline = headline;
        this.competition = competition;
        this.club = club;
        this.player = player;
        calculateNewsPrice();
        calculateNewsScore();
    }

    public void calculateNewsPrice() {
        int price = 300;
        if (competition.equals("Lliga de Campions")) {
            price += 100;
        }

        if (club.equals("Barça") || club.equals("Madrid"))  {
            price += 100;
        }

        if (player.equals("Ferran Torres") || player.equals("Benzema"))  {
            price += 50;
        }
        this.price = price;
    }

    public void calculateNewsScore() {
        int score = 5;
        if (competition.equals("Lliga de Campions")) {
            score += 3;
        } else if (competition.equals("Lliga")) {
            score += 2;
        }

        if (club.equals("Barça") || club.equals("Madrid"))  {
            score += 1;
        }

        if (player.equals("Ferran Torres") || player.equals("Benzema"))  {
            score += 1;
        }
        this.score = score;
    }
}

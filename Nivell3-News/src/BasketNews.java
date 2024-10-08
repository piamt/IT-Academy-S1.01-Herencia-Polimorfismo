public class BasketNews extends News {

    String competition;
    String club;

    public BasketNews(String headline, String competition, String club) {
        this.headline = headline;
        this.competition = competition;
        this.club = club;
        calculateNewsPrice();
        calculateNewsScore();
    }

    public void calculateNewsPrice() {
        int price = 250;
        if (competition.equals("Eurolliga")) {
            price += 75;
        }

        if (club.equals("Barça") || club.equals("Madrid"))  {
            price += 75;
        }

        this.price = price;
    }

    public void calculateNewsScore() {
        int score = 4;
        if (competition.equals("Eurolliga")) {
            score += 3;
        } else if (competition.equals("ACB")) {
            score += 2;
        }

        if (club.equals("Barça") || club.equals("Madrid"))  {
            score += 1;
        }

        this.score = score;
    }
}

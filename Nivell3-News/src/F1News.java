public class F1News extends News {

    String team;

    public F1News(String headline, String team) {
        this.headline = headline;
        this.team = team;
        calculateNewsPrice();
        calculateNewsScore();
    }

    public void calculateNewsPrice() {
        int price = 100;

        if (team.equals("Ferrari") || team.equals("Mercedes"))  {
            price += 50;
        }
        this.price = price;
    }

    public void calculateNewsScore() {
        int score = 4;
        if (team.equals("Ferrari") || team.equals("Mercedes"))  {
            score += 2;
        }

        this.score = score;
    }
}

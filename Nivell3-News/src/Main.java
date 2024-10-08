import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SportsOffice office = new SportsOffice();
        Editor jaime = new Editor("Jaime", "45667888D");
        Editor valeria = new Editor("Valeria", "12796432L");
        Editor mario = new Editor("Mario", "56033920S");

        // 1. Introduce editor
        office.addEditor(jaime);
        office.addEditor(valeria);
        office.addEditor(mario);

        News newsSoccer = new SoccerNews("Soccer news", "Lliga", "Barça", "Benzema");
        News newsbasket = new BasketNews("Basket news", "Eurolliga", "Barça");
        News newsTennis = new TennisNews("Tennis news", "Roland Garros", "Federer");
        News newsF1 = new F1News("F1 news", "Mercedes");
        News newsMotos = new MotosNews("Motos news", "Honda");

        // 3. Add news to editor
        jaime.addNews(newsSoccer);
        valeria.addNews(newsbasket);
        valeria.addNews(newsTennis);
        jaime.addNews(newsF1);
        valeria.addNews(newsMotos);
        mario.addNews(newsSoccer);

        try {
            for (News news: office.getNewsListFromEditor("Mario")) {
                System.out.println("Mario's news: " + news.headline);
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        // 2. Remove editor
        office.removeEditor("Mario");

        try {
            for (News news: office.getNewsListFromEditor("Mario")) {
                System.out.println("Mario's news: " + news.headline);
            }
        } catch (NullPointerException e) {
            System.out.println("No Mario editor anymore");
        }

        System.out.println("\nJaime's news:");
        try {
            for (News news: office.getNewsListFromEditor("Jaime")) {
                System.out.println(news.headline);
            }
        } catch (NullPointerException e) {
            System.out.println("No Jaime editor found");
        }

        // 5. Show all news from editor
        System.out.println("\nValeria's news:");
        try {
            for (News news: office.getNewsListFromEditor("Valeria")) {
                System.out.println(news.headline);
            }
        } catch (NullPointerException e) {
            System.out.println("No Valeria editor found");
        }

        // 4. Remove news from editor
        office.removeNewsFromEditor("Motos news", "Valeria");

        System.out.println("\nValeria's news after removal:");
        try {
            for (News news: office.getNewsListFromEditor("Valeria")) {
                System.out.println(news.headline);
            }
        } catch (NullPointerException e) {
            System.out.println("No Valeria editor found");
        }

        // 6. Get score for news
        try {
            int score = office.getScoreForNews("F1 news", "Jaime");
            System.out.println("Jaime score: " + score + " for F1 news");
        } catch (NullPointerException e) {
            System.out.println("New not found");
        }

        // 7. Get price for news
        try {
            int price = office.getPriceForNews("Motos news", "Valeria");
            System.out.println("Valeria price: " + price + " for Motos news");
        } catch (NullPointerException e) {
            System.out.println("New not found");
        }
    }
}
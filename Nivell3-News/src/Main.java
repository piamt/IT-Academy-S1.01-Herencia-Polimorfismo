import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        SportsOffice office = new SportsOffice();
        Editor jaime = new Editor("Jaime", "45667888D");
        Editor valeria = new Editor("Valeria", "12796432L");
        Editor mario = new Editor("Mario", "56033920S");

        office.addEditor(jaime);
        office.addEditor(valeria);
        office.addEditor(mario);

        News newsSoccer = new SoccerNews("Soccer news", "Lliga", "Barça", "Benzema");
        News newsbasket = new BasketNews("Basket news", "Eurolliga", "Barça");
        News newsTennis = new TennisNews("Tennis news", "Roland Garros", "Federer");
        News newsF1 = new F1News("F1 news", "Mercedes");
        News newsMotos = new MotosNews("Motos news", "Honda");

        jaime.addNews(newsSoccer);
        valeria.addNews(newsbasket);
        valeria.addNews(newsTennis);
        jaime.addNews(newsF1);
        valeria.addNews(newsMotos);
        mario.addNews(newsSoccer);

        System.out.println("Check for news:");
        try {
            for (News news: office.getNewsListFromEditor("Mario")) {
                System.out.println("Mario's news: " + news.headline);
            }
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n2. Remove editor");
        office.removeEditor("Mario");

        try {
            for (News news: office.getNewsListFromEditor("Mario")) {
                System.out.println("Mario's news: " + news.headline);
            }
        } catch (NoSuchElementException e) {
            System.out.println("No Mario editor anymore");
        }

        System.out.println("\nJaime's news:");
        try {
            for (News news: office.getNewsListFromEditor("Jaime")) {
                System.out.println(news.headline);
            }
        } catch (NoSuchElementException e) {
            System.out.println("No Jaime editor found");
        }

        System.out.println("Valeria's news:");
        try {
            for (News news: office.getNewsListFromEditor("Valeria")) {
                System.out.println(news.headline);
            }
        } catch (NoSuchElementException e) {
            System.out.println("No Valeria editor found");
        }

        office.removeNewsFromEditor("Motos news", "Valeria");
        System.out.println("Valeria's news after removing 1 new:");
        try {
            for (News news: office.getNewsListFromEditor("Valeria")) {
                System.out.println(news.headline);
            }
        } catch (NoSuchElementException e) {
            System.out.println("No Valeria editor found");
        }

        System.out.println("\nGet score for news");
        try {
            int score = office.getScoreForNews("F1 news", "Jaime");
            System.out.println("Jaime score: " + score + " for F1 news");
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nGet price for news");
        try {
            int price = office.getPriceForNews("Motos news", "Valeria");
            System.out.println("Valeria price: " + price + " for Motos news");
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
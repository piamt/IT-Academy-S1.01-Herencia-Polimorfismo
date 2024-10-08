import java.util.HashMap;

public class Editor {

    private String name;
    private final String dni;
    private static int salary = 1500;
    private HashMap<String,News> newsList = new HashMap<>();

    public Editor(String name, String dni) {
        this.name = name;
        this.dni = dni;
        Editor.salary = 1500;
    }

    public Editor(String name, String dni, int salary) {
        this.name = name;
        this.dni = dni;
        Editor.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void addNews(News news) {
        this.newsList.put(news.headline, news);
    }

    public void removeNews(News news) {
        this.newsList.remove(news.headline);
    }

    public void removeNews(String headline) {
        this.newsList.remove(headline);
    }

    public News[] getNewsList() {
        return this.newsList.values().toArray(new News[0]);
    }

    public News getNews(String headline) throws NullPointerException {
        if (this.newsList.containsKey(headline)) {
            return this.newsList.get(headline);
        } else {
            throw new NullPointerException();
        }
    }
}

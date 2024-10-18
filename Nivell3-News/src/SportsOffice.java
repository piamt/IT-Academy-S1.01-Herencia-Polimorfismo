import java.util.HashMap;
import java.util.NoSuchElementException;

public class SportsOffice {

    private HashMap<String,Editor> editorList = new HashMap<>();

    // 1. Add editor
    public void addEditor(Editor editor) {
        editorList.put(editor.getName(), editor);
    }

    // 2. Remove editor
    public void removeEditor(String name) {
        editorList.remove(name);
    }

    //3. Add news to editor
    public void addNewsToEditor(News news, String name) throws NullPointerException {
        if (editorList.containsKey(name)) {
            editorList.get(name).addNews(news);
        } else {
            throw new NoSuchElementException("Editor not found");
        }
    }

    // 4. Remove news from editor & headline
    public void removeNewsFromEditor(String headline, String name) throws NullPointerException {
        if (editorList.containsKey(name)) {
            editorList.get(name).removeNews(headline);
        } else {
            throw new NoSuchElementException("Editor not found");
        }
    }

    // 5. Get array of News from editor
    public News[] getNewsListFromEditor(String name) throws NullPointerException {
        if (editorList.containsKey(name)) {
            return editorList.get(name).getNewsList();
        } else {
            throw new NoSuchElementException("Editor not found");
        }
    }

    // 6. Get score from new & editor
    public int getScoreForNews(String headline, String name) {
        if (editorList.containsKey(name)) {
            return editorList.get(name).getNews(headline).getScore();
        } else {
            throw new NoSuchElementException("Editor not found");
        }
    }

    // 7. Get price from new & editor
    public int getPriceForNews(String headline, String name) {
        if (editorList.containsKey(name)) {
            return editorList.get(name).getNews(headline).getPrice();
        } else {
            throw new NoSuchElementException("Editor not found");
        }
    }
}
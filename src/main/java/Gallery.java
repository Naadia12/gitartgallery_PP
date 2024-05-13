import java.util.ArrayList;

public class Gallery {

    private String name;
    private int till;
    private ArrayList<artWork> artwork;

    // constructors
    public Gallery(String name) {
        this.name = name;
        this.till = 0;
        this.artwork = new ArrayList<>();

    }
}

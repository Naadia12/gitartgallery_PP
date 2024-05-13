import java.util.ArrayList;

public class Gallery {

    private String name;
    private int till;
    private ArrayList<ArtWork> artwork;

    // constructors
    public Gallery(String name) {
        this.name = name;
        this.till = 0;
        this.artwork = new ArrayList<>();

    }

    public String getName(){
        return this.name;
    }

    public int getTill(){
        return this.till;
    }

    public ArrayList<ArtWork> getArtWork(){
        return this.artwork;
    }
}

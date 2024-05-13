public class ArtWork {

    private String title;
    private String artist;
    private int price;

    // constructors
    public ArtWork (String title, String artist, int price){
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    public String getTitle(){
        return this.title;
    }
    public String getArtist(){
        return this.artist;
    }
    public int getPrice(){
        return this.price;

    }
}

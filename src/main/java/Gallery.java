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

//    add to array list
    public void addToList(ArtWork artwork){
        this.artwork.add(artwork);
    }

//    remove from array list
    public void removeFromList(ArtWork artwork){
        this.artwork.remove(artwork);
    }

    public void sellArtwork(Customer customer, ArtWork artwork){
        customer.buyArtwork(artwork);
//        customer to buy artwork
//        if the artwork is available, then remove that artwork from array list
        if(this.artwork.contains(artwork)){
            this.till += artwork.getPrice();
            this.artwork.remove(artwork);
        }
//        set till to increase



    }

}

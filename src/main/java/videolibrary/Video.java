package videolibrary;

public class Video {

    private final String imdbID;
    private final String title;
    private final double price;

    public Video(String imdbID, String title, double price){
        this.imdbID = imdbID;
        this.title = title;
        this.price = price;
    }

    public String getImdbID(){
        return imdbID;
    }

    public String getTitle() {
        return title;
    }

    public double getRentalPrice() {
        return price;
    }
}

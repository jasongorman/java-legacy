package videolibrary;

public class Rental {
    private final Video video;

    public Rental(String imdbID) {
        this.video = Pricer.price(imdbID);
    }

    public String getVideoImdbID(){
        return video.getImdbID();
    }

    public String getVideoTitle() {
        return video.getTitle();
    }

    public double getVideoPrice(){
        return video.getRentalPrice();
    }
}

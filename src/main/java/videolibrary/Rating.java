package videolibrary;

public class Rating {
    private final String rating;
    private final String source;

    public Rating(String rating, String source) {
        this.rating = rating;
        this.source = source;
    }

    public String getRating() {
        return rating;
    }

    public String getSource() {
        return source;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "rating='" + rating + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}

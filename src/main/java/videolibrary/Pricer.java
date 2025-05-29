package videolibrary;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Pricer {
    public Video price(String imdbID) {
        String json = "";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder(URI.create("http://www.omdbapi.com/?i=" + imdbID + "&apikey=6487ec62"))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            json = response.body();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JSONObject obj = new JSONObject(json);

        String title = obj.getString("Title");
        double rating = obj.getDouble("imdbRating");

        double price = 3.95;

        if(rating >= 7.0)
            price += 1.0;

        if(rating < 4.0)
            price -= 1.0;

        return new Video(imdbID, title, price);
    }
}

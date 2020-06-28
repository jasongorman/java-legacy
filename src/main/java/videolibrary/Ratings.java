package videolibrary;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Ratings {
    public List<Rating> ratingsFor(String imdbID){
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

        JSONArray ratingsArray = obj.getJSONArray("Ratings");

        List<Rating> ratings = new ArrayList<>();

        for (int i = 0; i < ratingsArray.length(); i++){
            JSONObject rating = ratingsArray.getJSONObject(i);
            ratings.add(new Rating(rating.getString("Source"), rating.getString("Value")));
        }

        System.out.println(ratings.toString());

        return ratings;
    }
}

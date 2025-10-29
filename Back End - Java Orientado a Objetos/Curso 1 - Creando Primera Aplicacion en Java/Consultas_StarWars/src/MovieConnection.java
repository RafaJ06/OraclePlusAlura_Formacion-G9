import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class ConexionPelicula {

    HttpClient client = HttpClient.newBuilder().build();


    public String searchMovie(String search){
        String encodeSearch = URLEncoder.encode(search, StandardCharsets.UTF_8);

        try {
            HttpRequest request = HttpRequest.newBuilder().
                    uri(URI.create("https://swapi.dev/api/films/?search=" + encodeSearch))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String answer = response.body();
            System.out.println(answer);
            return answer;

        }
        catch(Exception e){
            return "An error has occurred " + e;
        }
    }



}

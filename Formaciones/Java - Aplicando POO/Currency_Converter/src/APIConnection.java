import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIConnection {

    private final String apiKey = System.getenv("My_API_Key");
    private final Gson gson = new GsonBuilder().create();

    ExchangeInformation requestCurrencyConnection(String countryCode1,
                                                  String countryCode2, double amount)
            throws IOException, InterruptedException, IllegalStateException {

        URI direction = URI.create("https://v6.exchangerate-api." +
                "com/v6/" + apiKey + "/pair/" +
                countryCode1 + "/" + countryCode2 + "/" + amount);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(direction).build();
            HttpResponse<String> answer = client.send(request, HttpResponse.BodyHandlers.ofString());

            return gson.fromJson(answer.body(), ExchangeInformation.class);
    }
}

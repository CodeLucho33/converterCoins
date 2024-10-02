import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request {

    public void getRequest(String pairConvertio, int amount) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/0a53b6b5cbc73e26f99db78d/pair"+ pairConvertio + "/" + amount;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        // Crear una instancia de JsonParser y parsear la respuesta JSON
        JsonParser parser = new JsonParser();  // Crear la instancia
        JsonElement jsonTree = parser.parse(response.body());  // Usar la instancia para parsear el String

        // Acceder a los elementos del Json
        if (jsonTree.isJsonObject()) {
            JsonObject jsonResponse = jsonTree.getAsJsonObject();
            double conversionResult = jsonResponse.get("conversion_result").getAsLong();  // Ajusta el campo según la respuesta de la API
            System.out.println("Result Convertion: " + conversionResult);
        }


    }


}

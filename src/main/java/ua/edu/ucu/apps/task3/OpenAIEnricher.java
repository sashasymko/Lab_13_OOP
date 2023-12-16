package ua.edu.ucu.apps.task3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OpenAIEnricher {
    public static Map<String, String> enrich(String domain) {
        Map<String, String> result = new HashMap<>();
        try {
            URL url = new URL(domain);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("X-Api-Key", System.getenv("API_KEY"));
            connection.connect();
            String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

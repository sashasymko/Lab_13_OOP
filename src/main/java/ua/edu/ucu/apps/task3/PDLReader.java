package ua.edu.ucu.apps.task3;

import org.json.JSONObject;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class PDLReader {
    public static void main(String[] args) {
        try {
            JSONObject jsonObject = callAPI("https://api.peopledatalabs.com/v5/company/enrich?website=ucu.edu.ua");
            System.out.println(jsonObject);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static JSONObject callAPI(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Api-Key", System.getenv("API_KEY"));
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        return new JSONObject(text);
    }
}

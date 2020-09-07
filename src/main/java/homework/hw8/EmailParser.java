package homework.hw8;

import org.json.JSONArray;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class EmailParser {
    public void emailParser(){
        File file = new File("emails.txt");
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            URL url = new URL("https://jsonplaceholder.typicode.com/" + "users");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            int responseCode = urlConnection.getResponseCode();
            StringBuilder stringBuilder = new StringBuilder();
            if (responseCode == HttpURLConnection.HTTP_OK){
                InputStream inputStream = urlConnection.getInputStream();
                int i = 0;
                while ((i = inputStream.read()) != -1){
                    stringBuilder.append((char)i);
                }
            }
            JSONArray jsonArray = new JSONArray(stringBuilder.toString());
            for (int i = 0; i < jsonArray.length(); i++) {
                String value = jsonArray.getJSONObject(i).getString("email");
                bufferedWriter.write(value + "\n");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

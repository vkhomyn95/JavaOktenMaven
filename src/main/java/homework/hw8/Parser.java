package homework.hw8;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Parser {
    private String fileName;
    private String urlToParse;

    public Parser(String fileName, String urlToParse) {
        this.fileName = fileName;
        this.urlToParse = urlToParse;
    }

    public void parser() {
        File file = new File(fileName);
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            URL url = new URL("https://jsonplaceholder.typicode.com/" + urlToParse);
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
            bufferedWriter.write(stringBuilder.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

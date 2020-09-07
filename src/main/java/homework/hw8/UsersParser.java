package homework.hw8;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class UsersParser {
    private String fileName;
    private String urlToParse;
    private Parser parser;
    public UsersParser() {
    }

    public UsersParser(String fileName, String urlToParse) {
        this.fileName = fileName;
        this.urlToParse = urlToParse;
        this.parser = new Parser(fileName, urlToParse);
        parser.parser();
    }
}

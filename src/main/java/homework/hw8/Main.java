package homework.hw8;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
//        UsersParser usersParser = new UsersParser("users.txt", "users");
//        PostsParser postsParser = new PostsParser("posts.txt", "posts");
        EmailParser emailParser = new EmailParser();
        emailParser.emailParser();

    }
}

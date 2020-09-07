package homework.hw8;

public class PostsParser {
    private String fileName;
    private String urlToParse;
    private Parser parser;

    public PostsParser(String fileName, String urlToParse) {
        this.fileName = fileName;
        this.urlToParse = urlToParse;
        this.parser = new Parser(fileName, urlToParse);
        parser.parser();
    }
}

import print.Document;
import print.Image;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        Image image = new Image();

        document.print();
        image.print();
    }
}
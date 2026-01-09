import java.io.FileReader;

public class Example11 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Example7-3\\src\\file\\test04.txt");
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
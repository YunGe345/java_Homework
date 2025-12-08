import java.util.Scanner;
import java.util.Random;

public class Guess {
    public static void main(String[] args) {
        //使用循环生成1-100的随机整数，并让用户猜测该数字是多少，使用Random类和Scanner类
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入猜测的数字：");
            int guess = scanner.nextInt();
            if (guess == number) {
                System.out.println("恭喜你，猜对了！");
                break;
            } else if (guess > number) {
                System.out.println("您猜的数字太大了！");
            } else {
                System.out.println("您猜的数字太小了！");
            }
        }
    }
}

import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // 使用循环生成1-100的随机整数，并让用户猜测该数字是多少
        int number = suijishuzi();
        game(number);   //启动游戏
        close();
    }

    /*
     生成1-100之间的随机数
     */
    private static int suijishuzi() {
        return random.nextInt(100) + 1;
    }
    
    /*
     需要猜测的目标数字
     */
    private static void game(int number) {
        while (true) {
            int guess = input();
            if (a(guess, number)) {
                break;
            }
        }
    }
    
    /*
     获取用户输入的猜测数字
     */
    private static int input() {
        System.out.println("请输入猜测的数字：");
        return scanner.nextInt();
    }
    
    /*
     * 检查用户猜测是否正确，并给出相应提示
     guess 用户猜测的数字
     number 目标数字
     */
    private static boolean a(int guess, int number) {
        if (guess == number) {
            System.out.println("恭喜你，猜对了！");
            return true;
        } else if (guess > number) {
            System.out.println("您猜的数字太大了！");
        } else {
            System.out.println("您猜的数字太小了！");
        }
        return false;
    }
    
    /*
     * 创建一个关闭所用资源的方法
     */
    private static void close() {
        scanner.close();
    }
}

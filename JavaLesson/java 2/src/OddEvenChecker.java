import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int a =  A.nextInt();
        if (a % 2 == 1) {
            System.out.println(a + "是奇数");
        }
        else{
            System.out.println(a + "是偶数");
        }
        A.close();
    }
}

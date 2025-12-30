public class FeiBoNaQie {
    static void main() {
        //写一个斐波那契数列程序，输出前20个数
        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < 18; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
        System.out.println("程序结束");
    }
}

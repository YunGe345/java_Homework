public class Example15 {
    public static void main(String[] args) {
        //使用for循环语句打印输出*，组成一个直角三角形
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Example2_5 {
    public static void main(String[] args) {
        //使用for循环语句计算1~100之间所有整数的和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1~100之间的所有整数和为：" + sum);
    }
}

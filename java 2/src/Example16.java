public class Example16 {
    public static void main(String[] args) {
        //使用while语句，求12和18的最小公倍数
        int i = 1;
        while (true) {
            if (i % 12 == 0 && i % 18 == 0) {
                System.out.println("12和18的最小公倍数是：" + i);
                break;
            }
            i++;
        }
    }
}
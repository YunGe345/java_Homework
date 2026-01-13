public class Example23 {
    //两个整数相除
    public static int divide(int x, int y) {
        int result = x / y;        //记录两个数相除的结果
        return result;             //将结果返回
    }

    public static void main(String[] args) {
        try {
            int result = divide(4, 0);    //调用divide()方法
            System.out.println(result);
        } catch (Exception e) {           //对捕获到的异常进行处理
            System.out.println("捕获的异常信息为" + e.getMessage());
            return;
        } finally {                       //用于结束当前语句
            System.out.println("进入finally代码块");
        }
        System.out.println("程序继续向下执行。");
    }
}
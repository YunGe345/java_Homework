import java.util.Scanner;

public class Disconts {
    public static void main(String[] args) {
        //创建变量，用的拼音
        double xiaofei;
        double zhifu = 0;
        String youhui = "";
        System.out.println("本商店今日促销，满足金额享折扣，快来抢购吧！");
        Scanner A = new Scanner(System.in);
        System.out.println("请输入消费金额:");
        xiaofei = A.nextDouble();
        if (xiaofei > 0) {
            if (xiaofei >= 100 && xiaofei < 200) {
                zhifu = xiaofei * 0.9;
                youhui = "九折";
                System.out.println("享九折优惠!");
            } else if (xiaofei >= 200 && xiaofei < 300) {
                zhifu = xiaofei * 0.8;
                youhui = "八折";
                System.out.println("享八折优惠!");
            } else if (xiaofei >= 300) {
                zhifu = xiaofei * 0.7;
                youhui = "七折";
                System.out.println("尊享七折优惠!");
            } else {
                System.out.println("抱歉，您的消费金额暂无优惠");
            }
        }
        System.out.println("消费金额：" + xiaofei);
        System.out.println("支付金额" +zhifu);
        System.out.println("优惠力度" + youhui);
    }
}


package WaiMai;

import java.util.Scanner;

public class OrderDerManage {
    public static void main(String[] args) {
        // 待配送订单
        Order order01 = new Order("0001", "待配送");
        Order order02 = new Order("0002", "待配送");
        Order order03 = new Order("0003", "待配送");
        Order[] orders = {order01, order02, order03};

        // 配送员
        Delivery d1 = new Deliveryman("李四", "外卖员");
        Delivery d2 = new Deliveryman("王五", "外卖员");
        Delivery d3 = new Waiter("张三", "服务员");

        // 待配送的订单数量
        int count = orders.length;
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------订单配送管理--------");
        System.out.println("1. 查询订单");
        System.out.println("2. 配送订单");
        System.out.println("3. 退出系统"); // ⚠️ 建议加上此提示，否则用户不知道如何退出

        while (true) {
            System.out.print("请输入要进行的操作：");
            int input = scanner.nextInt();

            switch (input) {
                // 查询订单
                case 1:
                    for (int i = 0; i < orders.length; i++) {
                        Order order = orders[i];
                        order.orderInfo();
                        // ⚠️ 原代码错误：Order 类中没有 getStatus() 方法！
                        // 应使用 getState()
                        if ("配送中".equals(order.getState())) {
                            System.out.print("配送员信息：");
                            order.getPerson().introduction();
                        }
                    }
                    break;

                // 配送订单
                case 2:
                    if (count == 0) {
                        System.out.println("不存在需要配送的订单！");
                    } else {
                        d1.deliver(orders[0]);
                        d2.deliver(orders[1]);
                        d3.deliver(orders[2]);
                        count = 0; // 更安全的做法：直接清零，避免多次配送
                    }
                    break;

                // 退出系统
                case 3:
                    System.out.println("退出系统...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("输入有误，请重新输入");
            }
        }
    }
}
package MilkTea;

public class TestMilkTea {
    public static void main(String[] args) {
        MilkTeaOrder order1 = new MilkTeaOrder();
        order1.showOrderInfo();
        System.out.println("当前总订单数：" + MilkTeaOrder.getTotalOrderCount());

        MilkTeaOrder order2 = new MilkTeaOrder("抹茶拿铁", "少糖", 15.0);
        order2.showOrderInfo();
        System.out.println("当前总订单数：" + MilkTeaOrder.getTotalOrderCount());

        MilkTeaOrder order3 = new MilkTeaOrder("芋圆波波奶茶", "无糖", 18.0);
        order3.showOrderInfo();
        System.out.println("当前总订单数：" + MilkTeaOrder.getTotalOrderCount());
    }
}
package MilkTea;

public class MilkTeaOrder {
    private static String shopName;
    private static int totalOrderCount = 0;
    private String drinkName;
    private String sugarLevel;
    private double price;

    static {
        shopName = "奶茶小屋";
        totalOrderCount = 0;
    }

    public MilkTeaOrder() {
        this("珍珠奶茶", "正常糖", 12.0);
    }

    public MilkTeaOrder(String drinkName, String sugarLevel, double price) {
        this.drinkName = drinkName;
        this.sugarLevel = sugarLevel;
        this.price = price;
        totalOrderCount++;
    }

    public void showOrderInfo() {
        System.out.println("店铺名称：" + shopName);
        System.out.println("饮品名称：" + this.drinkName);
        System.out.println("糖度：" + this.sugarLevel);
        System.out.println("价格：" + this.price + "元");
    }

    public static int getTotalOrderCount() {
        return totalOrderCount;
    }
}
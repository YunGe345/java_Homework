public class TlnFormation {
    public static void main(String[] args) {
        int productId = 14;
        String productName = "小米14智能手机";
        double price = 2754.05;
        boolean isAvailable = true;
        char category = 'E';
        short inventory = 200;
        long quantity = 123456789;
        float discount = 0.8f;
        byte life = 5;
        System.out.println("商品编号:" + productId);
        System.out.println("商品名称：" + productName);
        System.out.println("商品价格：" + price);
        System.out.println("是否可用：" + isAvailable);
        System.out.println("商品分类：" + category);
        System.out.println("库存数量：" + inventory);
        System.out.println("已售数量：" + quantity);
        System.out.println("商品折扣：" + discount * 100 + "%");
        System.out.println("使用寿命：" + life);
    }
}

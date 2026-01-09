public class Arr2 {
    public static void main(String[] args) {
        sum();
    }

    public static int sum(){
        int sales[] = {10,16,20,8,9,15,25,13,16,21};
        int a = 0;
        for (int i = 0;i< sales.length;i++){
            System.out.println("第" + (i+1) + "个员工的销售额是" + sales[i]);
            a += sales[i];
        }
        return a;
    }
}

package shiyong.com;

public class shiyong {

    public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    System.out.print("请输入第一个整数: ");
    int num1 = scanner.nextInt();
    
    System.out.print("请输入第二个整数: ");
    int num2 = scanner.nextInt();
    
    int sum = num1 + num2;
    System.out.println(num1 + "和" + num2 + "的和是: " + sum);
    
    scanner.close();
    }
}
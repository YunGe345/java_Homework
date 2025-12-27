package xunhuan;

import java.util.Scanner;

public class jisuanqi {
    //写一个简单的计算器程序，输入两个数字，然后进行加减乘除运算。
    public static void main(String[] args) {
        System.out.println("请输入数字1：");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("请输入数字2：");
        double b = sc.nextDouble();
        System.out.println("请输入运算符号：");
        String c = sc.next();

        double result = calculate(a, b, c);
        System.out.println("结果为：" + result);
    }
    /*
    写一个方法，用来存储各种运算和结果
    有返回值，所以不用void，形参类型为double
     */
    public static double calculate(double a, double b, String c) {
        double result = 0;
        switch (c) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("输入错误");
        }
        //返回结果
        return result;
    }
}

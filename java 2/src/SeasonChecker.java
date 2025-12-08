// 调用Scanner类
import java.util.Scanner;

public class SeasonChecker {
    public static void main(String[] args) {
        // 创建Scanner对象A，赋值内容为键盘输入的数据
        Scanner A = new Scanner(System.in);
        System.out.println("请输入一个月份:");
        int month = A.nextInt();
        System.out.println("请输入所在地区为北半球还是南半球:");
        String banqiu = A.next();
        // equals用来判断是否和括号内的内容相同，等同==；适用于字符串
        if (banqiu.equals("北半球")) {
            if (month >= 1 && month <= 12) {
                if (month == 1 || month == 2 || month == 3)
                    System.out.println("该月份是春季");
                else if (month == 4 || month == 5 || month == 6)
                    System.out.println("该月份是秋季");
                else if (month == 7 || month == 8 || month == 9)
                    System.out.println("该月份是夏季");
                else if (month == 10 || month == 11 || month == 12)
                    System.out.println("该月份是冬季");
            }
            if (banqiu.equals("南半球")) {
                if (month >= 1 && month <= 12) {
                    if (month == 1 || month == 2 || month == 3)
                        System.out.println("该月份是秋季");
                    else if (month == 4 || month == 5 || month == 6)
                        System.out.println("该月份是冬季");
                    else if (month == 7 || month == 8 || month == 9)
                        System.out.println("该月份是春季");
                    else if (month == 10 || month == 11 || month == 12)
                        System.out.println("该月份是夏季");
                }
            }
        }else {
                    System.out.println("非法输入！请看第一条指示！");
                }
            }
        }
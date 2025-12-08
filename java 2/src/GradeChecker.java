import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("请输入0到100的整数:");
        int chengji = data.nextInt();
        if (chengji >= 0 && chengji <= 100) {
            if (chengji >= 90) {
                System.out.println("优秀");
            } else if (chengji < 90 && chengji >= 80) {
                System.out.println("良好");
            } else if (chengji < 80 && chengji >= 70) {
                System.out.println("中等");
            } else if (chengji < 70 && chengji >= 60) {
                System.out.println("及格");
            } else {
                System.out.println("不及格");
            }
            data.close();
        }else {
            System.out.println("非法输入！请输入0到100的整数！");
        }
    }
}
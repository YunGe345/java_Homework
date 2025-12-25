package company;

import java.util.Scanner;

public class TestSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SalarySystem salaryManage = new SalarySystem();

        while (true) {
            System.out.println("------薪酬系统------");
            System.out.println("1. 录入员工本月薪酬信息  2. 工资明细查询  3. 退出系统");
            System.out.print("请输入操作编号：");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    salaryManage.addEmployee();
                    break;
                case 2:
                    System.out.print("请输入员工 ID:");
                    String id = scanner.next();
                    salaryManage.selectSalary(id);
                    break;
                case 3:
                    System.out.println("退出系统...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("编号输入错误，请重新输入！");
                    break;
            }
        }
    }
}
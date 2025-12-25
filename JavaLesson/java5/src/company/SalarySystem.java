package company;

import java.util.Scanner;

public class SalarySystem {
    private Employee[] employees = new Employee[100];
    private int num = 0;

    // 初始化员工信息（实例初始化块）
    {
        employees[num] = new FixedSalaryEmployee("a001", "张三", 8500, 2);
        num++;
        employees[num] = new HourlyEmployee("b001", "王五", 110, 150);
        num++;
        employees[num] = new SalesSalaryEmployee("c001", "李四", 3500, 5, 20000);
        num++;
    }

    Scanner scanner = new Scanner(System.in);

    // 录入员工信息
    public void addEmployee() {
        int flag = 0;
        do {
            System.out.print("输入员工薪资类别（1.固定工资制 2.时薪制 3.业绩制）：");
            int option = scanner.nextInt();

            // 如果编号输入错误
            if (option != 1 && option != 2 && option != 3) {
                System.out.println("类别输入有误！");
            } else {
                System.out.print("请输入员工 ID：");
                String id = scanner.next();
                System.out.print("请输入员工姓名：");
                String name = scanner.next();
                System.out.print("请输入员工薪资(时薪制输入时薪，其他输入固定薪资)：");
                double salary = scanner.nextDouble();

                if (option == 1) {
                    System.out.print("请输入本月缺勤时长（小时）：");
                    int absenceTime = scanner.nextInt();
                    employees[num] = new FixedSalaryEmployee(id, name, salary, absenceTime);
                    num++;
                }

                if (option == 2) {
                    System.out.print("请输入员工本月工作时长（小时）：");
                    double hoursWorked = scanner.nextDouble();
                    employees[num] = new HourlyEmployee(id, name, salary, hoursWorked);
                    num++;
                }

                if (option == 3) {
                    System.out.print("请输入本月缺勤时长（小时）：");
                    int absenceTime = scanner.nextInt();
                    System.out.print("请输入员工本月销售额：");
                    double sales = scanner.nextDouble();
                    employees[num] = new SalesSalaryEmployee(id, name, salary, absenceTime, sales);
                    num++;
                }
            }

            System.out.print("是否继续录入员工信息（1.是 2.否）");
            flag = scanner.nextInt();
        } while (flag == 1);
    }

    // 工资明细查询
    public void selectSalary(String id) {
        for (int i = 0; i < num; i++) {
            Employee employee = employees[i];
            if (id.equals(employee.getEmployeeId())) {
                employee.salaryInfo();
                return;
            }
        }
        System.out.println("输入的员工 ID 错误，请重新输入!");
    }
}
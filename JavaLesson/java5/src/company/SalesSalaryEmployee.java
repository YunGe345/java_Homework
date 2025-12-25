package company;

// 绩效制员工类
public class SalesSalaryEmployee extends Employee {
    private double sales; // 销售业绩金额

    public SalesSalaryEmployee(String employeeId, String name, double basicSalary, int absenceTime, double sales) {
        super(employeeId, name, basicSalary, absenceTime);
        this.sales = sales;
    }

    public double getSales() {
        return sales;
    }

    // 计算提成的方法
    public double calculateCommission() {
        double lv1 = 0.12; // 提成比例 1：0–5000 元部分
        double lv2 = 0.15; // 提成比例 2：5001–10000 元部分
        double lv3 = 0.18; // 提成比例 3：超过 10000 元部分

        if (sales <= 5000) {
            return sales * lv1;
        } else if (sales <= 10000) {
            return 5000 * lv1 + (sales - 5000) * lv2;
        } else {
            return 5000 * lv1 + 5000 * lv2 + (sales - 10000) * lv3;
        }
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + calculateCommission();
    }
}
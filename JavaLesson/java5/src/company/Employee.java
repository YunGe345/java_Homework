package company;

public abstract class Employee {
    private String employeeId; // 员工 ID
    private String name; // 员工姓名
    private double basicSalary; // 工资
    private double absenceTime; // 缺勤时长(单位：小时)

    public Employee(String employeeId, String name, double basicSalary, int absenceTime) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.absenceTime = absenceTime;
    }

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setAbsenceTime(double absenceTime) {
        this.absenceTime = absenceTime;
    }

    // 应发工资的方法（抽象方法，由子类实现）
    public abstract double calculateSalary();

    // 本月薪资明细
    public void salaryInfo() {
        // 考勤扣款
        double as = absenceTime * 50;
        // 实发工资
        double cs = calculateSalary() - as;
        System.out.println("您本月工资明细如下");
        System.out.println("Id：" + getEmployeeId() +
                ", 姓名：" + getName() +
                ", 应发工资：" + calculateSalary() + "元" +
                ", 缺勤" + absenceTime +
                "小时, 扣款：" + as +
                "元, 实发工资：" + cs);
    }
}

package company;

// 时薪制员工类
public class HourlyEmployee extends Employee {
    private double hourlyRate;   // 每小时工资
    private double hoursWorked;  // 工作时长

    public HourlyEmployee(String employeeId, String name, double hourlyRate, double hoursWorked) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        if (hoursWorked < 120) {
            setAbsenceTime(120 - hoursWorked);
        }
    }

    // 获取应发薪资
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

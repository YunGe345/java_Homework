package company;

public class FixedSalaryEmployee extends Employee {
    public FixedSalaryEmployee(String employeeId, String name, double basicSalary, int absenceTime) {
        super(employeeId, name, basicSalary, absenceTime);
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary();
    }
}

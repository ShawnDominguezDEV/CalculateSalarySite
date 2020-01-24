import java.io.Serializable;

public class Employee implements Serializable {
    private String firstName;
    private String lastName;
    private Integer monthlySalary;
    private Integer monthsOfPayment;
    private Double yearlySalary;

    public Employee() {
        firstName = "";
        lastName = "";
        monthlySalary = 0;
        monthsOfPayment = 0;
        yearlySalary = 0.0;
    }

    public Employee(String firstName, String lastName, Integer monthlySalary, Integer monthsOfPayment, Double yearlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
        this.monthsOfPayment = monthsOfPayment;
        this.yearlySalary = yearlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(Integer monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Integer getMonthsOfPayment() {
        return monthsOfPayment;
    }

    public void setMonthsOfPayment(Integer monthsOfPayment) {
        this.monthsOfPayment = monthsOfPayment;
    }

    public Double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(Double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public static double CalculateYearlySalary(Integer monthsOfPayment, Integer monthlySalary) {
        return monthsOfPayment * monthlySalary;
    }


}

package day0112;

public class Employee_04 {
    String empName;
    int salary;

    public Employee_04(String empName, int salary) {
        this.empName = empName;
        this.salary = salary;
    }

    // 메서드
    public String getEmployee(){
        return empName+","+salary;
    }


}

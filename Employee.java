package za.ac.mzilikazi.Domain;

import java.io.Serializable;

/**
 * Created by Asavela on 2016-03-13.
 */
public class Employee implements Serializable {
    String employeeName;
    int employeeNo;
    String employeeDepartment;

    public Employee() {
    }

    public Employee(String employeeName, int employeeNo, String employeeDepartment) {
        this.employeeName = employeeName;
        this.employeeNo = employeeNo;
        this.employeeDepartment = employeeDepartment;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeNo=" + employeeNo +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (employeeNo != employee.employeeNo) return false;
        if (!employeeName.equals(employee.employeeName)) return false;
        return employeeDepartment.equals(employee.employeeDepartment);

    }

    @Override
    public int hashCode() {

        return employeeNo;
    }
}

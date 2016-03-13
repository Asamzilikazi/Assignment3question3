package za.ac.mzilikazi.Service.Impl;

import za.ac.mzilikazi.Domain.Employee;
import za.ac.mzilikazi.Service.EmployeeInterface;

/**
 * Created by mandisi on 2016-03-13.
 */
public class TechnicianImpl implements EmployeeInterface {


    public Employee getEmployees() {
        Employee emp = new Employee();
        emp.setEmployeeName("Lina");
        emp.setEmployeeNo(13);
        emp.setEmployeeDepartment("Technician");
        return emp;
    }
}

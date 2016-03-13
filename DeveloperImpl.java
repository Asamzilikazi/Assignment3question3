package za.ac.mzilikazi.Service.Impl;

import za.ac.mzilikazi.Domain.Employee;
import za.ac.mzilikazi.Service.EmployeeInterface;

/**
 * Created by Asavela on 2016-03-13.
 */
public class DeveloperImpl  implements EmployeeInterface {


    public Employee getEmployees() {
        Employee emp = new Employee();
        emp.setEmployeeName("milisa");
        emp.setEmployeeNo(14);
        emp.setEmployeeDepartment("developer");
        return emp;
    }
}

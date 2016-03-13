package za.ac.mzilikazi.Service.Impl;

import za.ac.mzilikazi.Domain.Employee;
import za.ac.mzilikazi.Service.EmployeeInterface;

/**
 * Created by Asavela on 2016-03-13.
 */
    public class EmployeeImpl implements EmployeeInterface {


        public Employee getEmployees() {
            Employee emp = new Employee();
            emp.setEmployeeName("Asavela");
            emp.setEmployeeNo(15);
            emp.setEmployeeDepartment("Clerk");
            return emp;
        }
}

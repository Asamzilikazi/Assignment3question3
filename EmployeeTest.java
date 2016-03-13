package za.ac.mzilikazi;

import junit.framework.Assert;
import za.ac.mzilikazi.Config.AppConfig;
import za.ac.mzilikazi.Domain.Employee;
import za.ac.mzilikazi.Service.EmployeeInterface;

/**
 * Created by Asavela on 2016-03-13.
 */
public class EmployeeTest {

        private EmployeeInterface service;
        @BeforeMethod
        private void setUp() throws Exception {
            ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
            service = (EmployeeInterface) ctx.getBean("tester");
        }

        @Test
        public void testEmployee() throws Exception {
            Employee data = service.getEmployees();
            System.out.println(" The Department is "+service.getEmployees().getEmployeeDepartment());
            Assert.assertEquals(data.getEmployeeName(),"Developer");
        }

        @Test
        public void testEmployeeNo() throws Exception {
            Employee data = service.getEmployees();
            Assert.assertEquals(data.getEmployeeNo(),14);

        }
    }

}

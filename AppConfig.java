package za.ac.mzilikazi.Config;

import za.ac.mzilikazi.Service.EmployeeInterface;
import za.ac.mzilikazi.Service.Impl.DeveloperImpl;
import za.ac.mzilikazi.Service.Impl.EmployeeImpl;
import za.ac.mzilikazi.Service.Impl.TechnicianImpl;
import za.ac.mzilikazi.Service.Impl.TesterImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Asavela on 2016-03-13.
 */
@Configuration
public class AppConfig {


        @Bean(name="employee")
        public EmployeeInterface getEmployee(){
            return new EmployeeImpl();
        }

        @Bean(name="developer")
        public EmployeeInterface getDeveloper(){
            return new DeveloperImpl();
        }
        @Bean(name="Technician")
        public EmployeeInterface getTechnician(){
            return new TechnicianImpl();
        }
        @Bean(name="tester")
        public EmployeeInterface getTester(){
            return new TesterImpl();
        }
    }



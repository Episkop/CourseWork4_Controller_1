package ua.student.coursework4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.student.coursework4.Entity.Profit;

@SpringBootApplication
public class CourseWork4ControllerFtlhApplication {

    public static void main(String[] args) {

        Profit profit = new Profit("Salary",55.2, 548.25, 8413.222,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0);
        SpringApplication.run(CourseWork4ControllerFtlhApplication.class, args);
    }

}

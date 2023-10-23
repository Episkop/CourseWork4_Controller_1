package ua.student.coursework4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.student.coursework4.Service.ProfitService;


@Configuration
public class LoadDataBase {
    @Bean
    CommandLineRunner commandLineRunner(final ProfitService profitService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                profitService.addProfit("Salary", 484.22, 4848.33, 88474.22,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0);
            }
        };
    }
}

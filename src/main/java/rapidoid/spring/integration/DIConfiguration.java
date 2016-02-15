package rapidoid.spring.integration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import rapidoid.spring.service.DataService;
import rapidoid.spring.serviceImpl.DataServiceImpl;

/**
 * Created by Marjan on 2/10/2016.
 */
@Configuration
@ComponentScan(value={"rapidoid.spring"})
public class DIConfiguration {

    @Bean
    public DataService dataService() {
        return new DataServiceImpl();
    }


}

package rapidoid.spring.integration;


import org.rapidoid.web.Rapidoid;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rapidoid.spring.service.DataService;
import rapidoid.spring.serviceImpl.DataServiceImpl;

/**
 * Created by Marjan on 2/10/2016.
 */
public class Main {
    public static void main(String[] args) {

        Rapidoid.run(args);

        ApplicationContext ctx = new AnnotationConfigApplicationContext(DIConfiguration.class);
//        DataService myService = ctx.getBean(DataService.class);
//        System.out.println("Done right "+myService.getTextForWebDisplay());
    }
}

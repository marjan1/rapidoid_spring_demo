package rapidoid.spring.integration;

import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.GET;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import rapidoid.spring.service.DataService;

/**
 * Created by Marjan on 2/10/2016.
 */
@Controller
@Component("noBullshit")
public class NoBullshit {

    @Autowired
    private DataService dataService;

    @GET
    public String hello() {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(DIConfiguration.class);
//        DataService myService = ctx.getBean(DataService.class);
        return "Hello, world! = "+dataService.getTextForWebDisplay();
    }
}

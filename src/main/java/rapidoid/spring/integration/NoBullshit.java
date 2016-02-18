package rapidoid.spring.integration;

import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.GET;
import org.rapidoid.annotation.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import rapidoid.spring.service.DataService;
import rapidoid.spring.serviceImpl.DataServiceImpl;

/**
 * Created by Marjan on 2/10/2016.
 */
@Controller
@Component("noBullshit")
@Scope("prototype")
public class NoBullshit {

//    @Autowired
//    private DataService dataService;

    @Inject
    @Qualifier("dataService")
    private DataService dataService;

    @GET
    public String hello() {

        return "Hello, world! = "+dataService.getTextForWebDisplay();
    }
}

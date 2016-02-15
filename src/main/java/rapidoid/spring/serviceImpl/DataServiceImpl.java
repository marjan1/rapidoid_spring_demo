package rapidoid.spring.serviceImpl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import rapidoid.spring.service.DataService;

/**
 * Created by Marjan on 2/10/2016.
 */
@Service("dataService")
public class DataServiceImpl implements DataService {
    public String getTextForWebDisplay() {
        return "This is data from service";
    }
}

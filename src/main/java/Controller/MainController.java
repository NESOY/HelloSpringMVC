package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by NESOY on 2017-02-04.
 */
@Controller // @Component + 컨트롤러 역할
public class MainController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(Model model){
        return "index"; // view's Logical Name
    }
}

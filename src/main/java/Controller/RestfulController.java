package Controller;



import Model.Offer;
import Service.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by NESOY on 2017-02-08.
 */
@Controller
public class RestfulController {

    private OffersService offersService;

    @Autowired
    public void setOffersService(OffersService offersService) {
        this.offersService = offersService;
    }


    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public Map getUserList(){
        List<Offer> userList = offersService.getCurrent();

        Map result = new HashMap();

        result.put("result",Boolean.TRUE);
        result.put("data",userList);

        return result;
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map getUser(@PathVariable String id){
        Offer user = offersService.getUser(id);
        Map result = new HashMap();

        result.put("result",Boolean.TRUE);
        result.put("data",user);

        return result;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET, headers = { "Content-type=application/json" })
    @ResponseBody
    public Map insertUser(@RequestBody Offer user){
        if(user != null){
            offersService.insert(user);
        }
        Map result = new HashMap();
        result.put("result", Boolean.TRUE);
        return result;
    }

   String method4(){
        return null;
   }
}

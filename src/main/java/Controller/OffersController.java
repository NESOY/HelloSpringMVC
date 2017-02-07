package Controller;


import Service.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import Model.Offer;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by NESOY on 2017-02-05.
 */
@Controller
public class OffersController {

    private OffersService offersService;

    @Autowired
    public void setOffersService(OffersService offersService) {
        this.offersService = offersService;
    }

    @RequestMapping("/offers")
    public String showOffers(Model model){
        List<Offer> offers = offersService.getCurrent();
        model.addAttribute("offers",offers);
        return "offers";
    }

    @RequestMapping("/createoffer")
    public String createOffer(Model model){
        model.addAttribute(new Offer());
        return "createoffer";
    }

    @RequestMapping("/docreate")
    public String dpCreate(Model model, @Valid Offer offer, BindingResult result){
        if(result.hasErrors()){
            System.out.println("Form data does not validate");
            List<ObjectError> errors = result.getAllErrors();
            for (ObjectError error: errors) {
                System.out.println(error.getDefaultMessage());
            }
            return "createoffer";
        }
        offersService.insert(offer);
        return "offerCreated";
    }
}

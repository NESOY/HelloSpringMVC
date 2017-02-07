package Controller;


import Service.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import Model.Offer;

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
        return "createoffer";
    }

    @RequestMapping("/docreate")
    public String dpCreate(Model model,Offer offer){

        offersService.insert(offer);
        return "offerCreated";
    }
}

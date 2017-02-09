package Service;

import Dao.OfferDAO;
import Model.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by NESOY on 2017-02-05.
 */

@Service(value = "OffersService")
public class OffersService {
    private OfferDAO offerDAO;

    @Autowired
    public void setOfferDAO(OfferDAO offerDAO) {
        this.offerDAO = offerDAO;
    }

    public List<Offer> getCurrent() {
        return offerDAO.getOffers();
    }

    public boolean insert(Offer offer) {
        return  offerDAO.insert(offer);
    }

    public Offer getUser(String id) {
        return offerDAO.getOffer(id);
    }
}

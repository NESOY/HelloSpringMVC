package Dao;

/**
 * Created by NESOY on 2017-02-05.
 */
import Model.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;


/**
 * Created by NESOY on 2017-01-29.
 */
//@Component("offerDAO")
@Repository
public class OfferDAO {
    private JdbcTemplate jdbcTemplateObject;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public int getRowCount(){
        String sqlStatement = "select count(*) from offers";
        return jdbcTemplateObject.queryForObject(sqlStatement,Integer.class);
    }

    //querying and returning a single object
    public Offer getOffer(String name){
        String sqlStatement = "select * from offers where name=?";
        return jdbcTemplateObject.queryForObject(sqlStatement, new Object[]{name}, new OfferMapper());
    }

    //querying and returning a multiple objects
    public List<Offer> getOffers(){
        String sqlStatement = "select * from offers";
        return jdbcTemplateObject.query(sqlStatement, new OfferMapper());
    }

    public boolean insert(Offer offer){
        String name = offer.getName();
        String email = offer.getEmail();
        String text = offer.getText();

        String sqlStatement = "insert into offers (name,email,text) values (?,?,?)";

        return (jdbcTemplateObject.update(sqlStatement,new Object[]{name,email,text}) == 1);
    }

    public boolean update(Offer offer){
        int id = offer.getId();
        System.out.println("Get ID : " + id);
        String name = offer.getName();
        String email = offer.getEmail();
        String text = offer.getText();

        String sqlStatement = "update offers set name=?, email=?, text=? where id=?";

        return (jdbcTemplateObject.update(sqlStatement,new Object[]{name,email,text,id}) == 1);
    }

    public boolean delete(int id){
        String sqlStatement = "delete from offers where id=?";
        return jdbcTemplateObject.update(sqlStatement,new Object[]{id}) == 1 ;
    }
}
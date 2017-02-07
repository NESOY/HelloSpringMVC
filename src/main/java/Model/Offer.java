package Model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by NESOY on 2017-02-05.
 */
public class Offer {
    private int id;

    @Size(min=2, max=100, message = "Name must be between 2 and 100 Chars")
    private String name;

    @Email(message = "Please Provide a valid email address")
    @NotEmpty(message = "The email Address Cannot be empty")
    private String email;

    @Size(min=5, max=100, message = "Text must be between 5 and 100 chars")
    private String text;

    public Offer(){

    }

    public Offer(int id, String name, String email, String text) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.text = text;
    }

    public Offer(String name, String email, String text) {
        this.name = name;
        this.email = email;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

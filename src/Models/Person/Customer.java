package Models.Person;

import java.util.Date;

public class Customer extends Person {

    private Date dateOfBirth;
    private String phone;
    private String email;
    private String adress;

    public Customer(String id, String name) {
        super(id, name);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Customer(Date dateOfBirth, String phone, String email, String adress, String id, String name) {
        super(id, name);
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
        this.adress = adress;
    }

    public Customer(Date dateOfBirth, String email, String adress, String id, String name) {
        super(id, name);
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.adress = adress;
        this.phone = "";
    }

    public String toString() {
        return "Customer{" + "dateOfBirth=" + dateOfBirth + ", phone=" + phone + ", email=" + email + ", adress=" + adress + '}';
    }

    public int getAge() {

        return 0;

    }

    private int calculateAge() {

        return 0;

    }
}

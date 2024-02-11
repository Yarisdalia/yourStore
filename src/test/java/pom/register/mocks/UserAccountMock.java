package pom.register.mocks;

import com.github.javafaker.Faker;

public class UserAccountMock {
    // Propiedades
    private String firstName ;
    private String lastName ;
    private String eMail ;
    private String telephone ;
    private String password ;
    private String passwordConfirm ;

    // Constructor
    public UserAccountMock(){
        Faker faker = new Faker();
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.eMail = faker.bothify("????##@gmail.com");
        this.telephone = faker.phoneNumber().cellPhone();
        this.password = "yari";
        this.passwordConfirm = "yari";
    }

    // Getters y Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    // Funcionalidades


}

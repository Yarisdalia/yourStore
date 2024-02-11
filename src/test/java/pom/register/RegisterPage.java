package pom.register;

import config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pom.register.mocks.UserAccountMock;

public class RegisterPage extends BasePage {
    // Propiedades
    UserAccountMock userAccountMock;
    By firstName = By.name("firstname");
    By lastName = By.name("lastname");
    By eMail = By.id("input-email");
    By telephone = By.name("telephone");
    By password = By.name("password");
    By passwordConfirm = By.name("confirm");
    By subscribe = By.name("newsletter");
    By privacyPolicy = By.name("agree");
    By continueBtn = By.xpath("//input[@value=\"Continue\"]");
    By accountContinue = By.xpath("//a[contains(text(),\"Continue\")]");
    By myAccountText = By.xpath("//h2[contains(text(),\"My Account\")]");

    // Constructor
    public RegisterPage(WebDriver driver) {
        super(driver);
        this.userAccountMock = new UserAccountMock();
    }
    // Getters y Setters

    // Funcionalidades
    public void registrarUsuario(){
        type(userAccountMock.getFirstName(), firstName);
        type(userAccountMock.getLastName(), lastName);
        type(userAccountMock.geteMail(), eMail);
        type(userAccountMock.getTelephone(), telephone);
        type(userAccountMock.getPassword(), password);
        type(userAccountMock.getPasswordConfirm(), passwordConfirm);
        click(subscribe);
        click(privacyPolicy);
        click(continueBtn);
        waitElementAndClick(accountContinue);

    }
    public String getTextMyAccount(){
        WebElement element = findElement(myAccountText);
        String text = getText(element);
        return text;
    }







}

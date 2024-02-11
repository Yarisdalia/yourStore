package pom.register;

import config.WebBrowser;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RegisterUserTest extends TestCase {
    // Propiedades
    WebBrowser web;
    RegisterPage registerPage;

    @Before
    public void setUp() {
        web = new WebBrowser("safari");

        //instanciar la page
        registerPage = new RegisterPage(web.getDriver());
        registerPage.visit("https://opencart.abstracta.us/index.php?route=account/register");

    }

    @Test
    public void test() {
        registerPage.registrarUsuario();
        assertEquals("My Account", registerPage.getTextMyAccount());
    }

    @After
    public void tearDown() {
        web.quitWebWindow();
    }
}

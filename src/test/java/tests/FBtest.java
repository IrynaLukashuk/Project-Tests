package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.LoginToFacebook;

public class FBtest extends BaseTest {

    public  void fTEST() throws InterruptedException{
   BaseTest t = new BaseTest();
   LoginToFacebook f = new LoginToFacebook();
    t.page = f;
    t.startTestLink("https://www.facebook.com/");
    f.grabButtoms(By.id("email"),By.id("pass"),By.cssSelector("#loginbutton input"));
    f.enter("iryna.30", "password");
    f.check("Ви ввели неправильний пароль.");
    f.closeDriver();
}
}
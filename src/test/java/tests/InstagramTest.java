package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.LoginToInstagram;

public class InstagramTest extends BaseTest {



    public void testing() throws InterruptedException {
        BaseTest t = new BaseTest();
    LoginToInstagram in = new LoginToInstagram();
    t.page = in;
    in.setDriver(new ChromeDriver());
    Thread.sleep(2000);
    in.setLink("https://www.instagram.com/accounts/login/?hl=uk");
    in.grabButtoms(By.tagName("input"),By.name("password"),By.tagName("button"));
    in.enter("iryna.30", "password");
    in.check("Ви вказали неправильний пароль.");
    in.closeDriver();
}
}

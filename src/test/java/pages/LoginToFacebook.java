package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToFacebook extends LoginPage {


    public void enter(String log, String pass){

        typeLogin(log);
        typePassword(pass);
        findLogButtom();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginbutton")));
    }

}

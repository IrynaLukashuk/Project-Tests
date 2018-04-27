package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage extends BasePageObject {
    By login;
    By password;
    By logButtom;

    public void grabButtoms(By el, By p, By b){
        login = el;
        password = p;
        logButtom = b;
    }


    public void typeLogin(String s){
        driver.findElement(login).sendKeys(s);
    }
    public void typePassword(String s){
        driver.findElement(password).sendKeys(s);
    }
    public void findLogButtom(){
        driver.findElement(logButtom).submit();

    }
    public void enter(String log, String pass, String click){

        typeLogin(log);
        typePassword(pass);
        findLogButtom();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(click)));
    }



}

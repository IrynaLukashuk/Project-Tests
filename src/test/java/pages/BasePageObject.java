package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public abstract class BasePageObject {
    WebDriver driver;

public void setDriver(WebDriver D){
    String pathToDriver = "chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", pathToDriver);
    driver = D;
}

    public void setLink(String link){

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(link);
    }
    public void check(String textFromPage){
        String s = driver.getPageSource();
        if(s.contains(textFromPage)){
            System.out.println("ok");
        }
    }
    public void closeDriver(){
        driver.close();
    }
}

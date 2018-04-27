package tests;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePageObject;
import pages.LoginPage;
import pages.LoginToFacebook;


public class BaseTest {
      LoginPage page;
      public LoginPage initializePage(LoginPage P){
          page = P;
          return page;
      }



    public void startTestLink(String linkOfPage) throws InterruptedException {

         page.setDriver(new ChromeDriver());
         page.setLink(linkOfPage);
        Thread.sleep(2000);

    }






}

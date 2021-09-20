package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import singletonSession.Session;

public class ControlSelenium {
      protected WebElement control;
      protected By locator;

      public ControlSelenium(By locator){
          this.locator=locator;
      }

      protected void findControl(){
          this.control= Session.getSession().getDriver().findElement(this.locator);
      }

      public void click(){
          this.findControl();
          this.control.click();
      }

      public void fillText(String value){
          this.findControl();
          this.control.sendKeys(value);
      }

      public boolean isControlDisplayed(){
           try {
               this.findControl();
               return this.control.isDisplayed();
           }catch (Exception e){
               return false;
           }
      }

}

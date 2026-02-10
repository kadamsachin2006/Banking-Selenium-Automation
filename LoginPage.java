
package pages;
import org.openqa.selenium.*;

public class LoginPage {
 WebDriver driver;
 By user=By.id("username");
 By pass=By.id("password");
 By login=By.id("loginBtn");

 public LoginPage(WebDriver driver){this.driver=driver;}
 public void login(String u,String p){
  driver.findElement(user).sendKeys(u);
  driver.findElement(pass).sendKeys(p);
  driver.findElement(login).click();
 }
}

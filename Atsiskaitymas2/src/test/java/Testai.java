import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class Testai extends Selenium {


    @Before
    public void testSetup() {
        setup();
    }

    @Test
    public void registrationSuccessful() throws InterruptedException {
        WebElement addUserLink = browser.findElement(By.linkText("3. Add a User"));
        addUserLink.click();

        String username = "sandra" + random.nextInt(100);
        findElementByNameAndSendKeys("username", username);

        String password = "sand" + random.nextInt(100);
        findElementByNameAndSendKeys("password", password);

        browser.findElement(By.name("FormsButton2")).click();

        assertElementByXpathContainsText("/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote", "The username: " + username);
        assertElementByXpathContainsText("/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote", "The password: " + password);
    }

    @Test
    public void registrationFailed() {
        WebElement addUserLink = browser.findElement(By.linkText("3. Add a User"));
        addUserLink.click();

        String username = "sandra" + random.nextInt(100);
        findElementByNameAndSendKeys("username", username);

        String password = "sandra" + random.nextInt(100);
        findElementByNameAndSendKeys("password", password);

        browser.findElement(By.name("FormsButton2")).click();
        browser.switchTo().alert().accept();
    }

    @Test
    public void loginFailed() {
        WebElement email = browser.findElement(By.id("email"));
        email.sendKeys("sandraralyte@gmail.com");
        WebElement pass = browser.findElement(By.id("pass"));
        pass.sendKeys("geliuke");
        WebElement btn = browser.findElement(By.id("loginbutton"));
        btn.click();
        assertElementByXpathContainsText("//*[@id=\"globalContainer\"]/div[3]/div/div/div",
                "The password you’ve entered is incorrect. Forgot Password?");

    }

   // @After
    //public void closeTest() {
      //  close();
   //}
}

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.junit.Assert.*;

import java.util.Random;

public class Selenium {
    public WebDriver browser;
    Random random = new Random();

    public void setup() {

        //nurodomas kelias iki chrome driver.exe failo
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Donatas\\IdeaProjects\\Atsiskaitymas2\\drivers\\chromedriver.exe");
        browser = new ChromeDriver();
        //   browser.get("http://thedemosite.co.uk/");
        browser.get("https://www.facebook.com/");

    }

    public WebElement findElementByNameAndSendKeys(String name, String text) {
        WebElement field = browser.findElement(By.name(name));
        field.sendKeys(text);
        return field;
    }

    public void assertElementByXpathContainsText(String path, String text) {
        WebElement field = browser.findElement(By.xpath(path));
        Assert.assertThat(field.getText(), CoreMatchers.containsString(text));
    }

    public void close() {
        browser.close();
    }


}

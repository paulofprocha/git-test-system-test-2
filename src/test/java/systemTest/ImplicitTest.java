package systemTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitTest {

    public static void main(String[] args) {

        System.out.println("hello");

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);

        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.cssSelector("#block_top_menu .menu-content"));

        driver.quit();
    }
}
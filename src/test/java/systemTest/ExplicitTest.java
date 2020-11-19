package systemTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitTest {

    public static void main(String[] args) {

        System.out.println("hello");

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("http://automationpractice.com/index.php");

        WebElement element = driver.findElement(By.cssSelector("#block_top_menu .submenu-container"));

        wait.until(ExpectedConditions.visibilityOf(element));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#block_top_menu .submenu-container")));

        driver.quit();
    }
}

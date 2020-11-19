package systemTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClassroomExercise2501 {

    public static void main(String[] args) {

        System.out.println("hello");

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");

        WebElement women = driver.findElement(By.cssSelector(".menu-content li:first-child"));

        women.click();

        WebElement cart = (WebElement) driver.findElements(By.cssSelector(".shopping_cart"));

        System.out.println(cart.getText());

        driver.quit();
    }
}

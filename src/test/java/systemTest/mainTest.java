package systemTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class mainTest {

    public static void main(String[] args){

        System.out.println("hello");

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");

        WebElement firstName = driver.findElement(By.cssSelector("[name = \"first_name\"]"));

        firstName.sendKeys("Paulo");

        WebElement lastName = driver.findElement(By.cssSelector("[name = \"last_name\"]"));

        lastName.sendKeys("Rocha");

        WebElement email = driver.findElement(By.cssSelector("[name = \"email\"]"));

        email.sendKeys("pfpr@cesar.school");

        WebElement phone = driver.findElement(By.cssSelector("[name = \"phone\"]"));

        phone.sendKeys("34434141");

        WebElement address = driver.findElement(By.cssSelector("[name = \"address\"]"));

        address.sendKeys("Rua Benjamin Fonseca");

        WebElement city = driver.findElement(By.cssSelector("[name = \"city\"]"));

        city.sendKeys("Recife");

        Select state = new Select(driver.findElement(By.cssSelector("[name = \"state\"]")));

        state.selectByVisibleText("Kansas");

        WebElement zip = driver.findElement(By.cssSelector("[name = \"zip\"]"));

        zip.sendKeys("52130140");

        WebElement website = driver.findElement(By.cssSelector("[name = \"website\"]"));

        website.sendKeys("https://www.cesar.school/");

        WebElement hosting = driver.findElement(By.cssSelector("[name = \"hosting\"][value = \"yes\"]"));

        hosting.click();

        WebElement comment = driver.findElement(By.cssSelector("[name = \"comment\"]"));

        comment.sendKeys("Comentario via selenium web driver");

        WebElement buttonsend = driver.findElement(By.cssSelector("button.btn"));

        buttonsend.click();

        driver.quit();
    }
}
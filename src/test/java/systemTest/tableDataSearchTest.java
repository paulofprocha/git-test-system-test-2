package systemTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class tableDataSearchTest {

    public static void main(String[] args) {

        System.out.println("hello");

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");

        List<WebElement> linhas = driver.findElements(By.cssSelector("#task-table tbody tr"));

        for (int i = 0; i < 7; i++) {

            System.out.println(linhas.get(i).getText());
        }

        List<WebElement> colunas = driver.findElements(By.cssSelector("#task-table tbody tr td"));

        for (int i = 0; i < 4; i++) {

            System.out.println(colunas.get(i).getText());
        }

        driver.quit();
    }
}
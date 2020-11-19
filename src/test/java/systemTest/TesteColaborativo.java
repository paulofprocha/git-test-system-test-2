package systemTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteColaborativo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("hello");

        HomePage homePage = new HomePage(driver);
        EspecializacaoPage especializacaoPage = new EspecializacaoPage(driver);

        //public accessPageEspecializacao = homePage.accessPage()
        //                                        .clickPage();

        //public void validatePageEspecializacao = especializacaoPage.clickPage()

        driver.quit();
    }
}
package systemTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private String pagina = "https://www.cesar.school/";

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Localiza elementos da página

    private By saibamais = By.cssSelector("#main-home-content > div:nth-child(3) > div:nth-child(2) .sc-btn");

    //Interações

    public HomePage accessPage(){
        driver.get(this.pagina);
        return this;
    }

    public void clickPage(){
        driver.findElement(saibamais).click();
    }
}

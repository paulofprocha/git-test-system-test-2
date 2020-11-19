package systemTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EspecializacaoPage {

    private WebDriver driver;

    public EspecializacaoPage(WebDriver driver){
        this.driver = driver;
    }

    //Localiza elementos da página

    private By especializacao = By.cssSelector(".cat-item-126 a");

    private By campopesquisa = By.cssSelector(".sidebar-right .search-field");

    private By pesquisar = By.cssSelector(".sidebar-right .search-submit");

    private By resultado = By.cssSelector("#post-7707 .entry-title a");

    private By comparar = By.cssSelector("h1");

    //Interações

    public void clickPage(){
        driver.findElement(especializacao).click();
    }

    public void enterSearch(){
        driver.findElement(campopesquisa).sendKeys("testes ágeis recife");
    }

    public void clickPage2(){
        driver.findElement(pesquisar).click();
    }

    public void clickPage3(){
        driver.findElement(resultado).click();
    }

    public String comparse(){
        return driver.findElement(comparar).getText();
    }
}

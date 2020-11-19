package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import systemTest.EspecializacaoPage;
import systemTest.HomePage;

public class Steps {

    private WebDriver driver;

    HomePage homePage = new HomePage(driver);
    EspecializacaoPage especializacaoPage = new EspecializacaoPage(driver);

    @Before
    public void beforeScenario(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    @After
    public void afterScenario(){
        this.driver.quit();
    }

    @Given("É necessário que o usuário esteja na páginda inical do Cesar School")
    public void é_necessário_que_o_usuário_esteja_na_páginda_inical_do_Cesar_School() {
        homePage.accessPage();
    }

    @Then("ele clica em saiba mais")
    public void ele_clica_em_saiba_mais() {
        homePage.clickPage();
    }

    @Given("que o usuário vai clicar no campo de pesquisa")
    public void que_o_usuário_vai_clicar_no_campo_de_pesquisa() {
        especializacaoPage.clickPage();
    }

    @Then("o usuário vai digitar a especialização desejada")
    public void o_usuário_vai_digitar_a_especialização_desejada() {
        especializacaoPage.enterSearch();
    }

    @Then("ele vai clicar no botão de pesquisar")
    public void ele_vai_clicar_no_botão_de_pesquisar() {
        especializacaoPage.clickPage2();
    }

    @Then("ele vai clicar na especialização resultante da pesquisa")
    public void ele_vai_clicar_na_especialização_resultante_da_pesquisa() {
        especializacaoPage.clickPage3();
    }

    @Then("ele vai verificar se a página está de acordo com que ele procura")
    public void ele_vai_verificar_se_a_página_está_de_acordo_com_que_ele_procura() {
        Assert.assertEquals("Testes Ágeis [Recife]",especializacaoPage.comparse());
    }
}
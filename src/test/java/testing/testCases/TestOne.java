package testing.testCases;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.assertj.core.api.Assertions.assertThat;

public class TestOne {

    private Scenario log;

    private WebDriver driver;
    private String actualTitle;
    @Before
    public void setUp(Scenario scenario) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        log = scenario;
    }

    @Given("navegar a {string}")
    public void navegar_a(String url) {
        driver.get(url);
    }

    @When("optener titulo de la pagina")
    public void optener_titulo_de_la_pagina() {
        actualTitle = driver.getTitle();
    }

    @And("validar titulo de la pagina")
    public void validar_titulo_de_la_pagina(){
        log.log("Información para Zarza");
    }

    @Then("el título de la página debe ser {string}")
    public void el_título_de_la_página_debe_ser(String expectedTitle) {
        assertThat(actualTitle).containsIgnoringCase(expectedTitle);
    }

    @After
    public void down(){
        driver.quit();
    }
}

package cz.czechitas.selenium;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestyPrihlasovaniNaKurzy {

    WebDriver prohlizec;

    @BeforeEach
    public void setUp() {
//      System.setProperty("webdriver.gecko.driver", System.getProperty("user.home") + "/Java-Training/Selenium/geckodriver");
        System.setProperty("webdriver.gecko.driver", "C:\\Java-Training\\Selenium\\geckodriver.exe");
        prohlizec = new FirefoxDriver();
        prohlizec.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void ukol1() {
        prohlizec.navigate().to("https://cz-test-jedna.herokuapp.com/prihlaseni");
        WebElement email = prohlizec.findElement(By.id("email"));
        email.sendKeys("PavlaK@gmail.com");
        WebElement heslo = prohlizec.findElement(By.id("password"));
        heslo.sendKeys("Budoucnost2021");
        WebElement prihlasit = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[3]/div/button"));
        prihlasit.click();
        WebDriverWait cekani = new WebDriverWait(prohlizec, 10);
        cekani.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/header/nav/div/div[2]/div/span")));

        WebElement overeni = prohlizec.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/div/span"));
        Assertions.assertNotNull(overeni);
    }
    @Test
    public void ukol2() {
        prohlizec.navigate().to("https://cz-test-jedna.herokuapp.com/");
        WebElement akce = prohlizec.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div[2]/a"));
        akce.click();
        WebElement vytvoreniPrihlasky = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[2]/a"));
        vytvoreniPrihlasky.click();

        WebElement email = prohlizec.findElement(By.id("email"));
        email.sendKeys("PavlaK@gmail.com");
        WebElement heslo = prohlizec.findElement(By.id("password"));
        heslo.sendKeys("Budoucnost2021");
        WebElement prihlasit = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[3]/div/button"));
        prihlasit.click();

        WebElement termin = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[2]/td[2]/div/button"));
        termin.click();
        WebElement terminA = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[2]/td[2]/div/div/div[2]/ul/li/a/span"));
        terminA.click();
        WebElement jmeno = prohlizec.findElement(By.xpath("//*[@id=\"forename\"]"));
        jmeno.sendKeys("Tereza");
        WebElement prijmeni = prohlizec.findElement(By.xpath("//*[@id=\"surname\"]"));
        prijmeni.sendKeys("P");
        WebElement narozeni = prohlizec.findElement(By.xpath("//*[@id=\"birthday\"]"));
        narozeni.sendKeys("2.2.2010");
        WebElement uhrada = prohlizec.findElement(By.xpath("//label[text()='Bankovní převod']"));
        uhrada.click();
        WebElement gdpr = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[11]/td[2]/span"));
        gdpr.click();
        WebElement vytvoritPrihlasku = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[11]/td[2]/input"));
        vytvoritPrihlasku.click();
        WebDriverWait cekani = new WebDriverWait(prohlizec, 10);
        cekani.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div/div/div/table/tbody/tr[1]/td")));

        WebElement overeni = prohlizec.findElement(By.xpath("/html/body/div/header/div/nav/span[2]/a"));
        overeni.click();
        cekani.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]")));
        WebElement over = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]"));
        Assertions.assertNotNull(over);
    }


    @Test
    public void ukol3() {
        prohlizec.navigate().to("https://cz-test-jedna.herokuapp.com/prihlaseni");
        WebElement email = prohlizec.findElement(By.id("email"));
        email.sendKeys("PavlaK@gmail.com");
        WebElement heslo = prohlizec.findElement(By.id("password"));
        heslo.sendKeys("Budoucnost2021");
        WebElement prihlasit = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[3]/div/button"));
        prihlasit.click();
        WebDriverWait cekani = new WebDriverWait(prohlizec, 10);
        cekani.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/header/nav/div/div[2]/div/span")));

        WebElement prihlaska = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/div[1]/a"));
        prihlaska.click();
        WebElement obdobi = prohlizec.findElement(By.xpath("/html/body/div/div/div[1]/div[4]/div/div[2]/a"));
        obdobi.click();
        WebElement vytvoreniPrihlasky = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[2]/a"));
        vytvoreniPrihlasky.click();
        WebElement termin = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[2]/td[2]/div/button"));
        termin.click();
        WebElement terminA = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[2]/td[2]/div/div/div[2]/ul/li/a/span"));
        terminA.click();
        WebElement jmeno = prohlizec.findElement(By.xpath("//*[@id=\"forename\"]"));
        jmeno.sendKeys("Tereza");
        WebElement prijmeni = prohlizec.findElement(By.xpath("//*[@id=\"surname\"]"));
        prijmeni.sendKeys("P");
        WebElement narozeni = prohlizec.findElement(By.xpath("//*[@id=\"birthday\"]"));
        narozeni.sendKeys("2.2.2010");
        WebElement uhrada = prohlizec.findElement(By.xpath("//label[text()='Bankovní převod']"));
        uhrada.click();
        WebElement gdpr = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[11]/td[2]/span"));
        gdpr.click();
        WebElement vytvoritPrihlasku = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[11]/td[2]/input"));
        vytvoritPrihlasku.click();
        cekani.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div/div/div/table/tbody/tr[1]/td")));

        WebElement overeni = prohlizec.findElement(By.xpath("/html/body/div/header/div/nav/span[2]/a"));
        overeni.click();
        cekani.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]")));
        WebElement over = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]"));
        Assertions.assertNotNull(over);
    }
    @Test
    public void smazaniPrihlasky() {
        prohlizec.navigate().to("https://cz-test-jedna.herokuapp.com/prihlaseni");
        WebElement email = prohlizec.findElement(By.id("email"));
        email.sendKeys("PavlaK@gmail.com");
        WebElement heslo = prohlizec.findElement(By.id("password"));
        heslo.sendKeys("Budoucnost2021");
        WebElement prihlasit = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[3]/div/button"));
        prihlasit.click();
        WebDriverWait cekani = new WebDriverWait(prohlizec, 10);
        cekani.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/header/nav/div/div[2]/div/span")));

        WebElement smazat = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[5]/div/a[3]"));
        smazat.click();
        WebElement duvod = prohlizec.findElement(By.id("logged_out_other"));
        duvod.click();
        WebElement odhlaseni = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[3]/td[2]/input"));
        odhlaseni.click();

    }

    @AfterEach
    public void tearDown() {
        prohlizec.quit();
    }
}

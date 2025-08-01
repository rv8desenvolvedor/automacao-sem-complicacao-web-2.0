package br.com.chronosacademy.pages;

import br.com.chronosacademy.maps.CursoMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CursoPage {
    private WebDriver driver;
    private CursoMap cursoMap;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
        cursoMap = new CursoMap();
        PageFactory.initElements(driver,cursoMap);
    }
    /* public String getTitulo2() {
        // Espera explícita até que o elemento da nova página esteja visível
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String xpathTitulo = "//section[4]/div/div/div/div[1]/div/div";
        WebElement h2Titulo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathTitulo)));
        String titulo = h2Titulo.getText();
        return titulo;
    } */

public String getTitulo2() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOf(cursoMap.h2Titulo));
    return cursoMap.h2Titulo.getText();
    }
}

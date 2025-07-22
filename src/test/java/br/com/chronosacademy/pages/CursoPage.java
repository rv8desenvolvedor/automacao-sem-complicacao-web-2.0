package br.com.chronosacademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CursoPage {
    private WebDriver driver;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitulo2() {
        // Espera explícita até que o elemento da nova página esteja visível
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String xpathTitulo = "//section[4]/div/div/div/div[1]/div/div";
        WebElement h2Titulo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathTitulo)));
        String titulo = h2Titulo.getText();
        return titulo;
    }
}

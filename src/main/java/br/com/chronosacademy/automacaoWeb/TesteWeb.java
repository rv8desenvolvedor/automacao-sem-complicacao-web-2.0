package br.com.chronosacademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class TesteWeb {
    ChromeDriver driver;

    @Before
    public void inicializaTeste() {
        WebDriverManager.chromedriver().setup(); // Desse jeito já atualiza a versão do navegador;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");
    }

        @Test
        public void primeiroTeste () {
        String xpathTitulo = "//section[2]//h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento.", titulo);
    }

        @After
        public void finalizaTeste () {
        driver.quit(); //.close() - Fecha o navegador mas não acaba com sua execução;
        //.quit() - Fecha o navegador e encerra sua execução liberando memória
    }
}



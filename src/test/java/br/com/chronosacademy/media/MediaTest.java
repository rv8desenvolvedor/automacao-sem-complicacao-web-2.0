package br.com.chronosacademy.media;

import org.junit.Test;
import org.junit.jupiter.params.shadow.de.siegmar.fastcsv.reader.StringArrayHandler;

import static org.junit.Assert.*;

public class MediaTest {
    //Aprovado
    //Reprovado
    //void - quando não vai voltar nenhum resultado;
    //Media é a classe que geralmente se escreve com a primeira letra maiúscula;
    //media é o nome do objeto da classe com a primeira letra minúscula;
    //Depois de aprovado o teste sempre faça o oposto para o teste "quebrar" e ver se está correto o teste.

    @Test
    public void validaAprovado(){
       Media media = new Media();
       String resultado = media.calculaMedia(5.0,5.0);
       assertEquals("Aprovado", resultado);
    }

    @Test
    public void validaReprovado(){
        Media mediaBaixa = new Media();
        String resultado = mediaBaixa.calculaMedia(4.9,5.0);
        assertEquals("Reprovado", resultado);
    }

}
package br.com.capgemini.teste.questao2;

import br.com.capgemini.domain.questao2.Questao2;
import org.junit.Assert;
import org.junit.Test;

public class TesteQuestao2 {

    @Test
    public void testeTemMaiuscula(){
        Assert.assertTrue(new Questao2("Ya3").temMaiuscula());
    }

    @Test
    public void testeNaoTemMaiuscula(){
        Assert.assertFalse(new Questao2("9ab").temMaiuscula());
    }

    @Test
    public void testeTemMinuscula(){
        Assert.assertTrue(new Questao2("Ya3").temMinuscula());
    }

    @Test
    public void testeNaoTemMinuscula(){
        Assert.assertFalse(new Questao2("Y1*").temMinuscula());
    }

    @Test
    public void testeTemNumeral(){
        Assert.assertTrue(new Questao2("Ya3").temNumeral());
    }

    @Test
    public void testeNaoTemNumeral(){
        Assert.assertFalse(new Questao2("Yab").temNumeral());
    }

    @Test
    public void testeTemCaractEspeciais(){
        Assert.assertTrue(new Questao2("Ya#").temCaracteresEspeciais());
    }

    @Test
    public void testeNaoTemCaractEspeciais(){
        Assert.assertFalse(new Questao2("Yab").temCaracteresEspeciais());
    }

    @Test
    public void testeTemTamanhoMinimo(){
        Assert.assertTrue(new Questao2("Yjjjjj").quantidadeDeDigitos() >= 6);
    }

    @Test
    public void testeNaoTemTamanhoMinimo(){
        Assert.assertFalse(new Questao2("Yjjjj").quantidadeDeDigitos() >= 6);
    }

    @Test
    public void testeSenhaESegura(){
        Assert.assertEquals(0, new Questao2("Ya3#qw").contaCaracteresParaAdicionar());
    }

    @Test
    public void testeSenhaNaoESegura(){
        Assert.assertNotEquals(0, new Questao2("Ya3").contaCaracteresParaAdicionar());
    }



}

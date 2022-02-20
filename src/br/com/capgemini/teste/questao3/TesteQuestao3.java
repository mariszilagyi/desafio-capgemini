package br.com.capgemini.teste.questao3;

import br.com.capgemini.domain.questao3.Questao3;
import org.junit.Assert;
import org.junit.Test;

public class TesteQuestao3 {

    @Test
    public void testeTemDoisAnagramas(){
        Assert.assertEquals(2, new Questao3().contaParesDeAnagramas("ovo"));
    }

    @Test
    public void testeTemTresAnagramas(){
        Assert.assertEquals(3, new Questao3().contaParesDeAnagramas("ifailuhkqq"));
    }

    @Test
    public void testeTemDezAnagramas(){
        Assert.assertEquals(10, new Questao3().contaParesDeAnagramas("bbbb"));
    }

    @Test
    public void testeNaoTemAnagramas(){
        Assert.assertEquals(0, new Questao3().contaParesDeAnagramas("abcd"));
    }
}

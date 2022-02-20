package test.java.br.com.capgemini.questao3;

import main.java.br.com.capgemini.domain.questao3.Questao3;

public class TesteQuestao3 {
    public static void main(String[] args) {
        int resultadoReal = 10;
        String textoTestado = "kkkk";
        int teste = Questao3.contaParesDeAnagramas(textoTestado);
        String testePassed = teste == resultadoReal ? "PASSED" : "FAIL";
        System.out.println("\nTeste de anagramas \"" + textoTestado + "\" deve retornar " + resultadoReal + ": " + teste + " " + testePassed);

        resultadoReal = 4;
        textoTestado = "abba";
        teste = Questao3.contaParesDeAnagramas(textoTestado);
        testePassed = teste == resultadoReal ? "PASSED" : "FAIL";
        System.out.println("\nTeste de anagramas \"" + textoTestado + "\" deve retornar " + resultadoReal + ": " + teste + " " + testePassed);
    }
}

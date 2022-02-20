package test.java.br.com.capgemini.questao2;

import main.java.br.com.capgemini.domain.questao2.Questao2;

public class TesteQuestao2 {
    public static void main(String[] args) {
        int resultadoReal = 3;
        String textoTestado = "abcdef";
        int teste = Questao2.contaCaracteresParaAdicionar(textoTestado);
        String testePassed = teste == resultadoReal ? "PASSED" : "FAIL";
        System.out.println("\nTeste de senha \"" + textoTestado + "\" deve retornar " + resultadoReal + ": " + teste + " " + testePassed);

        resultadoReal = 2;
        textoTestado = "abcdeF";
        teste = Questao2.contaCaracteresParaAdicionar(textoTestado);
        testePassed = teste == resultadoReal ? "PASSED" : "FAIL";
        System.out.println("\nTeste de senha \"abcdef\" deve retornar " + resultadoReal + ": " + teste + " " + testePassed);

        resultadoReal = 3;
        textoTestado = "Ya3";
        teste = Questao2.contaCaracteresParaAdicionar(textoTestado);
        testePassed = teste == resultadoReal ? "PASSED" : "FAIL";
        System.out.println("\nTeste de senha \"abcdef\" deve retornar " + resultadoReal + ": " + teste + " " + testePassed);

        resultadoReal = 1;
        textoTestado = "Ya3333";
        teste = Questao2.contaCaracteresParaAdicionar(textoTestado);
        testePassed = teste == resultadoReal ? "PASSED" : "FAIL";
        System.out.println("\nTeste de senha \"abcdef\" deve retornar " + resultadoReal + ": " + teste + " " + testePassed);

        resultadoReal = 0;
        textoTestado = "Ya3333!";
        teste = Questao2.contaCaracteresParaAdicionar(textoTestado);
        testePassed = teste == resultadoReal ? "PASSED" : "FAIL";
        System.out.println("\nTeste de senha \"abcdef\" deve retornar " + resultadoReal + ": " + teste + " " + testePassed);
    }
}

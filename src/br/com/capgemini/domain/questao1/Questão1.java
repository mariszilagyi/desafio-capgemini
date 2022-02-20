package br.com.capgemini.domain.questao1;

public class Questão1 {
    StringBuilder escada = new StringBuilder();


    public void imprimirEscada(int n) {
        for (int i = 0; i < n; i++) {
            escada.append(" ");
        }

        for(int i = 1; i < n + 1; i++){
            escada.setCharAt(n - i, '*');
            System.out.println(escada);
        }

    }

}

package br.com.capgemini.domain.questao1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Questão1 questao1 = new Questão1();
        questao1.imprimirEscada(scan.nextInt());

        scan.close();

    }


}


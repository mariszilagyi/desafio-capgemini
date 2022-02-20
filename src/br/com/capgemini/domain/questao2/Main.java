package br.com.capgemini.domain.questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Questao2 questao2 = new Questao2(scan.next());

        System.out.println(questao2.contaCaracteresParaAdicionar());

        scan.close();


    }



    


    
}

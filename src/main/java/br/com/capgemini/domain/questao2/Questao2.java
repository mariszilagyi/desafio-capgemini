package main.java.br.com.capgemini.domain.questao2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("""
                Password Security Check v.1.0

                Por favor, insira a sua senha para verificar quantos caracteres faltam para estar de acordo com as regras de governança:\s""");

        System.out.println(contaCaracteresParaAdicionar(scan.next()));
        scan.close();
    }

    public static int contaCaracteresParaAdicionar(String senha) {
        final int QTD_DIGITOS_SOLICITADOS = 6;
        int contadorCaracteres = 0;

        if (!senha.matches(".*[A-Z].*")) {
            contadorCaracteres++;
        }

        if (!senha.matches(".*[a-z].*")) {
            contadorCaracteres++;
        }

        if (!senha.matches(".*[0-9].*")) {
            contadorCaracteres++;
        }

        if (!senha.matches(".*[!@#$%^&*()\\-+].*")) {
            contadorCaracteres++;
        }

        if (QTD_DIGITOS_SOLICITADOS - senha.length() > contadorCaracteres) {
            contadorCaracteres = QTD_DIGITOS_SOLICITADOS - senha.length();
        }

        return contadorCaracteres;
    }
}

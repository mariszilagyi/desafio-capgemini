package main.java.br.com.capgemini.domain.questao1;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao1 {
    public static ArrayList<String> stdoutHistory = new ArrayList<>();

    public static void main(String[] args) {
        int degraus;
        StringBuilder escada = new StringBuilder();
        Scanner scan = new Scanner(System.in);

        System.out.print("""
                Construtor de escadas v.1.0

                Por favor, insira o número de degraus para a sua escada:\s
                """);

        if (args == null) {
            degraus = scan.nextInt();
        } else {
            degraus = Integer.parseInt(String.join("", args));
        }

        escada.append(" ".repeat(Math.max(0, degraus)));

        for (int i = 1; i < degraus + 1; i++) {
            escada.setCharAt(degraus - i, '*');
            System.out.println(escada);
            stdoutHistory.add(String.valueOf(escada));
        }
        scan.close();
    }
}

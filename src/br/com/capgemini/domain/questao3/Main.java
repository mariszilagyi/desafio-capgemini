package br.com.capgemini.domain.questao3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Questao3 questao3 = new Questao3();

           try {
            System.out.println(questao3.contaParesDeAnagramas(bufferedReader.readLine()));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        bufferedReader.close();

    }
}




package main.java.br.com.capgemini.domain.questao3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Questao3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("""
                Anagram Verifier v.1.0

                Por favor, insira uma sequência de caracteres (será retornada a quantidade de anagramas):\s""");

        try {
            System.out.println(contaParesDeAnagramas(bufferedReader.readLine()));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        bufferedReader.close();
    }

    static public Map<String, Integer> criaDicionarioSubstrings(String texto) {
        int tamanhoDoTexto = texto.length();

        Map<String, Integer> substrings = new HashMap<>();
        for (int i = 0; i < tamanhoDoTexto; i++) {
            for (int j = 1; j <= tamanhoDoTexto - i; j++) {
                char[] substring1 = texto.substring(i, j + i).toCharArray();
                Arrays.sort(substring1);
                String substring2 = String.valueOf(substring1);
                if (substrings.containsKey(substring2)) {
                    substrings.put(substring2, (substrings.get(substring2) + 1));
                } else {
                    substrings.put(substring2, 1);
                }
            }
        }
        return substrings;
    }

    static public int contaParesDeAnagramas(String texto) {
        int paresDeSubstring = 0;
        Collection<Integer> valoresDicionarioSubstring = criaDicionarioSubstrings(texto).values();

        for (Integer valor : valoresDicionarioSubstring) {
            paresDeSubstring += (valor * (valor - 1)) / 2;
        }

        return paresDeSubstring;
    }
}


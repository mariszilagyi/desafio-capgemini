package br.com.capgemini.domain.questao3;

import java.util.*;

/**
 * Resolução #Questão 3 do DESAFIO DE PROGRAMAÇÃO — ACADEMIA CAPGEMINI que consiste em: dada uma ‘string’ qualquer,
 * desenvolver um algoritmo que encontre o número de pares de substrings que são anagramas.
 *
 * @author Mariana Szilagyi Santos
 * @version 1.0
 **/

public class Questao3 {

    private Map<String, Integer> criaDicionarioSubstrings(String texto) {
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

    public int contaParesDeAnagramas(String texto) {
        int paresDeSubstring = 0;

        for (Integer valor : criaDicionarioSubstrings(texto).values()) {
            paresDeSubstring += (valor * (valor - 1)) / 2;
        }
        return paresDeSubstring;
    }

}


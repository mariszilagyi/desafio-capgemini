package test.java.br.com.capgemini.questao1;

import main.java.br.com.capgemini.domain.questao1.Questao1;

public class TesteQuestao1 {
    static final String ESCADA_VALIDADA_10 = "         *\n" +
            "        **\n" +
            "       ***\n" +
            "      ****\n" +
            "     *****\n" +
            "    ******\n" +
            "   *******\n" +
            "  ********\n" +
            " *********\n" +
            "**********";

    static final String ESCADA_VALIDADA_6 = "     *\n" +
            "    **\n" +
            "   ***\n" +
            "  ****\n" +
            " *****\n" +
            "******";

    public static void main(String[] args) {
        int numDegraus = 6;
        Questao1.main(new String[]{String.valueOf(numDegraus)});
        String escadaDoTeste = String.join("\n", Questao1.stdoutHistory);
        String Teste = escadaDoTeste.equals(ESCADA_VALIDADA_6) ? "PASSED" : "FAIL";
        System.out.println("\nTeste de escada com " + numDegraus + " degraus: " + Teste);

        Questao1.stdoutHistory.clear();

        numDegraus = 10;
        Questao1.main(new String[]{String.valueOf(numDegraus)});
        escadaDoTeste = String.join("\n", Questao1.stdoutHistory);
        Teste = escadaDoTeste.equals(ESCADA_VALIDADA_10) ? "PASSED" : "FAIL";
        System.out.println("\nTeste de escada com " + numDegraus + " degraus: " + Teste);
    }
}


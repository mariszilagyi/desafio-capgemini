package br.com.capgemini.domain.questao2;

public class Questao2 {


    private final String senha;
    private int contadorCaracteres = 0;
    private final int QtdDigitosSolicit = 6;

    public Questao2(String senha) {
        this.senha = senha;
    }

        public boolean temMaiuscula() {
        return senha.matches(".*[A-Z].*");
    }

    public boolean temMinuscula() {
        return senha.matches(".*[a-z].*");
    }

    public boolean temNumeral(){
         return senha.matches(".*[0-9].*");
    }

    public boolean temCaracteresEspeciais(){
        return senha.matches(".*[!@#$%^&*()\\-+].*");
    }

    public int quantidadeDeDigitos() {
       return senha.length();
    }

    public int contaCaracteresParaAdicionar(){
        if (!temMaiuscula()) contadorCaracteres += 1;
        if (!temMinuscula()) contadorCaracteres += 1;
        if (!temNumeral()) contadorCaracteres +=1;
        if (!temCaracteresEspeciais()) contadorCaracteres +=1;
        if (this.QtdDigitosSolicit - quantidadeDeDigitos() > contadorCaracteres){
            contadorCaracteres = this.QtdDigitosSolicit - quantidadeDeDigitos();
        }
        return contadorCaracteres;
    }
}

# DESAFIO DE PROGRAMAÇÃO CAPGEMINI 2022

# desafio-capgemine



### Autora: Mariana Szilagyi Santos

Projeto desenvolvido em Java para a o processo seletivo da Academia Capgemini de 2022.



### 1) Objetivo

Esse projeto apresenta a solução para as 3(três) questões propostas pelo Desafio de Programação.



#### Questão 01

Escreva um algoritmo que mostre na tela uma escada de tamanho **n** utilizando o caractere ***** e espaços. A base e altura da escada devem ser iguais ao valor de **n.** A última linha não deve conter nenhum espaço.

**Exemplo:**

**Entrada:**

```
n = 6
```

**Saída:**

```
     *
    **
   ***
  ****
 *****
******
```



#### Questão 02



Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:

- Possui no mínimo 6 caracteres;
- Contém no mínimo 1 digito;
- Contém no mínimo 1 letra em minúsculo;
- Contém no mínimo 1 letra em maiúsculo;
- Contém no mínimo 1 caractere especial. Os caracteres especiais são: **!@#$%^&*()-+**

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

**Exemplo:**

**Entrada:**

```
Ya3
```

**Saída:**

```
3
```



#### Questão 03

Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

**Exemplo:**

**Entrada:**

```
ovo
```

**Saída:**

```
2
```



### 2) Requisitos

Para executar o projeto será necessário instalar os seguintes programas:

* Java versão 8 ou superior.

* JUnit4 ou superior.

* Pode ser utilizada a IDE da sua preferência ou pode ser executado pelo terminal

  

### 3) Execução

#### Projeto

* Efetue um clone deste repositório;
* Abra a pasta salva no terminal;

#### Projeto

* Digite o comando: 

```
javac <ClasseASerExecutada>.java;
```

* Digite o comando: 

```
java <ClasseASerExecutada>
```

#### Testes

- Digite o comando: 

```
javac <ClasseASerTestada>.java
```

- Digite o comando: 

```
javac -cp junit-4.13.jar;. <ClasseASerTestada>.java
```

- Digite o comando: 

```
java -cp junit-4.13.jar;hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore <ClasseASerTestada>
```



### 4) Documentação

#### Classe Questao1

main.java.br.com.capgemini.domain.questao1



public class Questao1

A classe tem por objetivo atender a Questão 1 do Desafio de Programação Academia Capgemini 2022 que consiste em gerar um algoritmo que mostre na tela uma escada de tamanho **n** utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

##### Métodos

| Modificador | Tipo        | Método | Descrição                                                    |
| ----------- | ----------- | ------ | ------------------------------------------------------------ |
| public      | static void | main() | Recebe um valor n que trata-se da quantidade de degraus e retorna na tela a escada utilizando o caractere *. |



#### Classe Questao2

main.java.br.com.capgemini.domain.questao2



public class Questao2

A classe tem por objetivo atender a Questão 2 do Desafio de Programação Academia Capgemini 2022 que consiste em gerar um algoritmo que mostre a quantidade de caracteres mínimos faltantes para criar uma senha forte considerando os seguintes critérios:

- Possui no mínimo 6 caracteres;
- Contém no mínimo 1 digito;
- Contém no mínimo 1 letra em minúsculo;
- Contém no mínimo 1 letra em maiúsculo;
- Contém no mínimo 1 caractere especial. Os caracteres especiais são: **!@#$%^&*()-+**

##### Métodos

| Modificador | Tipo        | Método                                     | Descrição                                                    |
| ----------- | ----------- | ------------------------------------------ | ------------------------------------------------------------ |
| public      | static int  | contaCaracteresParaAdicionar(String senha) | Método retorna a quantidade de caracteres mínimos necessários para satisfazer os requisitos da String senha de acordo com os critérios solicitados. |
| public      | static void | main()                                     | Executa o método contaCaracteresParaAdicionar()              |



#### Classe Questão 3

main.java.br.com.capgemini.domain.questao3



A classe tem por objetivo atender a Questão 3 do Desafio de Programação Academia Capgemini 2022 que consiste em dada uma String qualquer, desenvolver um algoritmo que encontre o número de pares de substrings que são anagramas.



| Modificador | Tipo                 | Método                                 | Descrição                                                    |
| ----------- | -------------------- | -------------------------------------- | ------------------------------------------------------------ |
| private     | Map<String, Integer> | criaDicionarioSubstrings(String texto) | Recebe uma String texto e cria um dicionário com as substrings ordenadas alfabeticamente que são armazenadas no HashMap substrings como chave e no campo valor é inserida a quantidade de vezes que dada (chave) aparece. Retorna substrings. |
| public      | int                  | contaParesDeAnagramas(String texto)    | Método recebe uma String texto e a utiliza no método  criaDicionarioSubstrings que retorna um Hashmap contendo as substrings do texto como chave e a quantidade de vezes que cada uma aparece como valor. O método aplica o algoritmo *(valor(valor-1))/2*  que é capaz de verificar quantas substrings são anagramas de acordo com o valor de cada chave, somando a quantidade à variável int paresDeSubstrings. Retorna paresDeSubstrings. |
| public      | static void          | main()                                 | Executa o método contaParesDeAnagramas()                     |






































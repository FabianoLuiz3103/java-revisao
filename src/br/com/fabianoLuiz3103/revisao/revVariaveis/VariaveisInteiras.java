package br.com.fabianoLuiz3103.revisao.revVariaveis;

public class VariaveisInteiras {

    public static void main(String[] args) {

        byte idade01 = 20;
        short idade02 = 21;
        int idade03 = 22;
        long idade04 = 23;

        System.out.println("Valor variável idade01: " + idade01);
        System.out.println("Valor variável idade02: " + idade02);
        System.out.println("Valor variável idade03: " + idade03);
        System.out.println("Valor variável idade04: " + idade04);


        // Curiosidade

        int var1 = 2147483647; //limite do int
        int var2 = 1;

        //para qualquer tipo inteiro do java, após exceder o limite, volta para o menor valor
        System.out.println(var1 + var2); // -2147483648

    }
}

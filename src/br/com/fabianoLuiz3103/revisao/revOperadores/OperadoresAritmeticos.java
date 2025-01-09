package br.com.fabianoLuiz3103.revisao.revOperadores;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        //soma '+'
        int resultado = 1 + 2;
        System.out.println("Soma: " + resultado);

        //subtração '-'
        resultado = resultado - 1;
        System.out.println("Subtração: " + resultado);

        //multiplicação '*'
        resultado = resultado * 2;
        System.out.println("Multiplicação: " + resultado);

        //divisao '/'
        resultado = resultado / 2;
        System.out.println("Divisão: " + resultado);

        //soma '+'
        resultado = resultado + 8;
        System.out.println("Soma: " + resultado);

        //modular '%' -> resto da divisã0
        resultado = resultado % 7;
        System.out.println("MOD: " + resultado);

        //Concatenação '+'
        String primeiroNome = "Fabiano";
        String sobrenome = "Luiz";
        System.out.println("String concatenada: " + primeiroNome + sobrenome);

        //Incrementar 1 '++'
        resultado++;
        System.out.println("Incrementar 1: " + resultado);

        System.out.println(resultado++); //vai imprimir primeiro e somar dps
        //mesma coisa que
        //System.out.println(resultado);
        //resultado = resultado + 1;
        //resultado += 1;

        System.out.println(++resultado);//vai somar primeiro e imprimir depois
        //mesma coisa que
        //resultado +=1;
        //System.out.println(resultado);


        //Decrementar 1 '--'
        resultado--;
        System.out.println("Decrementar 1: " + resultado);

        System.out.println(resultado--); //vai imprimir primeiro e subtrair dps
        //mesma coisa que
        //System.out.println(resultado);
        //resultado = resultado - 1;
        //resultado -= 1;

        System.out.println(--resultado);//vai subtrair primeiro e imprimir depois
        //mesma coisa que
        //resultado -=1;
        //System.out.println(resultado);

    }
}

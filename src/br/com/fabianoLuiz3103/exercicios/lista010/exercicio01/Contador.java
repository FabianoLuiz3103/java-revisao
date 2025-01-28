package br.com.fabianoLuiz3103.exercicios.lista010.exercicio01;

/**
 * Chamar Contador.incrementar() é a
 * mesma coisa de fazer Contador c = new Contador() --> Aqui é instânciando
 * Uma variável static é a mesma para todas as instâncias!
 */
public class Contador {

    private static int cont; //--> Compartilhado com todas as instâncias da classe

    Contador(){
        cont++;
    }
    public static void incrementar(){ //--> Método static só pode acessar atributo static diretamente
        cont++;
    }

    public static void zerar(){
        cont=0;
    }

    public static int obeterValor(){
        return cont;
    }
}

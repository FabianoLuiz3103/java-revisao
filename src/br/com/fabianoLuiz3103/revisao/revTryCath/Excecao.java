package br.com.fabianoLuiz3103.revisao.revTryCath;

/**
 * try - "tente"
 * --> Bloco que é monitorado para erros
 *
 * catch - "capture"
 * --> Tratamento do erro
 *
 * uma exception encerra o programa, tratar ela evita isso
 */
public class Excecao {

    public static void main(String[] args) {

        try{
            int[] vetor = new int[4];

            System.out.println("Antes da exception");

            vetor[4] = 1;

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exceção ao acessar indice que não existe");
        }

        System.out.println("Esse texto será impresso depois da exception9");

    }
}

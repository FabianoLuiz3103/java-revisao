package br.com.fabianoLuiz3103.revisao.revTryCath;

import java.util.Scanner;

/**
 * Throwable -> classe mãe de todas as exceptions e possui métodos úteis
 * --> Não usar Throwable para pegar exception genérica tem que usar Exception
 *
 * getMessage() -> Retorna a descrição do erro
 * printStackTrace() -> Imprime o stack trace do erro -> em qual linha aconteceu o erro
 *
 *
 * Erro x Exception
 * Error -> Não é tratado
 * Exception->  é tratada
 * Runtime -> Acontece em tempo de execução, não tem o que fazer, só try e catch -> São não verificadas
 * Exception verificadas o compilador já avisa que precisa tratar ela
 */
public class StacktraceThrows {

    public static void main(String[] args) {

        int[] numeros = {4,8,16,32,64,128};
        int[] denom = {2,0,4,8,0};

        for(int i = 0; i < numeros.length; i++){
            try{
                System.out.println(numeros[i] + "/" + denom[i] + "=" + (numeros[i]/denom[i]));
            }catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace(); //--> Não posso exibir isso para o usuário
            }
        }

        /*
        Throws:
        --> Usamos quando não queremos tratar a exceção
        - Método pode disparar uma Exception;
        - Passa a responsabilidade para quem for utilizar o método tratar a exceção;
        - Exceptions disparadas em tempo de execução (ArrayOut, Arith) não
        precisam de throws explicitamente
         */

        System.out.println("Entre com um número decimal: ");
        try {
            double n = lerNumero();
        } catch (Exception e) {
            System.out.println("Entrada inválida! ");

        }
    }

    public static double lerNumero() throws Exception{
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}

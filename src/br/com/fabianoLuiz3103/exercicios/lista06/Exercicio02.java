package br.com.fabianoLuiz3103.exercicios.lista06;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Receber o número total de eleitores, nº votos nulos, brancos e válidos
 * --> retornar a porcentagem de cada
 */
public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int eleitores, vBrancos, vNulos = 0, vValidos = 0;

        eleitores = receberInteiro(scanner, "\n\tInforme a quantidade de eleitores: ");
        vBrancos = receberComValidacao(scanner, "\n\tInforme a quantidade de votos brancos: ", eleitores);
        vNulos = receberComValidacao(scanner, "\n\tInforme a quantidade de votos nulos: ", (eleitores-vBrancos));
        vValidos = eleitores - (vBrancos+vNulos);


        System.out.printf("\n------------------------------------" +
                "QUANTIDADE DE ELEITORES: %d" +
                "\nVOTOS BRANCOS: %.2f %%" +
                "\nVOTOS  NULOS: %.2f %%" +
                "\nVOTOS VÁLIDOS: %.2f %%",
                eleitores,
                retornarPorcentagem(eleitores, vBrancos),
                retornarPorcentagem(eleitores, vNulos),
                retornarPorcentagem(eleitores, vValidos));

    }

    private static double retornarPorcentagem(int eleitores, int votos){
        return votos/((double)eleitores/100);
    }

    private static int receberInteiro(Scanner scanner, String texto){
        int valor;
        while (true){
            try{
                System.out.print(texto);
                valor = scanner.nextInt();
                if(valor > 0){return valor;}
                System.out.println("\n\tERRO! O valor deve ser maior que zero.");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser um número inteiro!");
                scanner.nextLine();
            }
        }
    }

    private static int receberComValidacao(Scanner scanner, String mensagem, int limite) {
        int valor;
        if(limite > 0){
            while (true) {
                valor = receberInteiro(scanner, mensagem);
                if (valor <= limite) {
                    return valor;
                }
                System.out.println("ERRO: O valor não pode exceder " + limite + ".");
            }
        }else{
            return 0;
        }
    }
}

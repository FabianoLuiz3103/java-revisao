package br.com.fabianoLuiz3103.exercicios.lista05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Jogo da velha
 */
public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];
        char jogador = 0;
        int linha, coluna;
        boolean ganhou = false;
        int jogadas = 1;

        do{
            jogador = jogadas%2!=0 ? 'X' : 'O';
            while(true){

                System.out.println("\nJogador " + jogador + " digite onde deseja colocar sua peça :");
                linha = receberInteiro(scanner, "\n\tLinha: (0-2)");
                coluna = receberInteiro(scanner, "\n\tColuna: (0-2)");
                if (tabuleiro[linha][coluna] == 0) {
                    tabuleiro[linha][coluna] = jogador;
                    for (int i = 0; i < tabuleiro.length; i++) {
                        for (int j = 0; j < tabuleiro[i].length; j++) {
                            System.out.print(tabuleiro[i][j]==0 ? " | " : tabuleiro[i][j] +" | ");
                        }
                        System.out.println();
                    }
                    break;
                } else {
                    System.out.println("\n\tERRO! A posição já foi preenchida! ");
                }
            }
            jogadas++;

            if(verificarGanhador(tabuleiro, jogador)){
                ganhou=true;
                System.out.println("\n\tPARABÉNS JOGADOR " + jogador + ", VOCÊ GANHOU!");
            }else if(jogadas > 9){
                ganhou = true;
                System.out.println("\n\tDEU VELHA!");
            }
        }while (!ganhou);
    }

    private static boolean verificarGanhador(char[][] tabuleiro, char jogador){
        for(int i = 0; i<tabuleiro.length;i++){
            if(tabuleiro[i][0]==jogador&&tabuleiro[i][1]==jogador&&tabuleiro[i][2]==jogador||
                    tabuleiro[0][i]==jogador&&tabuleiro[1][i]==jogador&&tabuleiro[2][i]==jogador) {
                return true;
            }
        }
        return (tabuleiro[0][0]==jogador&&tabuleiro[1][1]==jogador&&tabuleiro[2][2]==jogador||
                tabuleiro[0][2]==jogador&&tabuleiro[1][1]==jogador&&tabuleiro[2][0]==jogador);
    }

    private static int receberInteiro(Scanner scanner, String texto){
        int valor;
        while(true){
            try{
                System.out.println(texto);
                valor = scanner.nextInt();
                if(valor >= 0 && valor < 3){
                    return valor;
                }
                System.out.println("\n\tERRO! O valor deve estar entre 0 e 2!");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser um número inteiro! ");
                scanner.nextLine();
            }
        }
    }
}

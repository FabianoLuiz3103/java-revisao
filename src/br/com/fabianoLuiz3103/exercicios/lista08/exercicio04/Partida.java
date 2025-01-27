package br.com.fabianoLuiz3103.exercicios.lista08.exercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Partida {

    Tabuleiro tabuleiro;
    boolean terminou;

    void iniciar(){
        tabuleiro = new Tabuleiro();
        System.out.println();
        tabuleiro.exibir();
    }

    void jogada(int linha, int coluna, char simbolo){
        tabuleiro.inserirNoTabuleiro(linha, coluna, simbolo);
            tabuleiro.exibir();
            terminou = tabuleiro.verificarGanhador(simbolo);
    }

    boolean consultarGanhador(char simbolo, int jogadas){
        if(terminou){
            System.out.println("\n\n\t\tPARABÉNS JOGADOR " + simbolo + " VOCÊ GANHOU!!");
        }else if(jogadas>9){
            System.out.println("\n\n\t\tDEU VELHA!");
            return true;
        }
        return  terminou;
    }

    boolean consultarPosicao(int linha, int coluna){
        return tabuleiro.estaOcupado(linha, coluna);
    }

    int receberLinhaColuna(Scanner scanner, String texto){
        int valor = 0;
        while (true){
            try{
                System.out.print(texto);
                valor = scanner.nextInt();
                if(valor>=0&&valor<3){return valor;}
                System.out.println("\n\tERRO! O valor deve estar entre 0 e 2");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                scanner.nextLine();
            }
        }
    }
}

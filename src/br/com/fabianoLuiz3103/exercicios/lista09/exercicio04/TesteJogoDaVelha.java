package br.com.fabianoLuiz3103.exercicios.lista09.exercicio04;

import java.util.Scanner;

public class TesteJogoDaVelha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char jogador = 0;
        int linha, coluna;
        boolean terminou = false;
       Partida partida = new Partida();
       partida.iniciar();
       do{
           jogador = partida.vezJogadorX()?'X':'O';
           System.out.println("\n\n\tJOGADOR --> " + jogador + " <-- É A SUA VEZ: ");
               linha = partida.receberLinhaColuna(scanner, "\n\tInforme o valor da linha (0,1 ou 2): ");
               coluna = partida.receberLinhaColuna(scanner, "\n\tInforme o valor da coluna (0,1 ou 2): ");
               System.out.println();
               if(!partida.jogada(linha, coluna, jogador)) {
                   System.out.println("\n\tERRO! A posição já está preenchida! ");
               }
           terminou = partida.consultarGanhador(jogador);
       }while (!terminou);

    }

}

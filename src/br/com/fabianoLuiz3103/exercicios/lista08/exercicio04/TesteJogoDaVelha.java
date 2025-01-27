package br.com.fabianoLuiz3103.exercicios.lista08.exercicio04;

import java.util.Scanner;

public class TesteJogoDaVelha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char jogador = 0;
        int jogadas=1, linha, coluna;
        boolean terminou = false, isPreenchido = false;
       Partida partida = new Partida();
       partida.iniciar();

       do{
           jogador = jogadas%2==0?'X':'0';
           System.out.println("\n\n\tJOGADOR " + jogador + " É A SUA VEZ: ");
           do {
               linha = partida.receberLinhaColuna(scanner, "\n\tInforme o valor da linha (0,1 ou 2): ");
               coluna = partida.receberLinhaColuna(scanner, "\n\tInforme o valor da coluna (0,1 ou 2): ");
               System.out.println();
               isPreenchido = partida.consultarPosicao(linha, coluna);
               if(isPreenchido){
                   System.out.println("\n\tERRO! A posição já está preenchida! ");
               }
           } while (isPreenchido);
           jogadas++;
           partida.jogada(linha, coluna, jogador);
           terminou = partida.consultarGanhador(jogador, jogadas);
       }while (!terminou);

    }

}

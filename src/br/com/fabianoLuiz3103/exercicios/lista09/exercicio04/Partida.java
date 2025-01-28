package br.com.fabianoLuiz3103.exercicios.lista09.exercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Partida {

    private Tabuleiro tabuleiro;
    private boolean terminou;
    private int jogada;


    public void iniciar(){
        tabuleiro = new Tabuleiro();
        jogada=1;
        System.out.println();
        tabuleiro.exibir();
    }

    public boolean vezJogadorX(){
        return this.jogada%2==0;
    }

    public boolean jogada(int linha, int coluna, char simbolo){
        if(tabuleiro.estaOcupado(linha, coluna)){
            return false;
        }else{
            this.tabuleiro.inserirNoTabuleiro(linha, coluna, simbolo);
            this.tabuleiro.exibir();
            this.terminou = tabuleiro.verificarGanhador(simbolo);
            this.jogada++;
            return true;
        }
    }

    public boolean consultarGanhador(char simbolo){
        if(this.terminou){
            System.out.println("\n\n\t\tPARABÉNS JOGADOR " + simbolo + " VOCÊ GANHOU!!");
        }else if(this.jogada>9){
            System.out.println("\n\n\t\tDEU VELHA!");
            return true;
        }
        return this.terminou;
    }

    public int receberLinhaColuna(Scanner scanner, String texto){
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

package br.com.fabianoLuiz3103.exercicios.lista08.exercicio04;

public class Tabuleiro {

    char[][] tbl = new char[3][3];

    void exibir() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(((tbl[i][j] == 0) ? " " : tbl[i][j]) +
                        ((j < 2) ? " | " : ""));
            }
            if (i < 2) {
                System.out.println("\n--|---|--");
            }
        }
    }

    void inserirNoTabuleiro(int linha, int coluna, char simbolo){
            tbl[linha][coluna] = simbolo;
    }

    boolean verificarGanhador(char simbolo){
        for(int i = 0; i<tbl.length;i++){
            if(tbl[i][0]==simbolo&&tbl[i][1]==simbolo&&tbl[i][2]==simbolo||
                    tbl[0][i]==simbolo&&tbl[1][i]==simbolo&&tbl[2][i]==simbolo) {
                return true;
            }
        }
        return (tbl[0][0]==simbolo&&tbl[1][1]==simbolo&&tbl[2][2]==simbolo||
                tbl[0][2]==simbolo&&tbl[1][1]==simbolo&&tbl[2][0]==simbolo);
    }

    boolean estaOcupado(int linha, int coluna){
        return tbl[linha][coluna] != 0;
    }
}

package br.com.fabianoLuiz3103.exercicios.lista09.exercicio04;

public class Tabuleiro {

    private char[][] tbl;

    public Tabuleiro(){
        this.tbl = new char[3][3];
    }

    //como se fosse o getter
    public void exibir() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(((this.tbl[i][j] == 0) ? " " : this.tbl[i][j]) +
                        ((j < 2) ? " | " : ""));
            }
            if (i < 2) {
                System.out.println("\n--|---|--");
            }
        }
    }

    //como se fosse o setter
    public void inserirNoTabuleiro(int linha, int coluna, char simbolo){
            this.tbl[linha][coluna] = simbolo;
    }

    public boolean verificarGanhador(char simbolo){
        for(int i = 0; i<this.tbl.length;i++){
            if(this.tbl[i][0]==simbolo&&this.tbl[i][1]==simbolo&&this.tbl[i][2]==simbolo||
                    this.tbl[0][i]==simbolo&&this.tbl[1][i]==simbolo&&this.tbl[2][i]==simbolo) {
                return true;
            }
        }
        return (this.tbl[0][0]==simbolo&&this.tbl[1][1]==simbolo&&this.tbl[2][2]==simbolo||
                this.tbl[0][2]==simbolo&&this.tbl[1][1]==simbolo&&this.tbl[2][0]==simbolo);
    }

    boolean estaOcupado(int linha, int coluna){
        return this.tbl[linha][coluna] != 0;
    }
}

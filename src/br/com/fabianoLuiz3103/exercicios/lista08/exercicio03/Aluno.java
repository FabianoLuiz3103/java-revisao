package br.com.fabianoLuiz3103.exercicios.lista08.exercicio03;

public class Aluno {

    String nome;
    String matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[][] notas = new double[disciplinas.length][4];

    double obterMedia(int indice){
        double soma  = 0;
        for(int i = 0; i < notas[indice].length; i++){
            soma+=notas[indice][i];
        }
        return soma/notas[0].length;
    }

    String verificarAprovacao(int indice){
       double media = obterMedia(indice);
       return "\n"+((media>=7)?" APROVADO EM: " + disciplinas[indice]  + " MÉDIA " + media
               :
               " REPROVADO EM: " + disciplinas[indice] + " MÉDIA " + media);
    }

    void exbirInfo(){
        for(int i = 0; i < notas.length; i++){
            System.out.println("\n\nDISCIPLINA: " + disciplinas[i]);
            System.out.print("\nNOTAS: ");
            for(int j = 0; j < notas[i].length; j++){
                System.out.print(notas[i][j] + ", ");
            }
        }
    }
}

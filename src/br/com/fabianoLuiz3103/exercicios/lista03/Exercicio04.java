package br.com.fabianoLuiz3103.exercicios.lista03;

/**
 * @author FabianoLuiz3103
 * --> Ver em quantos anos a população do país A vai ser maior ou igual a população de B
 * A - 80.000 -> cresce 3%a.a
 * B - 200.000 -> cresce 1.5%a.a
 */
public class Exercicio04 {

    public static void main(String[] args) {

        double populacaoA = 80000,
                populacaoB = 200000;
        int anos = 0;

        while (populacaoA < populacaoB){
            populacaoA = populacaoA + (populacaoA*0.03);
            populacaoB = populacaoB + (populacaoB*0.015);
            anos++;
        }

            System.out.println("\n-----------------------------------------------" +
                    "\n\tPOPULAÇÃO A: " + Math.round(populacaoA) +
                    "\n\tPOPULAÇÃO B: " + Math.round(populacaoB) +
                    "\n\tA POPULAÇÃO \"A\" FICOU IGUAL OU MAIOR A \"B\" EM " + anos + " ANOS! ");
    }
}

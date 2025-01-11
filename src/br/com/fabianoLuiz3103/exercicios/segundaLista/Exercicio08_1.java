package br.com.fabianoLuiz3103.exercicios.segundaLista;

/**
 * @author FabianoLuiz3103
 * --> Receber e imprimir 3 números em ordem decrescente
 */
public class Exercicio08_1 {

    public static void main(String[] args) {

        int n1 = 990, n2 = 321, n3 = 100;
        int maior, menor, medio = 0;
        maior = menor = n1;

        if(n2 > maior){
            maior = n2;
        } if(n3 > maior){
            maior = n3;
        }

        if(n2 < menor){
            menor = n2;
        } if(n3 < menor){
            menor = n3;
        }

        if(n1 != maior && n1 != menor){
            medio = n1;
        } else if(n2 != maior && n2 != menor){
            medio = n2;
        } else{
            medio = n3;
        }

        System.out.println(" " + maior + " " + medio + " " + menor);
    }
}

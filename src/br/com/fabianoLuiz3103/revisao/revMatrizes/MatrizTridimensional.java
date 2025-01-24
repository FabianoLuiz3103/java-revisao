package br.com.fabianoLuiz3103.revisao.revMatrizes;

public class MatrizTridimensional {

    public static void main(String[] args) {

        int[][][] matriz = new int[3][3][3];
        int somaPares = 0, somaImpares =0;

        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                for(int k = 0; k < matriz[i][j].length; k++){
                    matriz[i][j][k] = i+j+k;
                    if(matriz[i][j][k]%2==0){
                        somaPares+=matriz[i][j][k];
                    }else{
                        somaImpares+=matriz[i][j][k];
                    }
                }
            }
        }

        System.out.println("\nExibindo matriz 3x3x3: ");
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                for(int k = 0; k < matriz[i][j].length; k++){
                    System.out.print("["+i+","+j+","+k + "] ");
                }
            }
            System.out.println("\t");
        }
        System.out.println("\n\n");
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                for(int k = 0; k < matriz[i][j].length; k++){
                    System.out.print(matriz[i][j][k] + " ");
                }
            }
            System.out.println("\t");
        }
        System.out.println("\nSoma pares: " + somaPares +
                "\nSoma ímpares: " + somaImpares);
    }
}

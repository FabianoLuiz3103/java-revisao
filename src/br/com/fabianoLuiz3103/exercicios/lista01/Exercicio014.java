package br.com.fabianoLuiz3103.exercicios.lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que recebe o tamanho de um arquivo e a velocidade do link de internet
 * tem que devolver o tempo de download.
 */
public class Exercicio014 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double tamanhoArquivo, velocidadeLink, tempoDownload;
        String unidadeTempo;

        tamanhoArquivo = receberDouble("tamanho do arquivo", scanner);
        velocidadeLink = receberDouble("velocidade da internet", scanner);
        tempoDownload = (tamanhoArquivo*8.0)/velocidadeLink;
        unidadeTempo = arrumarTempo(tempoDownload);
        System.out.println("\n---------------------------------------------");
        System.out.printf("O arquivo com tamanho de %.2fMB é baixado em %s com a velociadade de internet em %.2fMbps",
                tamanhoArquivo, unidadeTempo, velocidadeLink);

        scanner.close();
    }

    private static double receberDouble(String tipo, Scanner scan){
        double v = 0;
        while (true){
            try{
                System.out.println("Informe o: " + tipo);
                v = scan.nextDouble();
                if(v <= 0){
                    System.out.println("O " +  tipo + " deve ser maior que zero! ");
                    continue;
                }
                break;
            }catch (Exception e){
                System.out.println("O valor deve ser numérico! ");
                scan.nextLine();
            }
        }
        return v;
    }

    private static String arrumarTempo(double tempo){
        DecimalFormat df = new DecimalFormat("0.00");
        if(tempo < 60){
            return df.format(tempo) + " segundos";
        } else {
            double t = tempo/60;
            double min = Math.floor(t);
            double segundos = Math.ceil((t - min)*60);
            return min + " minuto e " + segundos + " segundos";
        }

    }
}

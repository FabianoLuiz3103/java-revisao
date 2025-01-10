package br.com.fabianoLuiz3103.exercicios.primeiraLista;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que calcula a quantidade de tinta que precisa e o valor a ser pago
 * com base no tamanho em metros quadrados informado.
 */
public class Exercicio013 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double areaMetrosQuadrados, valorGastoLatas, valorGastoGaloes,
                valorGastoLatasGaloes, litrosTintaNecessario;
        double latasTinta, galoesTinta;

        while (true){
            try{
                System.out.println("Informe o tamanho da área a ser pintada: ");
                areaMetrosQuadrados = scanner.nextDouble();
                if(areaMetrosQuadrados <= 0){
                    System.out.println("\nO valor deve ser maior que zero! ");
                    continue;
                }
                break;
            }catch(InputMismatchException e){
                System.out.println("\nO valor deve ser do tipo numérico! ");
                scanner.nextLine();
            } finally {

            }
        }

        litrosTintaNecessario = areaMetrosQuadrados/6;
        latasTinta = Math.ceil(litrosTintaNecessario/18);
        galoesTinta = Math.ceil(litrosTintaNecessario/3.6);
        valorGastoLatas = latasTinta * 80.0;
        double valorGastoLatasFloor = (latasTinta-1)*80;
        valorGastoGaloes = galoesTinta * 25.0;

        double resto = litrosTintaNecessario - ((latasTinta-1)*18);
        double restoG = 0.0;
        if(resto < 10.8){
            restoG = Math.ceil(resto/3.6);
            double v = restoG*25.0;
            valorGastoLatasGaloes = v + valorGastoLatasFloor;
        } else {
            latasTinta++;
            valorGastoLatasGaloes = valorGastoLatas;
        }

        System.out.println("\n----------------------------------------------------");
        System.out.printf("Para pintar uma área de: %.2fM²"
                        + "%nvai ser necessário %.2f litros de tinta," +
                        "%nUSANDO SÓ LATAS: %.0f LATAS CUSTANDO - R$%.2f" +
                        "%nUSANDO SÓ GALÕES: %.0f GALÕES CUSTANDO - R$%.2f" +
                        "%nO VALOR TOTAL (MENOR PREÇO POSSÍVEL) É DE R$%.2f USANDO:" +
                        "%n%.0f LATAS e %.0f GALÕES",
                areaMetrosQuadrados, litrosTintaNecessario, latasTinta, valorGastoLatas, galoesTinta, valorGastoGaloes,
                valorGastoLatasGaloes, (latasTinta-1), restoG);

        scanner.close();
    }
}

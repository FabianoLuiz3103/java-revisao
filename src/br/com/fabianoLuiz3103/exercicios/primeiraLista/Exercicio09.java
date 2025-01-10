package br.com.fabianoLuiz3103.exercicios.primeiraLista;

import java.util.Scanner;
import java.util.Set;

/**
 * @author FabianoLuiz3103
 * --> Faça um programa que vai receber a altura, sexo e peso da pessoa
 * calcule o peso ideal e informe se ela está abaixo, acima ou dentro do peso
 * - Homens: (72.7*altura)-58
 * - Mulheres: (62.1*altura)-44.7
 */
public class Exercicio09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double altura, pesoInformado, pesoIdeal;
        String sexo, faixaDePeso;
        Set<String> valoresValidos = Set.of("M", "MASCULINO", "HOMEM", "F", "FEMININO", "MULHER");

        while (true){
                System.out.println("Informe seu sexo: ");
                sexo = scanner.next().toUpperCase();
                if(valoresValidos.contains(sexo)){
                    break;
                } else{
                    System.out.println("Valor inválido!!\n");
                }
        }

        while (true){
            try{
                System.out.println("Informe sua altura em metros: ");
                altura = scanner.nextDouble();
                if(altura >= 100){
                    altura = altura/100;
                }
                if(altura <= 0 || altura > 2.5){
                    System.out.println("A altura deve ser um valor maior que zero e menor que 2.5M ");
                    continue;
                }
                break;
            }catch (Exception e){
                System.out.println("A altura deve ser um valor numérico! \n");
                scanner.nextLine();
            }
        }

        while (true){
            try{
                System.out.println("Informe seu peso em kg: ");
                pesoInformado = scanner.nextDouble();
                if(pesoInformado <= 0){
                    System.out.println("O peso deve ser maior que zero! ");
                    continue;
                }
                break;
            }catch (Exception e){
                System.out.println("O peso deve ser um valor numérico! \n");
                scanner.nextLine();
            }
        }
        pesoIdeal = calcularPesoIdeal(altura, sexo);
        faixaDePeso = definirFaixaDePesoUsuario(pesoInformado, pesoIdeal);

        System.out.println("\n--------------------------------------------------------");
        System.out.printf("O seu peso ideal é de %.2fKg, com uma faixa que vai de %.2fKg até %.2fKg\n" +
                "como seu peso atual é de %.2fKg.", pesoIdeal, (pesoIdeal-5), (pesoIdeal+5), pesoInformado);
        System.out.print(" Você está: " + faixaDePeso);

        scanner.close();
    }

    private static double calcularPesoIdeal(double altura, String sexo){
        if(sexo.equals("M") || sexo.equals("MASCULINO") || sexo.equals("HOMEM")){
            return (72.7*altura)-58;
        } else {
            return (62.1*altura)-44.7;
        }
    }

    private static String definirFaixaDePesoUsuario(double pesoInformado, double pesoIdeal){

        if(pesoInformado < (pesoIdeal-5)) {
            return "ABAIXO DO PESO!";
        }else  if(pesoInformado > (pesoIdeal+5)){
            return "ACIMA DO PESO! ";
        }else {
            return "IDEAL! ";
        }
    }
}

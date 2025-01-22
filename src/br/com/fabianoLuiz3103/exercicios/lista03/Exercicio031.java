package br.com.fabianoLuiz3103.exercicios.lista03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa para uma academia descobrir quem é o mais alto/baixo e o mais gordo/magro
 */
public class Exercicio031 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int codigoAluno = 0, codigoMenorPeso = 0, codigoMaiorPeso = 0, codigoMenorAltura = 0, codigoMaiorAltura = 0, qtdAlunos = 0;
        double pesoAluno, alturaAluno,
                maiorPeso = Double.MIN_VALUE, menorPeso = Double.MAX_VALUE,
                maiorAltura = Double.MIN_VALUE, menorAltura = Double.MAX_VALUE,
                somaPeso = 0, somaAltura = 0;

        do{
           while (true){
               try{
                   System.out.println("\n\tInforme o código do aluno:" +
                           "\n\t(0) - Encerra o programa! ");
                   codigoAluno = scanner.nextInt();
                   if(codigoAluno >=0){break;}
                   System.out.println("\n\tERRO! O código do aluno não pode ser negativo!");
               }catch (InputMismatchException e){
                   System.out.println("\n\tERRO! O valor dever um número inteiro! ");
                   scanner.nextLine();
               }
           }
           if(codigoAluno!=0){

               alturaAluno = receberDouble(scanner, "\n\tInforme a altura do aluno " + codigoAluno + ": ");
               pesoAluno = receberDouble(scanner, "\n\tInforme o peso do aluno " + codigoAluno + ": ");
               if(alturaAluno > maiorAltura){
                   maiorAltura = alturaAluno;
                   codigoMaiorAltura = codigoAluno;
               }
               if(alturaAluno < menorAltura){
                   menorAltura = alturaAluno;
                   codigoMenorAltura = codigoAluno;
               }
               if(pesoAluno > maiorPeso){
                   maiorPeso = pesoAluno;
                   codigoMaiorPeso = codigoAluno;
               }
               if(pesoAluno < menorPeso){
                   menorPeso = pesoAluno;
                   codigoMenorPeso = codigoAluno;
               }

               qtdAlunos++;
               somaPeso +=pesoAluno;
               somaAltura += alturaAluno;
           }
        }while (codigoAluno!=0);


        if(qtdAlunos>0){

            System.out.println("\n--------------------------------------------------------------------------------" +
                    "\n\t\tOS RESULTADOS FORAM:" +
                    "\n\n\t\tMENOR PESO:" +
                    "\nALUNO: " + codigoMenorPeso +
                    "\nPESO: " + menorPeso +
                    "\n\n\t\tMAIOR PESO:" +
                    "\nALUNO: " + codigoMaiorPeso +
                    "\nPESO: " + maiorPeso +
                    "\n\n\t\tMENOR ALTURA:" +
                    "\nALUNO: " + codigoMenorAltura +
                    "\nALTURA: " + menorAltura +
                    "\n\n\t\tMAIOR ALTURA:" +
                    "\nALUNO: " + codigoMaiorAltura +
                    "\nALTURA: " + maiorAltura +
                    "\n\n\t\tSOMAS:" +
                    "\nPESO: " + somaPeso +
                    "\nALTURA:  " + somaAltura +
                    "\n\n\t\tMÉDIAS: " +
                    "\nPESO: " + (somaPeso/qtdAlunos)+
                    "\nALTURA: " + (somaAltura/qtdAlunos));
        }

    }

    private static double receberDouble(Scanner scanner, String texto){
        double valor;
        while (true){
            try{
                System.out.print(texto);
                valor = scanner.nextDouble();;
                if(valor > 0){return valor;}
                System.out.println("\n\tERRO! O valor não pode ser negativo!");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                scanner.nextLine();
            }
        }
    }
}

package br.com.fabianoLuiz3103.revisao.revLeituraDoTeclado;

import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Lendo uma linha inteira - String com espaços
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        //Se usar um tipo next específico antes do nextLine() é preciso colocar o nextLine() logo em seguida
        //Lendo um tipo específico - String sem espaços
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scanner.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        //Lendo um tipo específico - int
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Sua idade é: " + idade);


        //Digitando múltiplos valores em uma linha, separando com espaço
        System.out.println("\n Digite seu primeiro nome, idade, altura e se tem pet:");
        String firstName = scanner.next();
        int age = scanner.nextInt();
        float altura = scanner.nextFloat();
        boolean temPet = scanner.nextBoolean();

        System.out.println("\nVocê digitou os seguintes valores:");
        System.out.println("Primeiro nome: " + firstName);
        System.out.println("Idade: " + age);
        System.out.println("Altura: " + altura);
        System.out.println("Tem pet: " + temPet);




    }
}

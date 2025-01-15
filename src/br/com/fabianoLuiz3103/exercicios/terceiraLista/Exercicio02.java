package br.com.fabianoLuiz3103.exercicios.terceiraLista;

import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que vai pedir nome e senha do usuário e não vai deixar serem iguais
 */
public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome, senha;
        while (true){
            nome = receberValor(scanner, "seu nome: ");
            senha = receberValor(scanner, "sua senha: ");

            if(!nome.equalsIgnoreCase(senha)){
                System.out.println("\n\tBEM-VINDO " + nome.toUpperCase());
                break;}
            System.out.println("\n\tERRO! A senha deve ser diferente do nome! ");
        }
        scanner.close();
    }

    private static String receberValor(Scanner scanner, String tipo){
            System.out.println("\n\tInforme " + tipo);
            return scanner.nextLine();
    }
}

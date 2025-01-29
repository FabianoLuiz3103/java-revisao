package br.com.fabianoLuiz3103.exercicios.lista012.exercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        Contato[] contatos;
        int numeroContatos;

        System.out.println("\n\tInforme o nome da agenda: ");
        agenda.setNome(scanner.nextLine());
        numeroContatos = receberInteiro(scanner);
        contatos = new Contato[numeroContatos];
        scanner.nextLine();
        /**
         * a variável contato dentro do loop é apenas um ponteiro temporário para cada objeto criado.
         * Depois que o objeto é salvo no array (contatos[i] = contato;), a variável pode ser sobrescrita
         */
        for(int i = 0; i < numeroContatos; i++){
            Contato contato = new Contato();
            System.out.println("\n\tInforme o nome do " + (i+1) + "º contato: ");
            contato.setNome(scanner.nextLine());
            System.out.println("\n\tInforme o telefone do " + (i+1) + "º contato: ");
            contato.setTelefone(scanner.nextLine());
            System.out.println("\n\tInforme o email do " + (i+1) + "º contato: ");
            contato.setEmail(scanner.nextLine());
            contatos[i] = contato;
        }
        agenda.setContatos(contatos);
        if(agenda!=null && agenda.getContatos()!=null){
            System.out.println("\n\nNOME-AGENDA: " + agenda.getNome());
            System.out.println("CONTATOS:");
            for(Contato c : agenda.getContatos()){
                System.out.println("NOME: " + c.getNome());
                System.out.println("TELEFONE: " +c.getTelefone());
                System.out.println("E-MAIL:" + c.getEmail());
                System.out.println("\n");
            }
        }
        scanner.close();
    }

    private static int receberInteiro(Scanner scanner){
        int valor;
        while (true){
            try{
                System.out.println("\n\tInforme o número de contatos que deseja adicionar: ");
                valor = scanner.nextInt();
                if(valor>0){return valor;}
                System.out.println("\n\tERRO! O valor deve ser maior que zero! ");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo inteiro! ");
                scanner.nextLine();
            }
        }
    }
}

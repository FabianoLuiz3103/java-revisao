package br.com.fabianoLuiz3103.exercicios.lista015;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        Agenda agenda = new Agenda();
        int espacoContatos = agenda.getContatos().length;
        while (opcao != 4){
            opcao = lerInteiro(scanner, "\nESCOLHA UMA OPÇÃO:" +
                    "\n(1) - Adicionar contato na agenda: " +
                    "\n(2) - Consultar contato na agenda: " +
                    "\n(4) - Sair.");
            scanner.nextLine();
            switch (opcao){
                case 1 -> {
                    while (true){
                        try{
                            System.out.println("\n\t\t **** ADICIONANDO CONTATO **** ");
                            System.out.println("\n\t\t\tVOCÊ AINDA PODE ADICIONAR " + espacoContatos + " CONTATOS! ");
                            System.out.println("\nInforme o nome: ");
                            String nome = scanner.nextLine();
                            System.out.println("\nInforme o telefone: ");
                            String telefone = scanner.nextLine();
                            if(!nome.isBlank() && !telefone.isBlank()){
                                Contato contato = new Contato(nome, telefone);
                                agenda.adicionarContato(contato);
                                espacoContatos--;
                                break;
                            }
                            System.out.println("\n\tERRO! Há campo vazio!");

                        }catch (AgendaCheia e){
                            System.out.println("Aconteceu um erro");
                            System.out.println(e.getMessage());
                            break;
                        }
                    }
                }
                case 2 -> {
                    try{
                        System.out.println("\n\t\t **** CONSULTANDO CONTATO **** ");
                        int indice = lerInteiro(scanner, "\nInforme o identificador do contato: ");
                        Contato contato = agenda.consultarContato(indice-1);
                        System.out.println(contato);

                    }catch (ContatoNaoExiste e){
                        System.out.println("Aconteceu um erro! ");
                        System.out.println(e.getMessage());
                    }
                }
                case 4 -> {
                    System.out.println("\n\n\t\tATÉ LOGO!  \n");
                }
                default -> {
                    System.out.println("\n\n\t\tOPÇÃO INVÁLIDA! \n");
                }

            }
        }

        scanner.close();
    }

    private static int lerInteiro(Scanner scanner, String texto){
        int valor;
        while (true){
            try{
                System.out.println(texto);
                valor = scanner.nextInt();
                if(valor > 0){return valor;}
                System.out.println("\n\tERRO! O valor deve ser maior que zero! ");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser um número inteiro!");
            }
        }
    }
}

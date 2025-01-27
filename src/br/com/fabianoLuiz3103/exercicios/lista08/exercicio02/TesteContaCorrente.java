package br.com.fabianoLuiz3103.exercicios.lista08.exercicio02;

public class TesteContaCorrente {

    public static void main(String[] args) {

        ContaCorrente ccr = new ContaCorrente();

        ccr.numeroConta = "49033-05";
        ccr.agencia = "6611";
        ccr.saldo = -10;
        ccr.limiteEspecial = 500;
        ccr.especial = true;

        System.out.println("SEU SAQUE DE R$2000,00 foi: " + (ccr.sacar(491)?"APROVADO":"NEGADO-SEM SALDO"));
        System.out.println("\nSALDO: "+ ccr.consultarSaldo());
        System.out.println("\nCHEQUE ESPECIAL: " + ((ccr.consultarEspecial()?"ESTÁ USANDO":"NÃO ESTÁ USANDO")));

        ccr.depositar(500);

        System.out.println("\nSALDO: "+ ccr.consultarSaldo());
        System.out.println("SEU SAQUE DE R$2000,00 foi: " + (ccr.sacar(491)?"APROVADO":"NEGADO-SEM SALDO"));
        ccr.depositar(1);
        System.out.println("\nSALDO: "+ ccr.consultarSaldo());
        System.out.println("\nCHEQUE ESPECIAL: " + ((ccr.consultarEspecial()?"ESTÁ USANDO":"NÃO ESTÁ USANDO")));

    }
}

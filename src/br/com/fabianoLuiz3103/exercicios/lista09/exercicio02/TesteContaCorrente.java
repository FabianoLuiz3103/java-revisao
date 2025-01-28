package br.com.fabianoLuiz3103.exercicios.lista09.exercicio02;

public class TesteContaCorrente {

    public static void main(String[] args) {

        ContaCorrente ccr = new ContaCorrente("49033-05","6611");

        System.out.println("SEU SAQUE DE " + 491.0 + " FOI: " + (ccr.sacar(491)?"APROVADO":"NEGADO-SEM SALDO"));
        System.out.println("\nSALDO: "+ ccr.consultarSaldo());
        System.out.println("\nCHEQUE ESPECIAL: " + ((ccr.consultarEspecial()?"ESTÁ USANDO":"NÃO ESTÁ USANDO")));

        ccr.depositar(500);
        System.out.println("\nDeposito: +R$"+500.0);
        System.out.println("\nSALDO: "+ ccr.consultarSaldo());
        System.out.println("SEU SAQUE DE " + 491.0 + " FOI: " + (ccr.sacar(491)?"APROVADO":"NEGADO-SEM SALDO"));
        ccr.depositar(1);
        System.out.println("\nDeposito: +R$"+1);
        System.out.println("\nSALDO: "+ ccr.consultarSaldo());
        System.out.println("\nCHEQUE ESPECIAL: " + ((ccr.consultarEspecial()?"ESTÁ USANDO":"NÃO ESTÁ USANDO")));

        ccr.setEspecial(true);
        ccr.setLimiteEspecial(100.0);
        System.out.println("\nSALDO: "+ ccr.consultarSaldo());
        System.out.println("SEU SAQUE DE " + 90 + " FOI: " + (ccr.sacar(90)?"APROVADO":"NEGADO-SEM SALDO"));
        System.out.println("\nSALDO: "+ ccr.consultarSaldo());
        System.out.println("\nCHEQUE ESPECIAL: " + ((ccr.consultarEspecial()?"ESTÁ USANDO":"NÃO ESTÁ USANDO")));

        System.out.println("SEU SAQUE DE " + 20 + " FOI: " + (ccr.sacar(20)?"APROVADO":"NEGADO-SEM SALDO"));
        System.out.println("\nSALDO: "+ ccr.consultarSaldo());
        System.out.println("\nCHEQUE ESPECIAL: " + ((ccr.consultarEspecial()?"ESTÁ USANDO":"NÃO ESTÁ USANDO")));

    }
}

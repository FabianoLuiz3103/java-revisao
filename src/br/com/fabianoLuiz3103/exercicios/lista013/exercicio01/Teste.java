package br.com.fabianoLuiz3103.exercicios.lista013.exercicio01;

public class Teste {

    public static void main(String[] args) {

        System.out.println("\n *** CONTA POUPANÇA ***");
        ContaPoupanca contaPoupanca = new ContaPoupanca("Fabiano Luiz", "6511", 0.0, 31);
        realizarDeposito(contaPoupanca, 100);
        realizarSaque(contaPoupanca, 100);
        calcularRendimento(contaPoupanca, 0.5);
        System.out.println(contaPoupanca);

    }

    private static void calcularRendimento(ContaPoupanca contaPoupanca, double taxa){
        double saldoAntigo = contaPoupanca.getSaldo();
        if(contaPoupanca.calcularNovoSaldo(taxa)){
            System.out.println("\n\tRendimento de " + (taxa*100)+"% aplicado! Seu saldo era de R$"+saldoAntigo+" e agora é de R$"+contaPoupanca.getSaldo());
        }else{
            System.out.println("\n\tRendimento não aplicado! Hoje não é o dia de rendimento.");
        }
    }

    private static void realizarDeposito(ContaBancaria conta, double valor){
        if(conta.depositar(valor)){
            System.out.println("\n\tDeposito de R$"+valor+" realizado com sucesso! Seu novo saldo é de R$"+conta.getSaldo());
        }else{
            System.out.println("\n\tDeposito não realizado! O valor informado é negativo!");
        }
    }
    private static void realizarSaque(ContaBancaria conta, double valor){
        if(conta.sacar(valor)){
            System.out.println("\n\tSaque de R$"+valor+" realizado com sucesso! Seu novo saldo é de R$"+conta.getSaldo());
        }else{
            System.out.println("\n\tSaque de R$"+valor+" não realizado! Seu saldo é de R$"+conta.getSaldo());
        }
    }
}

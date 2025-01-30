package br.com.fabianoLuiz3103.exercicios.lista013.exercicio01;

public class Teste {

    public static void main(String[] args) {

        System.out.println("\n *** CONTA POUPANÇA ***");
        ContaPoupanca contaPoupanca = new ContaPoupanca("Fabiano Luiz", "6511", 0.0, 31);
        realizarDeposito(contaPoupanca, 100);
        realizarSaque(contaPoupanca, 100);
        calcularRendimento(contaPoupanca, 0.5);
        System.out.println(contaPoupanca);

        /**
         * //como conta especial não tem métodos específicos, posso usar a ref de conta bancária e a instância de conta especial
         * a instância da conta especial vai chamar o método saque sobrescrito da classe conta especial
         */
        System.out.println("\n\n *** CONTA ESPECIAL ***");
        ContaBancaria contaEspecial = new ContaEspecial("Yolanda Binhardi", "6544", 0.0, 300.00);
        realizarSaque(contaEspecial, 100);
        realizarSaque(contaEspecial, 100);
        realizarDeposito(contaEspecial, 450.40);


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

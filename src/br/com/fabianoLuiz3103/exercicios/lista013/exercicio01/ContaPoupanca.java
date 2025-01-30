package br.com.fabianoLuiz3103.exercicios.lista013.exercicio01;

public class ContaPoupanca extends ContaBancaria{

    private String diaRendimento;

    public ContaPoupanca(String nomeCliente, String numConta, double saldo, String diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public String getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(String diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(double taxaRendimento){
        if(taxaRendimento > 0){
            double novoSaldo = (super.getSaldo()*taxaRendimento)+super.getSaldo();
            super.setSaldo(novoSaldo);
        }
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "diaRendimento='" + diaRendimento + '\'' +
                '}';
    }
}

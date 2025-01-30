package br.com.fabianoLuiz3103.exercicios.lista013.exercicio01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{

    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public boolean calcularNovoSaldo(double taxaRendimento){
        Calendar hoje = Calendar.getInstance();
        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            double novoSaldo = (super.getSaldo()*taxaRendimento)+super.getSaldo();
            super.setSaldo(novoSaldo);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cliente: " + super.toString() +
                "ContaPoupanca{" +
                "diaRendimento='" + diaRendimento + '\'' +
                '}';
    }
}

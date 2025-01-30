package br.com.fabianoLuiz3103.exercicios.lista013.exercicio01;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valorSaque) {
        double saldoEspecial = limite+super.getSaldo();
        if(saldoEspecial >= valorSaque){
            super.setSaldo(saldoEspecial-valorSaque);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                '}';
    }
}

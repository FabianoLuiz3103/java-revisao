package br.com.fabianoLuiz3103.exercicios.lista09.exercicio02;

/**
 * @author FabianoLuiz3103
 */
public class ContaCorrente {

    private String numeroConta;
    private String agencia;
    private double saldo;
    private boolean especial;
    private double limiteEspecial;

    public ContaCorrente(){}

    public ContaCorrente(String numeroConta, String agencia) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = 0;
        this.especial = false;
        this.limiteEspecial = 0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public boolean sacar(double valor){
        if(this.getSaldo()>=valor){
            this.setSaldo(this.getSaldo()-valor);
            return true;
        }else{
            if(this.isEspecial()){
                double limite = this.getLimiteEspecial()+this.getSaldo();
                if(limite>=valor){
                    this.setSaldo(this.getSaldo()-valor);
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
    }

    public void depositar(double valor){
        this.setSaldo(this.getSaldo()+valor);
    }

    public double consultarSaldo(){
        return this.getSaldo();
    }

    public boolean consultarEspecial(){
        return this.getSaldo()<0;
    }
}

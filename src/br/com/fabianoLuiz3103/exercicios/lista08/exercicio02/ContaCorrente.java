package br.com.fabianoLuiz3103.exercicios.lista08.exercicio02;

/**
 * @author FabianoLuiz3103
 */
public class ContaCorrente {

    String numeroConta;
    String agencia;
    double saldo;
    boolean especial;
    double limiteEspecial;

    boolean sacar(double valor){
        if(saldo>=valor){
            saldo-=valor;
            return true;
        }else{
            if(especial){
                double limite = limiteEspecial+saldo;
                if(limite>=valor){
                    saldo-=valor;
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
    }

    void depositar(double valor){
        saldo+=valor;
    }

    double consultarSaldo(){
        return saldo;
    }

    boolean consultarEspecial(){
        return saldo<0;
    }
}

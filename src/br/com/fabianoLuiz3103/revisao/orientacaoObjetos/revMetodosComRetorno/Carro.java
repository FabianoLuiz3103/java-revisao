package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revMetodosComRetorno;

/**
 * revisão de métodos com retorno;
 */
public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    double obterAutonomia(){
        return capCombustivel * consumoCombustivel;
    }
}

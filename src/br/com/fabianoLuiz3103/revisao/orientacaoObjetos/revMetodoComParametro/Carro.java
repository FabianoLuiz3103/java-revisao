package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revMetodoComParametro;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    double calculaCombustivel(double km){
        return km/consumoCombustivel;
    }
}

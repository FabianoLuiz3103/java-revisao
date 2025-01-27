package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revMetodosSimples;

/**
 * revisão de métodos símples, sem parâmetros e/ou retorno!
 */
public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
    }
}

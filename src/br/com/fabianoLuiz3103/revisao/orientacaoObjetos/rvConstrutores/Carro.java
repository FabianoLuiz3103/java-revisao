package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.rvConstrutores;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // Se criar construtor com parâmetros -> cria o vazio!
    // O hibernate usa o construtor vazio
    Carro(){
        System.out.println("\nA classe carro foi instânciada! ");
    }

    Carro(String marca_){
        marca = marca_;
    }

    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
    }

    double obterAutonomia(){
        return capCombustivel * consumoCombustivel;
    }

    double calculaCombustivel(double km){
        return km/consumoCombustivel;
    }
}

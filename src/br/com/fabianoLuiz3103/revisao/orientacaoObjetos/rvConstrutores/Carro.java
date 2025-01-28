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

    Carro(String marca){
        this.marca = marca;
    }

    Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }


    //--> Um construtor chamando o outro
    Carro(String marca, String modelo, int numPassageiros){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando construtor marca,modelo,numPassageiros");
    }
    Carro(String marca, String modelo){
        this(marca, modelo, 10);
        System.out.println("Chamando construtor marca,modelo");
    }

    //--> Usando THIS
    void exibirAutonomia2(){
        System.out.println("A autonomia do carro é: " + this.obterAutonomia2() + "km");
    }

    double obterAutonomia2(){
        return capCombustivel * consumoCombustivel;
    }

    //--> Sem THIS
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

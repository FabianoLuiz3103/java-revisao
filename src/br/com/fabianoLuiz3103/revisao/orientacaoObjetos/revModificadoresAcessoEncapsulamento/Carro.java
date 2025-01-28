package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revModificadoresAcessoEncapsulamento;


/**
 * public --> todos podem ver
 * private --> somente a própia classe pode ver
 * default --> só pode ser visto dentro do próprio pacote
 */
class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

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

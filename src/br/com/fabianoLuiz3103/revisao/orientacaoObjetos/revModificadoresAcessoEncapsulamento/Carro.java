package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revModificadoresAcessoEncapsulamento;


/**
 * public --> todos podem ver
 * private --> somente a própia classe pode ver
 * default --> só pode ser visto dentro do próprio pacote
 *
 * encapsulamento -> métodos get e set
 * os atributoa de uma classe devem ser private
 */
class Carro {

    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getNumPassageiros(){
        return this.numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros){
        this.numPassageiros = numPassageiros;
    }

    public double getCapCombustivel(){
        return this.capCombustivel;
    }

    public void setCapCombustivel(double capCombustivel){
        this.capCombustivel = capCombustivel;
    }

    public double getConsumoCombustivel(){
        return this.consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel){
        this.consumoCombustivel = consumoCombustivel;
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

package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revMetodoComParametro;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca="Fiat";
        van.modelo="Ducato";
        van.numPassageiros=10;
        van.capCombustivel=100;
        van.consumoCombustivel=0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        double combustivelCalculado = van.calculaCombustivel(150);
        System.out.println("Para andar 150km vai ser necessário: " + combustivelCalculado + " litros combustível! ");
    }
}


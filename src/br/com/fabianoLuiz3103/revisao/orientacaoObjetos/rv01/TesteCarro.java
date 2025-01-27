package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.rv01;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca="Fiat";
        van.modelo="Ducato";
        van.numPassageiros=10;
        van.capCombustivel=100;
        van.consumoCombustivel=0.2;

        System.out.println("\nCARRO: " + van.modelo+
                "\nMARCA: " + van.marca+
                "\nNÚMERO PASSAGEIROS: " + van.numPassageiros+
                "\nCAP COMBUSTÍVEL: " + van.capCombustivel+
                "\nCONSUMO COMBUSTÍVEL: " + van.consumoCombustivel);
    }
}

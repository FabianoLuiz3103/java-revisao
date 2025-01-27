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


        Carro fusca = new Carro();
        fusca.marca="Volkswagen";
        fusca.modelo="Fusca";
        fusca.numPassageiros=4;
        fusca.capCombustivel=30;
        fusca.consumoCombustivel=0.15;

        System.out.println("\nCARRO: " + fusca.modelo+
                "\nMARCA: " + fusca.marca+
                "\nNÚMERO PASSAGEIROS: " + fusca.numPassageiros+
                "\nCAP COMBUSTÍVEL: " + fusca.capCombustivel+
                "\nCONSUMO COMBUSTÍVEL: " + fusca.consumoCombustivel);
    }
}

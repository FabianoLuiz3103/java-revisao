package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.rvConstrutores;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca="Fiat";
        van.modelo="Ducato";
        van.numPassageiros=10;
        van.capCombustivel=100;
        van.consumoCombustivel=0.2;

        Carro van2 = new Carro("Ford");
        System.out.println(van2.marca);

        Carro fusca = new Carro("Volkswagen", "Fusca", 4, 40, 0.4);
        System.out.println(fusca.marca + " | " + fusca.modelo);

        Carro van3 = new Carro("Polo", "Polinho");
        System.out.println(van3.marca + " | " + van3.numPassageiros);
    }
}

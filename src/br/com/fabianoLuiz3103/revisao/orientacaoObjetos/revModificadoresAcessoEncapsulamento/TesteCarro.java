package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revModificadoresAcessoEncapsulamento;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();
        van.setMarca("Fiat");
        van.setModelo("Ducato");
        van.setNumPassageiros(10);
        van.setCapCombustivel(100);
        van.setConsumoCombustivel(0.2);

        System.out.println(van.getMarca() + " | " + van.getModelo());
    }
}

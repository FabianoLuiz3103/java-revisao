package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revInterfaces;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao{

    private String tamanho;
    private String raca;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }


    @Override
    public void emitirSom() {

    }

    @Override
    public void amamentar() {

    }

    //métodos de domesticado
    @Override
    public void levarVeterinario() {

    }

    @Override
    public void alimentar() {

    }

    //métodos de estimação
    @Override
    public void brincar() {

    }

    @Override
    public void levarPassear() {

    }
}

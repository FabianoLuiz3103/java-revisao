package br.com.fabianoLuiz3103.revisao.revTryCath;

/**
 * Não posso extender a Throwable porque inclui os erros,
 * não só as exceções
 */
public class DivisaoNaoExata extends Exception{

    private int num;
    private int dem;

    public DivisaoNaoExata(int num, int dem){
        super();
        this.num = num;
        this.dem = dem;
    }

    @Override
    public String toString() {
        return "Resultado de " +  num + "/" + dem + " não é um inteiro!";
    }
}

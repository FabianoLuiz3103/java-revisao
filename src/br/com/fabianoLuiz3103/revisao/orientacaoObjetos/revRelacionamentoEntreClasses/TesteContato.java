package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revRelacionamentoEntreClasses;

public class TesteContato {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Fabiano");
        contato.setEndereco("Rua alpines, 15");
        contato.setTelefone("119999-9999");

        System.out.println(contato.getNome());
        System.out.println(contato.getTelefone());
    }
}

package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revRelacionamentoEntreClasses;

public class TesteContato {

    public static void main(String[] args) {

        //Endereço
        Endereco endereco = new Endereco();
        endereco.setCidade("Francisco Morato");
        endereco.setNomeRua("Avenida Ulisses Guimarães");
        endereco.setEstado("São Paulo");

        //Contato
        Contato contato = new Contato();
        contato.setNome("Fabiano");
        contato.setEndereco(endereco); //Passando endereço para o contato
        contato.setTelefone("119999-9999");

        if(contato != null && contato.getEndereco()!=null){
            System.out.println(contato.getNome());
            System.out.println(contato.getTelefone());
            System.out.println(contato.getEndereco().getNomeRua());
        }
    }
}

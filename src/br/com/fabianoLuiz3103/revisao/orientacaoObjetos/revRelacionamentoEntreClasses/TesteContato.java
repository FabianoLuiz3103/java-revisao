package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revRelacionamentoEntreClasses;

public class TesteContato {

    public static void main(String[] args) {

        //Endereço
        Endereco endereco = new Endereco();
        endereco.setCidade("Francisco Morato");
        endereco.setNomeRua("Avenida Ulisses Guimarães");
        endereco.setEstado("São Paulo");

        //Telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("11");
        telefone.setNumero("97370-8891");

        //Contato
        Contato contato = new Contato();
        contato.setNome("Fabiano");
        contato.setEndereco(endereco); //Passando endereço para o contato
        contato.setTelefone(telefone); //Passando telefone para o contato

        if(contato != null &&
                contato.getEndereco()!=null &&
                    contato.getTelefone() != null){
            System.out.println(contato.getNome());
            System.out.println(contato.getEndereco().getNomeRua());
            System.out.println(contato.getTelefone().getNumero());
        }
    }
}

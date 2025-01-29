package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revRelacionamentoEntreClasses;

public class TesteContato {

    public static void main(String[] args) {

        //Endereço
        Endereco endereco = new Endereco();
        endereco.setCidade("Francisco Morato");
        endereco.setNomeRua("Avenida Ulisses Guimarães");
        endereco.setEstado("São Paulo");

        //Telefone 1
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("11");
        telefone.setNumero("97370-8891");

        //Telefone 2
        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Residencial");
        telefone2.setDdd("11");
        telefone2.setNumero("4608-4722");

        Telefone[] telefones = {telefone, telefone2};

        //Contato
        Contato contato = new Contato();
        contato.setNome("Fabiano");
        contato.setEndereco(endereco); //Passando endereço para o contato
        //contato.setTelefone(telefone); //Passando telefone para o contato
        contato.setTelefons(telefones); //Passando telefones para o contato

        if(contato != null &&
                contato.getEndereco()!=null){
            System.out.println(contato.getNome());
            System.out.println(contato.getEndereco().getNomeRua());
        }

        if(contato!=null&&contato.getTelefones()!=null){
            for(Telefone t: contato.getTelefones()){
                System.out.println(t.getNumero());
            }
        }
    }
}

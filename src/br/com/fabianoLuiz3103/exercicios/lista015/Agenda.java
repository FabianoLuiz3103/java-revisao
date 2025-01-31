package br.com.fabianoLuiz3103.exercicios.lista015;


public class Agenda {

    private Contato[] contatos;

    public Agenda(){
        this.contatos = new Contato[5];
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public void adicionarContato(Contato contato) throws AgendaCheia{
        if(contato != null){
            for (int i = 0; i < this.contatos.length; i++) {
                if (this.contatos[i] == null) {
                    this.contatos[i] = contato;
                    return;
                }
            }
        }
        throw new AgendaCheia(this.contatos.length);

    }

    public Contato consultarContato(int indice) throws ContatoNaoExiste {
        //como é || basta uma condição ser true para o retorno ser true
        //se a primeira condição for verdadeira acontece a exceção se for false ele vai para a segunda condição
        if (indice < 0 || indice >= this.contatos.length || this.contatos[indice] == null) {
            throw new ContatoNaoExiste(indice);
        }
        return this.contatos[indice];
    }

}

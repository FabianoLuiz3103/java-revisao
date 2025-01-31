package br.com.fabianoLuiz3103.exercicios.lista015;

/**
 * Se eu usar o identificador:
 *
 * quando a última instância for criada (por exemplo, a 10ª instância),
 * todas as instâncias anteriores também exibirão identificador = 10,
 * pois todas compartilham o mesmo campo estático.
 */
public class Contato {

    private String nome;
    private String telefone;
    private static int identificador;
    private int id;

    public Contato(){
        identificador++;
        this.id = identificador;
    }

    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        identificador++;
        this.id = identificador;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", id=" + id +
                '}';
    }
}

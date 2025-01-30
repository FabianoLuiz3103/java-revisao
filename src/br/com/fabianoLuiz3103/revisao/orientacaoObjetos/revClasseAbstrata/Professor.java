package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revClasseAbstrata;

public class Professor extends Pessoa {

    private String departamento;
    private String nomeCurso;
    private double salario;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioLiquido(){return 0.0;}

    @Override
    public String obterEtiquetaEndereco() {
        String s = "Endereço do Professor: ";
        return s+=super.obterEtiquetaEndereco();
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }
}

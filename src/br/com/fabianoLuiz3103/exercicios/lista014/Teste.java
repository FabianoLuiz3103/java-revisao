package br.com.fabianoLuiz3103.exercicios.lista014;

public class Teste {

    public static void main(String[] args) {

        Figura2D quadrado = new Quadrado("Quadrado", "Verde", 2);
        Figura2D circulo = new Circulo("Circulo", "Vermelho", 3);
        Figura2D triangulo = new Triangulo("Triângulo", "Rosa", 4, 6);
        Figura3D cubo = new Cubo("Cubo", "Azul", 3);
        Figura3D cilindro = new Cilindro("Cilindro", "Laranja", 2, 3);
        Figura3D piramide = new Piramide("Pirâmide", "Marrom", 3,2,4, 4,quadrado);

        FiguraGeometrica[] figuras = {quadrado, circulo, triangulo, cubo, cilindro, piramide};

        for(FiguraGeometrica f: figuras){
            System.out.println("\n\n----------------------------\n");
            System.out.printf("FIGURA: %s" +
                    "\nCOR: %s", f.getNome(), f.getCor());
            if(f instanceof Figura2D figura2D){
                System.out.printf("\nÁREA: %.2f",figura2D.calcularArea());
            }else{
                Figura3D figura3D = (Figura3D) f;
                System.out.printf(
                        "\nÁREA: %.2f" +
                        "\nVOLUME: %.2f",figura3D.calcularArea(), figura3D.calcularVolume());
            }
        }
    }
}

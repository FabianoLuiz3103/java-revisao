package br.com.fabianoLuiz3103.exercicios.lista013.exercicio03;

public class Teste {

    public static void main(String[] args) {

        Animal camelo = new Animal("Camelo",
                150, "Amarelo", "Terra", 2.0);
        Animal tubarao = new Peixe("Tubarão",
                300,1.5,"Barabtanas e cauda");
        Animal urso = new Mamifero("Urso-do-canadá",
                180, "vermelho", 0.5, "Mel");

        Animal[] animais = {camelo, tubarao, urso}; //peixe e mamifero são animais
        exibirAnimais(animais);
    }

    private static void exibirAnimais(Animal[] animais){
        System.out.println("Zoo:");
        for(Animal a: animais){
            System.out.println("--------------------");
            System.out.println(a.toString());
        }
    }
}

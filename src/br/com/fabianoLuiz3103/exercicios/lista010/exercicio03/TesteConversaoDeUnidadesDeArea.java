package br.com.fabianoLuiz3103.exercicios.lista010.exercicio03;

public class TesteConversaoDeUnidadesDeArea {

    public static void main(String[] args) {

        System.out.println("5 metros quadrados para pés quadrados: " + ConversaoDeUnidadesDeArea.metrosToPes(5));
        System.out.println("10 pés quadrados para centímetros quadrados: " + ConversaoDeUnidadesDeArea.pesToCentimetros(10));
        System.out.println("2 milhas quadradas para acres: " + ConversaoDeUnidadesDeArea.milhasToAcres(2));
        System.out.println("1 acre para pés quadrados: " + ConversaoDeUnidadesDeArea.acresToPes(1));
    }
}

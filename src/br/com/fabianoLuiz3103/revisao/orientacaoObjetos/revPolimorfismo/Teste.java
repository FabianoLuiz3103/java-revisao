package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revPolimorfismo;

/**
 * Tipo da variável (tipo de referência) X Instância da variável (tipo de objeto)
 * Tipo da variável (tipo de referência):
 * O tipo da variável é definido na declaração da variável e determina:
 * Quais métodos e atributos podem ser acessados diretamente.
 * Como o compilador verifica a compatibilidade do código.
 *
 * --> EM JAVA a invocação de método sempre será decidida em tempo de execução.
 * o Java procurará o objeto na memória para decidir qual método vai ser chamado
 * sempre relacionado com sua classe de instância e não de referência
 *
 * Instância da variável (tipo de objeto):
 * Instância -> objeto real criado na memória após usar o "new"
 * A instância da variável (ou tipo do objeto) é definida no new Aluno().
 * Determina qual implementação será executada em tempo de execução (polimorfismo).
 * Mesmo que a variável seja do tipo Pessoa, se o método for sobrescrito em Aluno, o método da instância (Aluno) será executado.
 */


/**
 * Mesmo sem sobrescrita, a instância sempre executa os métodos herdados da superclasse, pois a instância real contém tudo o que foi herdado.
 * Se Aluno não sobrescrever o método, ele usa a implementação de Pessoa, pois herança significa que Aluno tem todos os métodos de Pessoa.
 * Se Aluno não sobrescreve, ele usa os métodos herdados da superclasse.
 * Se Aluno sobrescreve, a instância executa a versão nova.
 */
public class Teste {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno(); // Variável do tipo Pessoa, instanciada como Aluno
        /**
         * Com polimorfismo em tempo de execução, consigo chamar métodos sobrescritos.
         * Se em Pessoa o método exibe "Olá" e em Aluno esse mesmo método exibe "Oi",
         * ao chamar o método a partir da variável do tipo Pessoa (instanciada como Aluno),
         * será exibido "Oi", pois o método de Aluno sobrescreve o de Pessoa.
         *
         * Porém, métodos EXCLUSIVOS da classe Aluno só poderão ser chamados se
         * eu fizer casting para a classe Aluno
         */
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua 1, nº 2");
        aluno.setEndereco("Rua 2, nº 4");
        professor.setEndereco("Rua 3, nº 8");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());

        /**
         * O método obterEtiquetaDeEndereco é da classe Pessoa
         * e as classes Aluno e Professor herdam esse método,
         * como ainda não teve sobrecarga o comportamento é o
         * mesmo da classe Mãe
         */

        /**
         * Com a sobrecarga a saída agora está personalizada
         * para as instâncias Aluno e Professor
         */

    }
}

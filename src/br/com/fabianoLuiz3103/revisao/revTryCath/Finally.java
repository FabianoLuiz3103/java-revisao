package br.com.fabianoLuiz3103.revisao.revTryCath;

/**
 * SEMPRE será executado após o try ou catch
 * executado após o try ou catch
 * --> fechar arquivo
 * --> fechar conexão banco de dados
 *
 * System.exit(0) --> termina o programa; então se tiver um desse dentro
 * do catch o finally não é executado
 */
public class Finally {

    public static void main(String[] args) {

        int[] numeros = {4,8,16,32,64,128};
        int[] denom = {2,0,4,8,0};

        for(int i = 0; i < numeros.length; i++){
            try{
                System.out.println(numeros[i] + "/" + denom[i] + "=" + (numeros[i]/denom[i]));
            }catch (ArithmeticException e){
                System.out.println("Erro ao dividir por zero! ");
                System.exit(0);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Erro a posição do array é inválida");
                System.exit(0);
            }
            finally {
                System.out.println("Essa linha é impressa sempre após o try ou catch");
            }
        }
    }
}

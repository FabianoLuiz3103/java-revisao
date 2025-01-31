package br.com.fabianoLuiz3103.revisao.revTryCath;

public class MultiplosCatch {

    public static void main(String[] args) {

        int[] numeros = {4,8,16,32,64,128};
        int[] denom = {2,0,4,8,0};

        for(int i = 0; i < numeros.length; i++){
            try{
                System.out.println(numeros[i] + "/" + denom[i] + "=" + (numeros[i]/denom[i]));
            }catch (ArithmeticException e){
                System.out.println("Erro ao dividir por zero! ");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Erro a posição do array é inválida");
            }
            catch (Throwable e){ //Capturando exception genérica -> Não é boa prática
               //Throwable é classe mãe de todas as Exceptions
                System.out.println("Ocorreu um erro");
            }
        }

        /*
        Primeiro vem as exceções específicas e depois a
        genérica!
         */

        /*
        Exceptions da mesma família podem ser agrupadas em um mesmo catch
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
         */
    }
}

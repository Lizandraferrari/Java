public class Main {
    public static void main(String[] args) {
        //Escreva para Giovanna um Fluxograma e um Programa em Java da Tabuada dos números 6 até 10.
        //1 - Abrir um laço for de 6 a 10
        //2 - Abrir um segundo laço dentro dele de 1 a 10
        //3 - Imprimir os valores com a multiplicação
        for (int cont = 6 ; cont <= 10 ; cont++){
            for (int i = 1 ; i <= 10 ; i++){
                System.out.println(cont + " x " + i + " = " + cont * i);
            }
        }
    }
}
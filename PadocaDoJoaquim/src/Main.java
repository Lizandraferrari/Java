import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*A Padaria de Joaquim faz aniversário na semana que vem e ele e sua
        família decidiram que, além de fazer a tradicional comemoração, irão selecionar
        10 produtos na padaria para fazer a promoção da semana de 50% desses produtos.
        Exiba na tela o nome do produto e seu respectivo valor com 50% de desconto.

        1 - Declarar variaveis de produtos, valores
        2 - Abriria um laço de repetição
        3 - Dentro do laço solicitar as informações dos produtos que vão para promoção
        4 - Realizar aplicação do valor do desconto
        5 - Apresentar valores e nomes dos produtos já com o preço final de aniversário.
        Sonho 3,00
        Coxinha 6,50
        Esfiha 3,00
        Pastel 6,00
        Baguete   12,00
        Achocolatado 3,50
        Pão  0,50
        Bolo  5,00
        Rosca  6,00
        Café  1,00
        */
        Scanner cad = new Scanner(System.in);
        ArrayList<String> produto = new ArrayList();
        ArrayList<Double> valor = new ArrayList();
        for (int cont = 1; cont <= 10; cont++) {
            System.out.println("\nDigite o nome do produto: ");
            produto.add(cad.next());
            System.out.println("Digite o valor do produto: ");
            valor.add(cad.nextDouble());
        }
        System.out.println("Digite o quantidade de desconto do produto em número: ");
        int desconto = cad.nextInt();
        double descontaum = (double) desconto / 100.0;

        for (int cont = 0 ; cont < valor.size() ; cont++){
            double antibug = valor.get(cont);
            descontaum = (antibug * descontaum);
            valor.set(cont , descontaum);
            descontaum = (double) desconto / 100.0; //reseta o valor do desconto para não acumular
        }
        for (int cont = 0 ; cont < produto.size() ; cont++){
            System.out.println(produto.get(cont) + " em promoção por R$" +
                    String.format("%.2f",valor.get(cont)) + "!!");
        }
    }
}
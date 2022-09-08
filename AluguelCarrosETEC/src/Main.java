import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
/*A loja Velox, locadora de carros, precisa de um programa que ajude a cobrar os serviços
 prestados. Assim, elabore um fluxograma e a codificação em Java que leia os seguintes dados:

    Modelo do carro alugado
    Quantidade de dias da locação
    Valor da diária da locação
    Quantidade de Km percorridos
Calcular o preço total a pagar na locação com base na quantidade de dias e valor da diária,
 adicionando R$0,79 por Km rodado.
O programa deve exibir na tela o modelo do carro e o valor total a pagar.

1- Importar ferramenta Scanner para leitura
2- Declarar variáveis do modelo do carro, valor da diária, número de dias e número de KM
3- Elaborar o calculo segundo informações passadas
4- Apresentar os valores
*/
        Scanner input = new Scanner(System.in);
        String modelo;
        int dias;
        double diaria;
        double distancia;
        double resultado;

        System.out.println("Insira o modelo do carro alugado: ");
        modelo = input.next();
        System.out.println("Insira o número de dias que foi alugado o veiculo: ");
        dias = input.nextInt();
        System.out.println("Insira o valor da diária do veículo: ");
        diaria = input.nextDouble();
        System.out.println("Insira o número de KM rodados: ");
        distancia = input.nextDouble();
        resultado = ((double)dias * diaria + distancia * 0.79);

        //System.out.println("\nQuem alugou o carro "+modelo+" precisa pagar R$");
        //System.out.format("%.2f",resultado);
        System.out.println("\nQuem alugou o carro "+modelo +" precisa pagar R$"
                +String.format("%.2f",resultado));

    }
}
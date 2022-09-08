import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escreva um fluxograma e a codificação em Java para calcular o percentual de casos de
        // coronavírus nas regiões do Brasil. Para tanto, o programa deve ler os seguintes dados:
        //1. Nome da região
        //2. Número de casos da região
        //O programa deve exibir na tela um painel de dados com as seguintes informações:
        //1. Nome da região e o número de casos
        //2. Número de casos no Brasil
        //4. Porcentual que cada região representa em relação ao total de casos no Brasil.

        /*Fluxograma:
        1- Import da ferramenta Scanner para possibilitar o usuario escolher a regiao
        2- Inserir as informações sobre a covid para serem acessar por meio de variaveis
        3- Por meio de uma condicional, trazer a região escolhida
        4- Apresentar os valores referentes ao selecionado
        5- Continuar ate um comando dizer o contrario
Brasil
34.456.145
Centro-Oeste
3.921.251
Sul
7.315.985
Norte
2.747.519
Nordeste
6.852.302
Sudeste
13.619.088
Fonte: https://covid.saude.gov.br/
34.456.145 = 100%
blabla = x%
34.456.145x = 3.921.251
         */
        Scanner leia = new Scanner(System.in);
        int opc;
        int norte = 2747519;
        int nordeste = 6852302;
        int centroeste = 3921251;
        int sudeste = 13619088;
        int sul = 7315985;

        //(regiao*100)/brasil
        //porcentagem = (regiao*100)/brasil
        double porcentagem;
        int brasil = 34456145;
        do {
            System.out.print("Digite o número referente a região do Brasil que deseja ver as informações sobre" +
                    "a Covid-19: " +
                    "\n1 (Norte)\n2 (Nordeste)\n3 (Centro-Oeste)\n4 (Sudeste)\n5 (Sul)\nDigite outro " +
                    "número para encerrar o programa\n");
            opc = leia.nextInt();
            switch(opc){
                case 1:
                    porcentagem = (norte*100)/brasil;
                    System.out.println("Houveram 34.456.145 casos de COVID-19 no Brasil e\n" +
                            norte +" deles na região Norte, sendo "+ porcentagem + "% dos casos do Brasil.\n\n");
                    break;

                case 2:
                    porcentagem = (nordeste*100)/brasil;
                    System.out.println("Houveram 34.456.145 casos de COVID-19 no Brasil e\n" +
                            nordeste +" deles na região Nordeste, sendo "+ porcentagem + "% dos casos do " +
                            "Brasil.\n\n");
                    break;

                case 3:
                    porcentagem = (centroeste*100)/brasil;
                    System.out.println("Houveram 34.456.145 casos de COVID-19 no Brasil e\n" +
                            centroeste +" deles na região Centro-Oeste, sendo "+ porcentagem + "% dos " +
                            "casos do Brasil.\n\n");
                    break;

                case 4:
                    porcentagem = (sudeste*100)/brasil;
                    System.out.println("Houveram 34.456.145 casos de COVID-19 no Brasil e\n" +
                            sudeste +" deles na região Sudeste, sendo "+ porcentagem + "% dos casos " +
                            "do Brasil.\n\n");
                    break;

                case 5:
                    porcentagem = (sul*100)/brasil;
                    System.out.println("Houveram 34.456.145 casos de COVID-19 no Brasil e\n" +
                            sul +" deles na região Sul, sendo "+ porcentagem + "% dos casos do " +
                            "Brasil.\n\n");
                    break;
            }
        }while (opc >= 1 && opc <=5);
    }
}
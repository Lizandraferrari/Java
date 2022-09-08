import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class Main {
    public static void main(String[] args) {
        //Olá, (nome). Hoje é dia (dia da semana). Tenha um bom dia.
        //vamos fazer um import para trazer a data de hoje numa variável.
        //import java.time.LocalDate;
        /*String nome = "Lizandra";
        //Utiliza o padrão mundial de leitura de data, da ISO 8601 (ano/mes/dia)
        LocalDate hoje = LocalDate.now();
        //Por padrão, se pedir para exibir dia da semana, vai aparecer em inglês. Então temos que
        //Importar info do país numa variavel
        Locale brasil = new Locale("pt","BR");
        //System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        //Agora para trazer a data para sabermos se damos bom dia ou boa tarde:
        //Realizamos um import
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() <12){
            saudacao = "bom dia";
        }else if (agora.getHour() >=12 && agora.getHour() <18){
            saudacao = "boa tarde";
        }else if (agora.getHour() >=18 && agora.getHour() <24){
            saudacao = "boa noite";
        } else {
            saudacao = "fodase";
        }
        System.out.printf("Ola, %s. Hoje e %s, %s", nome, diaSemana, saudacao.toUpperCase());
        //printf faz quebra de linha automática*/

        //////////////////////////////////////////////////////////////////////////Laços numéricos
        //1 2 3 4 5 6 7 8 9 10
        //para uma variável que inicia em 1 e vai até 10, somando 1 por 1, faça:
        /*for (int i = 1; i <=10; i++){
            // é possivel abrir um laço numérico dentro de um laço numérico
            for (int j = 1; j <=10; j++) {
            System.out.println(i + "x" + j + " = " + i * j);
            }
        }*/
        /////////////////////////////////////////////////////////////////////Vetores e arrays
        //com tamanho declarado:
        /*int[] num = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        for (int i=0; i < num.length;i++){
            System.out.println(num[i]);
        }
        //com conteúdo declarado:
        String[] coisas = { "seila", "Num sei", "Sem ideia mano"};
        System.out.println(Arrays.toString(coisas));
        //não pode misturar tipos dentro do array*/

        //////////////////////////////////////////////////////////////////////////Funções
        /*String nome = "Severina";
        saudacao(nome);
    }
        public static void saudacao(String jubileu){
        System.out.println("Hello, " + jubileu);
    }
*/
      /*  int resultado = soma(2, 3);
        System.out.println(resultado);
    }
    public static int soma (int a, int b){
        return a + b;
    }
}*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos calcular a área de um retângulo?");
        System.out.print("Escreva o valor da altura: ");
        int altura = sc.nextInt();
        System.out.print("\nEscreva o valor da base: ");
        int base = sc.nextInt();
        int area = altura * base;
        System.out.print("\nO valor da área desse retângulo é: " + area);
    }
    }
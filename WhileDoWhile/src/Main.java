import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*1- Escreva um programa em Java que leia 2 valores e imprima o resultado da
         divisão do primeiro valor lido pelo segundo valor lido. O programa deve ser finalizado
          quando o usuário digitar 0 (zero) para o segundo valor. Utilize a estrutura ENQUANTO.
*/
        /*Exercicio 1:
        int num1 = 1;
        int num2 = 1;
        double res;

        JOptionPane.showMessageDialog(null, "Olá, bem-vinda(o) ao exercicio 1: ");
        while(num1 != 0 || num2 != 0){
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número da divisão: " +
                    "(Digite 0 para encerrar o programa)"));
            if (num1 == 0){
                System.exit(0);
            }
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número da divisão: " +
                    "(Digite 0 para encerrar o programa)"));
            if (num2 == 0) {
                System.exit(0);
            }
                res = (double) num1 / (double) num2;

            JOptionPane.showMessageDialog(null,
                    "O resultado da divisão é: " + String.format("%.2f", res));

         Fim do exercicio 1 */




            //2- Reescreva o exercício anterior utilizando a estrutura REPITA.
        int num1;
        int num2;
        double res;
        JOptionPane.showMessageDialog(null, "Bem-vinda(o) ao exercicio 2: ");

        do {
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número da divisão: " +
                    "(Digite 0 para encerrar o programa)"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número da divisão: " +
                        "(Digite 0 para encerrar o programa)"));
            }
            while (num1 != 0 || num2 != 0);
                if (num1 == 0 || num2 == 0) {
                    JOptionPane.showMessageDialog(null, "Tenha um bom dia!");
                    System.exit(0);
                }
            res = (double) num1 / (double) num2;

            JOptionPane.showMessageDialog(null,
                    "O resultado da divisão é: " + String.format("%.2f", res));
        }
    }

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*Paulo, o estudante do Ensino Médio que você conheceu no Mergulhando no Tema,
        agora deseja criar um programa que realize a soma de todos os elementos de uma
         matriz 10x10, contendo números inteiros. Elabore o pseudocódigo e a codificação em
          linguagem Java de um software que resolva o problema de Paulo.*/
        int matriz [][] = new int[10][10];
        int linha , coluna;
        int soma = 0;

        JOptionPane.showMessageDialog(null, "Insira os valores da matriz: ");
        try{
            for(linha = 0 ; linha <10 ; linha++){
                for (coluna = 0 ; coluna <10 ; coluna++){
                    matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog
                            ("Espaço "+(linha+1)+" x "+(coluna+1)));
                }
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite um valor válido."
            , "Erro", JOptionPane.ERROR_MESSAGE);
        }
        for(linha = 0 ; linha <10 ; linha++){
            for (coluna = 0 ; coluna < 10 ; coluna++){
                soma = soma + matriz[linha][coluna];
            }
        }
        JOptionPane.showMessageDialog(null, "A soma de todos os elementos " +
                "da matriz é: "+soma);
    }
}
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
/*Como estudante do Ensino Médio, Paulo deseja fazer um software que realize a soma de duas matrizes 4x4.
Ele sabe que, para realizar a soma de duas matrizes, segundo a matemática, cada elemento da matriz A deve
ser somado ao seu elemento correspondente da matriz B, gerando o resultado em uma terceira matriz C.
Elabore o pseudocódigo e a codificação em linguagem Java de um software que resolva o desafio de Paulo.*/
        int matriz1 [][] = new int [4][4];
        int linha, coluna;
        int matriz2 [][] = new int [4][4];
        int matriz3 [][] = new int [4][4];

        JOptionPane.showMessageDialog(null, "Escreva os valores presentes na matriz A. ");
        try{
        for (linha = 0; linha<4; linha++){
            for (coluna = 0; coluna<4; coluna++){
                matriz1[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Escreva o valor inserido em " +
                         + (linha+1) + " x "+ (coluna+1) +" da matriz A: "));
            }
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Por favor digite um valor válido",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Escreva os valores presentes na matriz B. ");
        try {
            for (linha = 0; linha < 4; linha++) {
                for (coluna = 0; coluna < 4; coluna++) {
                    matriz2[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Escreva o valor inserido em "
                            + (linha + 1) + " x " + (coluna + 1) + " da matriz B:"));
                }
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor digite um valor válido.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }

        for (linha = 0; linha<4; linha++){
            for (coluna = 0; coluna<4; coluna++) {
                int controle = matriz1[linha][coluna] + matriz2[linha][coluna];
                matriz3[linha][coluna] = controle;
            }
        }
        for (linha = 0 ;linha < 4; linha++){
            for (coluna = 0; coluna < 4; coluna++){
                System.out.print(matriz3[linha][coluna]+"  ");
            }
            System.out.println("");
            }
    }
}

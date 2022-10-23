package Classes;

import javax.swing.*;

public class Aluno extends Pessoa {
    public static String registroAluno;

    int av1;
    int av2;
    int notaParcial = (av1+av2)/2;
    int frequencia;
    String recuperacao;
    int provaRecuperacao;

    String matricula [][] = new String[1][9];

    @Override
    public String get() {
        registroAluno = JOptionPane.showInputDialog("Digite o número do RA: ");
        return registroAluno;
    }
    public int getAv1(){
        av1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da AV1: "));
        return av1;
    }
    public int getAv2() {
        av2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da AV1: "));
        return av2;
    }
    public int getFrequencia(){
        frequencia = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos % de presença: "));
        return frequencia;
    }

    public String getRecuperacao() {
        if(frequencia<75){
            recuperacao = "Aluno de recuperação.";
        }else if (frequencia>=75 && notaParcial >=70){
            recuperacao = "Aluno não precisa de recuperação.";
        }else if (frequencia>=75 && notaParcial>=30) {
            recuperacao = "Aluno de recuperação.";
        }else{
            recuperacao = "Aluno REPROVADO!";
        }
        return recuperacao;
    }
    public int getProvaRecuperacao() {
        provaRecuperacao = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da AV1: "));
        return provaRecuperacao;
    }
}
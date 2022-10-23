package Classes;

import javax.swing.*;

public class Professor extends Pessoa{
    String formacao;

    @Override public String get() {
        formacao = JOptionPane.showInputDialog("Digite a formação: ");
        return formacao;
    }
}

package Classes;

import javax.swing.*;

public abstract class Pessoa {
    String nome;
    String endereco;
    int telefone;
    String curso;
    String turma;


    public String getNome() {
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        return nome;
    }

    public String getEndereco() {
        endereco = JOptionPane.showInputDialog("Digite o endereço: ");
        return endereco;
    }

    public int getTelefone() {
        telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone: "));
        return telefone;
    }
    public String getCurso(){
        curso = JOptionPane.showInputDialog("Digite o nome do curso: ");
        return curso;
    }

    public String getTurma() {
        turma = JOptionPane.showInputDialog("Digite o código da turma");
        return turma;
    }
    public String get(){
        return null;
    }

}

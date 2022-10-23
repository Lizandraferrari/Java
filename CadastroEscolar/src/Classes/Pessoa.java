package Classes;

import javax.swing.*;

public abstract class Pessoa {
    public String nome;
    public String endereco;
    public int telefone;
    public String curso;
    public String turma;
    public static Boolean existe;


    public String getNome() {
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        if (nome.toLowerCase().contains(nome.toLowerCase())){
            existe = true;
            JOptionPane.showMessageDialog(null, nome+" já cadastrado");
            return nome;
        }else {
            existe = false;
            return nome;
        }
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

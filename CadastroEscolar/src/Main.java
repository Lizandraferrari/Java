import Classes.Aluno;
import Classes.Pessoa;
import Classes.Professor;

import javax.swing.*;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        int opc;
        Object[] identificacao = {"Secretaria", "RH", "Coordenador", "Professor", "Aluno"};
        String escolha = (String)JOptionPane.showInputDialog(
                null,
                "Selecione segundo sua função: ",
                "Log in",
                JOptionPane.PLAIN_MESSAGE, null, identificacao, identificacao[4]);
        try{
            Pessoa contratar = new Professor();
            Pessoa matricular = new Aluno();
            switch(escolha){
                case "Secretaria":{
                opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar novo curso,\n"+
                        "2 - Adicionar nova disciplina a um curso,\n3 - Cadastrar aluno ou acessar cadastro"+
                        ",\n6 - Emitir diário de classe das turmas,\n7 - Emitir histórico escolar,\n"+
                        "8 - Verificar situação cadastral do aluno."));
                switch (opc){
                    case 1:{

                    }
                    case 2:{

                    }
                    case 3:{
                        matricular.getNome();

                    }
                    case 4:{

                    }
                    case 5:{

                    }
                    case 6:{

                    }
                    case 7:{

                    }
                    case 8:{

                    }

                }
                }
                case "RH":{
                    JOptionPane.showMessageDialog(null, "Insira as informações: ");
                try {
                    contratar.getNome();
                    contratar.getEndereco();
                    contratar.getCurso();
                    contratar.getTelefone();
                    //contratar.getTurma();//coordenador
                    contratar.get();
                }catch (InputMismatchException e){
                    JOptionPane.showMessageDialog(null,"Escreva uma informação válida."
                            ,"Erro",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                }
                case "Coordenador":{
                    contratar.getNome();
                    contratar.getTurma();
                }
                case "Professor":{
                    JOptionPane.showInputDialog(null, "Digite o nome do aluno:");
                    JOptionPane.showInputDialog(null,
                    "1 - AV1 \n2 - AV2\n 3 - Frequência\n4 - Nota de recuperação\n" +
                            "5 - Turmas designadas");

                }
                case "Aluno":{
                }
            }
        }catch(InputMismatchException e){
            JOptionPane.showMessageDialog(null, "Selecione uma opção válida."
            ,"Erro",JOptionPane.ERROR_MESSAGE);
            return;
        }

    }
}
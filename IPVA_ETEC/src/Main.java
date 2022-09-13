import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    //O escritório de Despachante Vale Card é uma empresa especializada em documentação
        // de veículos atuando diretamente com os órgãos de trânsito. Entre suas atividades,
        // está informar para seus clientes o mês de vencimento do IPVA de seus veículos.
        // Para isso, o cliente fornece o número final da placa do veículo, em seguida deve ser
        // apresentado o mês que o IPVA deve ser pago, conforme tabela a seguir:
        //Placa Final 1
        //Pagamento até 30/04

        //Placa Final 2
        //Pagamento até 31/05

        //Placa Final 3
        //Pagamento até 30/06

        //Placa Final 4
        //Pagamento até 31/07

        //Placa Final 5
        //Pagamento até 31/08

        //Placa Final 6
        //Pagamento até 30/09

        //Placa Final 7
        //Pagamento até 31/10

        //Placa Final 8
        //Pagamento até 30/11

        //Placa Final 9 ou 0
        //Pagamento até 31/12
        int placa;
        String dia = null;
        placa = Integer.parseInt(JOptionPane.showInputDialog("Digite o ultimo número da placa: "));
        switch (placa) {
            case 1:
                dia = "30/04";
                break;

            case 2:
                dia = "31/05";
                break;

            case 3:
                dia = "30/06";
                break;

            case 4:
                dia = "31/07";
                break;

            case 5:
                dia = "31/08";
                break;

            case 6:
                dia = "30/09";
                break;

            case 7:
                dia = "31/10";
                break;

            case 8:
                dia = "30/11";
                break;

            case 9:
                dia = "31/12";
                break;

            case 0:
                dia = "31/12";
                break;

            default:
                JOptionPane.showMessageDialog(null, "Inválido");
                return;
        }

            JOptionPane.showMessageDialog(null, "A data de vencimento" +
                    " do seu IPVA é dia " + dia);
    }
}
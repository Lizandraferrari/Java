import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//- O usuario vai informar o seu signo em formato string minúsculo,
// e então nosso algoritmo deve devolver as datas correspondentes ao signo digitado:
/* Áries: de 21 março a 20 abril
✔ Touro: de 21 abril a 20 maio
✔ Gêmeos: de 21 maio a 20 junho
✔ Câncer: de 21 junho a 22 julho
✔ Leão: de 23 julho a 22 agosto
✔ Virgem: de 23 agosto a 22 setembro
✔ Libra: de 23 setembro a 22 outubro
✔ Escorpião: de 23 outubro a 21 novembro
✔ Sagitário: de 22 novembro a 21 dezembro
✔Capricórnio: de 22 dezembro a 20 janeiro
✔ Aquário: de 21 janeiro a 18 fevereiro
✔ Peixes: de 19 fevereiro a 20 março*/
        String nome;
        String signo;
        String data = null;
        String cavaleiro = null;
        nome = JOptionPane.showInputDialog("Olá amigo, qual seu nome?");
        JOptionPane.showMessageDialog(null, "Que nome bonito, "+nome);
        JOptionPane.showMessageDialog(null, "Eu me chamo Lear e sou do " +
                "signo de virgem. Fui criado dia 15/09/2022 e meu cavaleiro de ouro é o grande Shaka!");
        signo = JOptionPane.showInputDialog("E qual seu signo "+nome+"?");

        switch (signo) {
            case "aries" -> {
                data = "21 março a 20 abril";
                cavaleiro = "Mu";
            }
            case "touro" -> {
                data = "21 abril a 20 maio";
                cavaleiro = "Aldebaran";
            }
            case "gemeos" -> {
                data = "21 maio a 20 junho";
                cavaleiro = "Saga";
            }
            case "cancer" -> {
                data = "21 junho a 22 julho";
                cavaleiro = "Mascara da Morte";
            }
            case "leao" -> {
                data = "23 julho a 22 agosto";
                cavaleiro = "Aiolia";   //signo da pessoa que criou esse programa
            }
            case "virgem" -> {
                data = "23 agosto a 22 setembro";
                cavaleiro = "Shaka";  //meu cavaleiro favorito. uso um chaveiro dele na chave de casa
            }
            case "libra" -> {
                data = "23 setembro a 22 outubro";
                cavaleiro = "Dohko";
            }
            case "escorpiao" -> {
                data = "23 outubro a 21 novembro";
                cavaleiro = "Milo";
            }
            case "sagitario" -> {
                data = "22 novembro a 21 dezembro";
                cavaleiro = "Aiolos";
            }
            case "capricornio" -> {
                data = "22 dezembro a 20 janeiro";
                cavaleiro = "Shura";
            }
            case "aquario" -> {
                data = "21 janeiro a 18 fevereiro";
                cavaleiro = "Camus";
            }
            case "peixes" -> {
                data = "19 fevereiro a 20 março";
                cavaleiro = "Afrodite";
            }
            default -> {
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Nossa "+nome+ " você nasceu"  +
                " de "+data+" e tem como seu cavaleiro de ouro o "+cavaleiro+"! Que legal, foi" +
                " um prazer te conhecer!!!!");
    }
}
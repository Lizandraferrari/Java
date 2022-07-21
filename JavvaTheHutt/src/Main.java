import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Olá, (nome). Hoje é dia (dia da semana). Tenha um bom dia.
        //vamos fazer um import para trazer a data de hoje numa variável.
        //import java.time.LocalDate;
        String nome = "Lizandra";
        //Utiliza o padrão mundial de leitura de data, da ISO 8601 (ano/mes/dia)
        LocalDate hoje = LocalDate.now();
        //Por padrão, se pedir para exibir dia da semana, vai aparecer em inglês. Então temos que
        //Importar info do país numa variavel
        Locale brasil = new Locale("pt","BR");
        //System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        //Agora para trazer a data para sabermos se damos bom dia ou boa tarde:
        //Realizamos um import
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() <12){
            saudacao = "bom dia";
        }else if (agora.getHour() >=12 && agora.getHour() <18){
            saudacao = "boa tarde";
        }else if (agora.getHour() >=18 && agora.getHour() <24){
            saudacao = "boa noite";
        } else {
            saudacao = "fodase";
        }
        System.out.printf("Ola, %s. Hoje e %s, %s", nome, diaSemana, saudacao.toUpperCase());
        //printf faz quebra de linha automática
    }
}
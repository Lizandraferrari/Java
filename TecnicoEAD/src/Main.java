import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Elabore o fluxograma e a codificação Java que satisfaça as seguintes situações:

        Ler um nome, serie, telefone e a média de um aluno. Após a leitura exibir os dados
        no seguinte formato:

        --------------------------- Técnico em Informática EaD ---------------------------------

        Nome:

        Telefone:

        Série:

        ----------------------------------------------------------------------------------------

        Média:

        ----------------------------------------------------------------------------------------

1- Fazer import da biblioteca scanner
2- Declarar as variaveis nome, telefone, serie e média
3- Perguntar ao usuário as informações a serem inseridas
4- Apresentar na tela as informações.
*/
        Scanner input = new Scanner(System.in);
        String nome;
        String telefone;
        String serie;
        String media;

        System.out.println("Digite o nome: ");
        nome = input.next();
        System.out.println("Digite o telefone de contato: ");
        telefone = input.next();
        System.out.println("Digite a série que a pessoa se encontra: ");
        serie = input.next();
        System.out.println("Escreva o valor da média: ");
        media = input.next();

        System.out.println("--------------------------- Técnico em Informática EaD -----------" +
                "----------------------\n" +
                "\nNome: "+nome+"\nTelefone: "+telefone+"\nSérie: "+serie+"" +
                "\n------------------------------------------------------------------" +
                "----------------------\n" +
                "\nMédia: "+media+"\n----------------------------------" +
                "------------------------------------------------------");
    }
}
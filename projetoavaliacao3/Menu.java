package projetos.projetoavaliacao3;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Menu {

    int id = 0;

    public static void menu() {
        int opcao;
        Scanner scan = new Scanner(System.in);
        System.out.printf("----Menu Principal----\n"
                + "Escolha a opção que deseja:\n"
                + "1- Lista de Projetos\n"
                + "2- Lista de tarefas\n"
                + "3- Adicionar Projeto\n"
                + "4- Adicionar tarefa\n"
                + "5- Apagar tudo");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                //Chamar lista de Projetos
                break;
            case 2:
                //Chamar lista de tarefas
                break;
            case 3:
                //Adicionar Projeto
                break;
            case 4:
                //Adicionar tarefa
                break;
            case 5:
                //Fechar programa ?
                break;
            default:
                System.out.println("Opção Inválida!!!");
        }

    }

    //Método para criar Projeto novo (Case 3):
    public void addProjeto() {
        String idProje;
        String nomeProje;
        String descricaoProje;
        String criacaoProje;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do seu projeto:");
        nomeProje = scan.nextLine();

        System.out.println("Agora digite uma descrição para o seu projeto:");
        descricaoProje = scan.nextLine();

        System.out.println("Digite a data atual:");
        criacaoProje = scan.nextLine();

        idProje = proximo();
        Projeto xx = new Projeto(idProje, nomeProje, descricaoProje, criacaoProje);
    }

    //Função que incrementa o id e retorna Projeto+id
    public String proximo() {
        String next;
        next = "Projeto"+id;
        return next;
    }
}

package projetos.projetoavaliacao3;

/**
 *
 * @author ander
 */
public class Principal {

    public static void main(String[] args) {
        while (true){
            //Menu.menu();
            ListaNomes lista = new ListaNomes();
            lista.adiciona("Anderson");
            lista.adiciona("Laura");
            lista.adiciona("Vinicius");
            System.out.println(lista);
            //Consertar to string na classe ListaNomes.
        }
    }
}

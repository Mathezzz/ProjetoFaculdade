package projetos.projetoavaliacao3;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ander
 */
public class ListaNomes {

    private No inicio;
    private int tam = 0;
    LinkedList<String> listaNome = new LinkedList<>(List.of());

    public void adiciona(String nome) {
        No celula = new No(nome);
        this.inicio = celula;
        this.tam++;
    }

    public void removerNome(String nome) {
        No atual = this.inicio;
        No anterior = null;
        for (int i = 0; i < this.tam; i++) {
            if (atual.getElemento().equals(nome)) {
                //remove o primeiro
                if (i == 0) {
                    atual.setElemento(null);
                } else {
                    //Lógica para ligar o anterior ao proximo
                    anterior.setProximo(atual.getProximo());
                }
            }
            anterior = atual;
            atual = atual.getProximo();
        }
        //Remove o primeiro caso não entre no for?

    }

    public int getTamanho() {
        return this.tam;
    }
    
/*
    public String toString() {
        if (this.tam == 0) {
            return "[]";
        } else {
            StringBuilder builder = new StringBuilder("[");

            No atual = this.inicio;
            for (int i = 0; i < this.tam - 1; i++) {
                builder.append(atual.getElemento()).append(", ");
                atual = atual.getProximo();
            }
            builder.append(atual.getElemento()).append("]");
            return builder.toString();
        }
    }
*/
    //Consertar to String
    @Override
    public String toString() {
        return "ListaNomes{" + "tam=" + tam + ", listaNome=" + listaNome + '}';
    }
}

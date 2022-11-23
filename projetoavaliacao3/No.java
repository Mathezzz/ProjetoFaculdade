/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetos.projetoavaliacao3;

/**
 *
 * @author ander
 */
public class No<T> {
    private String elemento;
    private No proximo;

    public No(String elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public No(String elemento, No proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }
    
    

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

       
    
}

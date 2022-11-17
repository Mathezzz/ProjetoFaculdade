
package projetos.projetoavaliacao3;

import java.util.Date;

/**
 *
 * @author ander
 */
public class Projeto {
    private String id;
    private String nome;
    private String descricao;
    private String CriadoEm;
    private String AtualizadoEm;
    
    public Projeto(String id, String nome, String descricao, String CriadoEm){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.CriadoEm = CriadoEm;
    }
    
}

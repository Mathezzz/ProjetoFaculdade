package projetos.projetoavaliacao3;

import java.util.Date;

/**
 *
 * @author ander
 */
public class Projeto extends ListaNomes {
    private String id;
    private String nome;
    private String descricao;
    private String CriadoEm;
    private String AtualizadoEm;

    //Criação de lista de projetos
    
    
    
    public void setParametros(String id, String nome, String descricao, String crem){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.CriadoEm = crem;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCriadoEm() {
        return CriadoEm;
    }

    public void setCriadoEm(String CriadoEm) {
        this.CriadoEm = CriadoEm;
    }

    public String getAtualizadoEm() {
        return AtualizadoEm;
    }

    public void setAtualizadoEm(String AtualizadoEm) {
        this.AtualizadoEm = AtualizadoEm;
    }

}

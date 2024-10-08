package model;

public class Item {
    private Integer idItem;
    private String nome;
    private String descricaoPositiva;
    private String descricaoNegativa;
    private String comandoCorreto;
    private Integer idcenaAtual;
    private Integer idcenaDestino;
    private String descricao;

    public Item() {
    }

    public Integer getIdItem() {
        return this.idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricaoPositiva() {
        return this.descricaoPositiva;
    }

    public void setDescricaoPositiva(String descricaoPositiva) {
        this.descricaoPositiva = descricaoPositiva;
    }

    public String getDescricaoNegativa() {
        return this.descricaoNegativa;
    }

    public void setDescricaoNegativa(String descricaoNegativa) {this.descricaoNegativa = descricaoNegativa;}

    public String getComandoCorreto() {
        return this.comandoCorreto;
    }

    public void setComandoCorreto(String comandoCorreto) {
        this.comandoCorreto = comandoCorreto;
    }

    public Integer getIdcenaAtual() {
        return idcenaAtual;
    }

    public void setIdcenaAtual(Integer idcenaAtual) {
        this.idcenaAtual = idcenaAtual;
    }

    public Integer getIdcenaDestino() {
        return idcenaDestino;
    }

    public void setIdcenaDestino(Integer idcenaDestino) {
        this.idcenaDestino = idcenaDestino;
    }

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    @Override
    public String toString() {
        return "Item{" +
                "idItem=" + idItem +
                ", nome='" + nome + '\'' +
                ", descricaoPositiva='" + descricaoPositiva + '\'' +
                ", descricaoNegativa='" + descricaoNegativa + '\'' +
                ", comandoCorreto='" + comandoCorreto + '\'' +
                ", cenaAtual=" + idcenaAtual +
                ", cenaDestino=" + idcenaDestino +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}

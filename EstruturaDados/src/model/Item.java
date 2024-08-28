package model;

public class Item {
    private Integer idItem;
    private String nome;
    private String descricaoPositiva;
    private String descricaoNegativa;
    private String comandoCorreto;
    private Cena cenaAtual;
    private Cena cenaDestino;
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

    public void setDescricaoNegativa(String descricaoNegativa) {
        this.descricaoNegativa = descricaoNegativa;
    }

    public String getComandoCorreto() {
        return this.comandoCorreto;
    }

    public void setComandoCorreto(String comandoCorreto) {
        this.comandoCorreto = comandoCorreto;
    }

    public Cena getCenaAtual() {
        return this.cenaAtual;
    }

    public void setCenaAtual(Cena cenaAtual) {
        this.cenaAtual = cenaAtual;
    }

    public Cena getCenaDestino() {
        return this.cenaDestino;
    }

    public void setCenaDestino(Cena cenaDestino) {
        this.cenaDestino = cenaDestino;
    }

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}
}

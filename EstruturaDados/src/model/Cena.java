package model;

import java.util.List;

public class Cena {
    private Integer id_cena;
    private String descricao;
    private List<Item> itens;

    public Cena() {
    }

    public Integer getId_cena() {
        return this.id_cena;
    }

    public void setId_cena(Integer id_cena) {
        this.id_cena = id_cena;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString() {
        return "Cena{id_cena=" + this.id_cena + ", descricao='" + this.descricao + "'}";
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
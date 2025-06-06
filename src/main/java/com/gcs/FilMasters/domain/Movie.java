package com.gcs.FilMasters.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    private String id;
    private String nome;
    private String descricao;
    private int duracaoMinutos;// duração add
    private String anoLancamento;

    @ManyToOne
    @JoinColumn(name = "genre_id") // nome da coluna estrangeira
    private Genre genero;

    public Movie(String id, String nome, String descricao, int duracaoMinutos, Genre genero, String anoLancamento) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.duracaoMinutos = duracaoMinutos; // duração add
        this.genero = genero; // associação com a entidade Genre
        this.anoLancamento = anoLancamento;
    }

    public Movie(){}

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracaoMinutos() {
    return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
    this.duracaoMinutos = duracaoMinutos;
    }
    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

}

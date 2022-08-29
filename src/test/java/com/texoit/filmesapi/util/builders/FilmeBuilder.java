package com.texoit.filmesapi.util.builders;

import com.texoit.filmesapi.models.Filme;

public class FilmeBuilder {
    private String titulo;
    private Long id;
    private Integer ano;

    public FilmeBuilder comTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public FilmeBuilder comId(Long id) {
        this.id = id;
        return this;
    }

    public FilmeBuilder comAno(Integer ano) {
        this.ano = ano;
        return this;
    }

    public Filme criar() {
        return new Filme(id, ano, titulo, null, null, null);
    }
}

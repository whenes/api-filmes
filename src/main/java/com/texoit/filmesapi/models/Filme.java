package com.texoit.filmesapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Filme implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer ano;
    private String titulo;
    private String estudios;
    @ManyToMany
    @JoinTable(
            name = "filme_produtor",
            joinColumns = @JoinColumn(name = "produtor_id"),
            inverseJoinColumns = @JoinColumn(name = "filme_id")
    )
    private List<Produtor> produtores;
    private Boolean vencedor;

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", ano=" + ano +
                ", titulo='" + titulo + '\'' +
                ", estudios='" + estudios + '\'' +
                ", produtores='" + produtores + '\'' +
                ", vencedor=" + vencedor +
                '}';
    }
}

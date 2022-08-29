package com.texoit.filmesapi.repositories;

import com.texoit.filmesapi.models.Filme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

@Repository
public class FilmeRepository {
    private EntityManager entityManager;

    @Autowired
    public FilmeRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void salvar(Filme filme) {
        entityManager.persist(filme);
    }

    public Filme buscarPorId(Long id) {
        return entityManager.find(Filme.class, id);
    }
}

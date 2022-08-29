package com.texoit.filmesapi.repositories;

import com.texoit.filmesapi.models.Filme;
import com.texoit.filmesapi.util.JPAUtil;
import com.texoit.filmesapi.util.builders.FilmeBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import static org.junit.jupiter.api.Assertions.*;

class FilmeRepositoryTest {
    private FilmeRepository filmeRepository;
    private EntityManager entityManager;

    @BeforeEach
    public void beforeEach() {
        this.entityManager = JPAUtil.getEntityManager();
        this.filmeRepository = new FilmeRepository(entityManager);
        entityManager.getTransaction().begin();
    }

    @AfterEach
    public void afterEach() {
        entityManager.getTransaction().rollback();
    }

    @Test
    public void deveriaEncontrarFilmeCadastrado() {
        Filme filme = new FilmeBuilder()
                .comId(null)
                .comAno(1980)
                .comTitulo("Can't Stop the Music")
                .criar();
        filmeRepository.salvar(filme);

        Filme filmeEncontrado = filmeRepository.buscarPorId(filme.getId());
        assertNotNull(filmeEncontrado);
        assertEquals(1980, filme.getAno());
        assertEquals("Can't Stop the Music", filme.getTitulo());
    }

    @Test
    public void naoDeveriaEncontrarFilmeNaoCadastrado() {
        Filme filme = new FilmeBuilder()
                .comId(null)
                .comAno(1980)
                .comTitulo("Can't Stop the Music")
                .criar();
        filmeRepository.salvar(filme);
        assertThrows(NoResultException.class, () -> filmeRepository.buscarPorId(115L));
    }
}
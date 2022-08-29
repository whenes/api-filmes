package com.texoit.filmesapi.repositories;

import com.texoit.filmesapi.dtos.ProdutorDTO;
import com.texoit.filmesapi.models.Produtor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProdutorRepository {
    private EntityManager entityManager;

    @Autowired
    public ProdutorRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void salvar(Produtor produtor) {
        entityManager.persist(produtor);
    }

    public Produtor buscarProdutorPorId(Integer id) {
        return entityManager.find(Produtor.class, id);
    }

    public List<ProdutorDTO> obterProdutorComMaiorIntervaloEntreDoisPremiosConsecultivos() {
        //TODO falta aplicar query
        entityManager.createNativeQuery("SELECT p.nome  FROM produtor p LIMIt 2", Produtor.class).getResultList();
        return new ArrayList<ProdutorDTO>();
    }

    public List<ProdutorDTO> obterProdutorComDoisPremiosMaisRapido() {
        //TODO falta aplicar query
        entityManager.createNativeQuery("SELECT p.nome FROM produtor p LIMIt 2", Produtor.class).getResultList();
        return new ArrayList<ProdutorDTO>();
    }
}

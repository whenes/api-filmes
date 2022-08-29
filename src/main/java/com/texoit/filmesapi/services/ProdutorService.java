package com.texoit.filmesapi.services;

import com.texoit.filmesapi.dtos.MinMaxProdutoresDTO;
import com.texoit.filmesapi.dtos.ProdutorDTO;
import com.texoit.filmesapi.repositories.ProdutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutorService {

    @Autowired
    private ProdutorRepository produtorRepository;

    public MinMaxProdutoresDTO obterProdutoresComMaisEMenosTempoEntreDoisPremios() {
        return new MinMaxProdutoresDTO(obterProdutorComDoisPremiosMaisRapido(), obterProdutorComMaiorIntervaloEntreDoisPremiosConsecultivos());
    }

    private List<ProdutorDTO> obterProdutorComMaiorIntervaloEntreDoisPremiosConsecultivos() {
        return produtorRepository.obterProdutorComMaiorIntervaloEntreDoisPremiosConsecultivos();
    }

    private List<ProdutorDTO> obterProdutorComDoisPremiosMaisRapido() {
        return produtorRepository.obterProdutorComDoisPremiosMaisRapido();
    }
}

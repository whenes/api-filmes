package com.texoit.filmesapi.controllers;

import com.texoit.filmesapi.dtos.MinMaxProdutoresDTO;
import com.texoit.filmesapi.services.ProdutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtores")
public class ProdutorRestController {

    @Autowired
    private ProdutorService produtorService;

    @GetMapping
    public MinMaxProdutoresDTO obterProdutorComMaiorEMenorIntervaloEntreDoisPremiosConsecultivos() {
        return produtorService.obterProdutoresComMaisEMenosTempoEntreDoisPremios();
    }
}

package com.texoit.filmesapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MinMaxProdutoresDTO {
    private List<ProdutorDTO> min;
    private List<ProdutorDTO> max;
}

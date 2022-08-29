package com.texoit.filmesapi.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutorDTO {
    private String producer;
    private Integer interval;
    private Integer previousWin;
    private Integer followingWin;
}

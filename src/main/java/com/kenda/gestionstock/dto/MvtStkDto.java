package com.kenda.gestionstock.dto;

import com.kenda.gestionstock.model.Article;
import com.kenda.gestionstock.model.MvtStk;
import com.kenda.gestionstock.model.TypeMvtStk;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStkDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDto article;

    private String nom;

    private TypeMvtStk typeMvt;


    public MvtStkDto fromEntity(MvtStk mvtStk){
        if(mvtStk == null){
            return null;
        }
        return MvtStkDto.builder()
                .id(mvtStk.getId())
                .dateMvt(mvtStk.getDateMvt())
                .quantite(mvtStk.getQuantite())
                .nom(mvtStk.getNom())
                .typeMvt(mvtStk.getTypeMvt())
                .build();
    }
    public MvtStk toEntity(MvtStkDto mvtStkDto){
        if(mvtStkDto == null){
            return null;
        }
        MvtStk mvtStk = new MvtStk();
        mvtStk.setId(mvtStkDto.getId());
        mvtStk.setDateMvt(mvtStkDto.getDateMvt());
        mvtStk.setQuantite(mvtStkDto.getQuantite());
        mvtStk.setNom(mvtStkDto.getNom());
        mvtStk.setTypeMvt(mvtStkDto.getTypeMvt());
        return mvtStk;
    }



}

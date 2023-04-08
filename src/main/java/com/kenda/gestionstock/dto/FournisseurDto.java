package com.kenda.gestionstock.dto;

import com.kenda.gestionstock.model.*;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Data
@Builder
public class FournisseurDto extends AbstractEntity {


    private Integer id;

    private String nom;


    private String prenom;


    private AdresseDto adresse;


    private String mail;


    private String numTel;


    private List<CommandeFournisseurDto> commandeFournisseurs;

    public FournisseurDto fromEntity(Fournisseur fournisseur){
        if(fournisseur == null){
            return null;
        }
        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .prenom(fournisseur.getPrenom())
                .mail(fournisseur.getMail())
                .numTel(fournisseur.getNumTel())
                .build();
    }
    public Fournisseur toEntity(FournisseurDto fournisseurDto){
        if(fournisseurDto == null){
            return null;
        }
        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setNom(fournisseurDto.getNom());
        fournisseur.setPrenom(fournisseurDto.getPrenom());
        fournisseur.setMail(fournisseurDto.getMail());
        fournisseur.setNumTel(fournisseurDto.getNumTel());
        return fournisseur;
    }

}

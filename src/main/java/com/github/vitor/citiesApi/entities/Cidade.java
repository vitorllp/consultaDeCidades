package com.github.vitor.citiesApi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

@Entity
@Table
public class Cidade {
    @Id
    private Long id;

    @Column(name = "CT_NOME")
    private String name;

    @Column(name = "CT_UF")
    private Integer uf;

    @Column(name = "CT_IBGE")
    private Integer ibge;

    public Cidade() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

}

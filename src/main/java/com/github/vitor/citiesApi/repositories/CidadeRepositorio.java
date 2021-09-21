package com.github.vitor.citiesApi.repositories;

import com.github.vitor.citiesApi.entities.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepositorio extends JpaRepository<Cidade,Long> {
}

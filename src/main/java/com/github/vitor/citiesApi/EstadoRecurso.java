package com.github.vitor.citiesApi;


import com.github.vitor.citiesApi.entities.Estado;
import com.github.vitor.citiesApi.entities.Pais;
import com.github.vitor.citiesApi.repositories.EstadoRepositorio;
import com.github.vitor.citiesApi.repositories.PaisRepositorio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estado")
public class EstadoRecurso {

    private EstadoRepositorio estadoRepositorio;

    public EstadoRecurso(EstadoRepositorio estadoRepositorio) {
        this.estadoRepositorio = estadoRepositorio;
    }

    @GetMapping("/estados")
    public List<Estado> estados(){
        return estadoRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Estado pegarUmEstado(@PathVariable Long id) throws ClassNotFoundException {
        Optional<Estado> optional = estadoRepositorio.findById(id);
        if(optional.isEmpty())
            throw new ClassNotFoundException("Sem dado!");
        return optional.get();
    }
}

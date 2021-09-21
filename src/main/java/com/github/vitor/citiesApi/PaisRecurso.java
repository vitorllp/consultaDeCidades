package com.github.vitor.citiesApi;

import com.github.vitor.citiesApi.entities.Pais;
import com.github.vitor.citiesApi.repositories.PaisRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pais")
public class PaisRecurso {

    private PaisRepositorio paisRepositorio;

    public PaisRecurso(PaisRepositorio paisRepositorio) {
        this.paisRepositorio = paisRepositorio;
    }

    @GetMapping("/paises")
    public List<Pais> paises(){
        return paisRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Pais pegarUmPais(@PathVariable Long id) throws ClassNotFoundException {
        Optional<Pais> optional = paisRepositorio.findById(id);
        if(optional.isEmpty())
            throw new ClassNotFoundException("Sem dado!");
        return optional.get();
    }


}

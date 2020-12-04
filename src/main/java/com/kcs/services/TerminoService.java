package com.kcs.services;

import java.util.List;
import java.util.Optional;
import com.kcs.models.Termino;

public interface TerminoService {

    Optional<Termino> findOne(Integer id);

    List<Termino> findAll();

    void save(Termino termino);
    void update(Termino termino);
    void delete(Termino termino);
    
}

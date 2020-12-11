package com.kcs.repository;

import java.util.List;

import com.kcs.models.Termino;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TerminoRepository extends JpaRepository<Termino,Integer> {

    @Query(value = "SELECT * FROM termino WHERE fr LIKE %?1%", nativeQuery = true)
    List<Termino> findByTerme(String terme);
    
}

package com.alura.literalura.repository;

import com.alura.literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    @Query("SELECT a FROM Autor a WHERE a.fechaDeNacimiento <= :anio AND (a.fechaDeFallecimiento IS NULL OR a.fechaDeFallecimiento >= :anio)")
    List<Autor> buscarAutoresVivosEnDeterminadoAnio(Integer anio);
    
    Autor findByNombreIgnoreCase(String nombre);
}

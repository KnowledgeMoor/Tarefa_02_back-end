package com.example.tarefa_02.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.tarefa_02.domain.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria,Long> {
    
}
package com.example.tarefa_02.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.tarefa_02.domain.Item;

public interface ItemRepository extends CrudRepository<Item,Long> {
    
}

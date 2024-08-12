package com.RuanPablo1.TaskManagerapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RuanPablo1.TaskManagerapp.models.Tarefa;


@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
	
	Tarefa findByTituloContains(String titulo);
}
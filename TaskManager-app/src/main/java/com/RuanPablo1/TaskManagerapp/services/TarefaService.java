package com.RuanPablo1.TaskManagerapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RuanPablo1.TaskManagerapp.models.Tarefa;
import com.RuanPablo1.TaskManagerapp.repositories.TarefaRepository;


@Service
public class TarefaService {

	@Autowired
	TarefaRepository repository;

	public List<Tarefa> findAll() {
		return repository.findAll();
	}

	public Tarefa findById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public Tarefa findByTitulo(String titulo) {
        return repository.findByTituloContains(titulo);
    }
	
	public Tarefa insert(Tarefa tarefa) {
		return repository.save(tarefa);
	}
	
	public Tarefa update(Tarefa tarefa) {
		return repository.save(tarefa);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
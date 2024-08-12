package com.RuanPablo1.TaskManagerapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RuanPablo1.TaskManagerapp.models.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Usuario findByEmail(String email);

}
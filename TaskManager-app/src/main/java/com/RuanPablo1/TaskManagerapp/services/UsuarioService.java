package com.RuanPablo1.TaskManagerapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RuanPablo1.TaskManagerapp.models.Usuario;
import com.RuanPablo1.TaskManagerapp.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Usuario findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Usuario findByEmail(String email) {
        return repository.findByEmail(email);
    }

    public Usuario insert(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario update(Usuario usuario) {
        return repository.save(usuario);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
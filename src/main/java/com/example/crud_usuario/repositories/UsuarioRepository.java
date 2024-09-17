package com.example.crud_usuario.repositories;

import com.example.crud_usuario.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

    Optional<Usuario> findByEmailAndSenha(String email, String senha);
}

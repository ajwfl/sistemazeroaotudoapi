package br.com.vby.primeiroprojeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vby.primeiroprojeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    
    
}

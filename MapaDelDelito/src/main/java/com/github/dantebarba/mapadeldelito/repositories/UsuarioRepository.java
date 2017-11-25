package com.github.dantebarba.mapadeldelito.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.dantebarba.mapadeldelito.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	Usuario findByHashMd5(String hashMd5);

}

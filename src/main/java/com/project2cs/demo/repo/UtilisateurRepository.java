package com.project2cs.demo.repo;

import com.project2cs.demo.model.Utilisateur;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {

    Optional<Utilisateur> findByUserName(String userName);
}
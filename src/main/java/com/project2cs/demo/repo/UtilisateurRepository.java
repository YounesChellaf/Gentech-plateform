package com.project2cs.demo.repo;

import com.project2cs.demo.model.Customer;
import com.project2cs.demo.model.Utilisateur;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {
    Utilisateur findByUserName(String userName);
}
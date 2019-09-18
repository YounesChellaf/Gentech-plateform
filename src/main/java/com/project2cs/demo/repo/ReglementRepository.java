package com.project2cs.demo.repo;

import com.project2cs.demo.model.Reglement;
import com.project2cs.demo.model.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReglementRepository extends CrudRepository<Reglement, Long> {

}

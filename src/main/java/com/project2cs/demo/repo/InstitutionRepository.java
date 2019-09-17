package com.project2cs.demo.repo;

import com.project2cs.demo.model.Institution;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InstitutionRepository extends CrudRepository<Institution, Long> {
    List<Institution> findByName(String name);
}
package com.project2cs.demo.repo;

import com.project2cs.demo.model.Institution;
import org.springframework.data.repository.CrudRepository;

public interface InstitutionRepository extends CrudRepository<Institution, Long> {
}
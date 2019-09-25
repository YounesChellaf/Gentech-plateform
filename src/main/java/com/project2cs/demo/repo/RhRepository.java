package com.project2cs.demo.repo;

import com.project2cs.demo.model.Localisation;
import com.project2cs.demo.model.Rh;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RhRepository extends CrudRepository<Rh, Long> {
    List<Rh> findByInstitutionId(long institution_id);
}
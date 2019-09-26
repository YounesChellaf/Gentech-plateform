package com.project2cs.demo.repo;

import com.project2cs.demo.model.PermisRequest;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PermisRepository extends CrudRepository<PermisRequest, Long> {
    List<PermisRequest> findByResource(String resource);
    List<PermisRequest> findByState(String state);
}
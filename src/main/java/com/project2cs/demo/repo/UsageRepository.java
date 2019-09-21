package com.project2cs.demo.repo;

import com.project2cs.demo.model.PermisRequest;
import com.project2cs.demo.model.Usage;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UsageRepository extends CrudRepository<Usage, Long> {

}
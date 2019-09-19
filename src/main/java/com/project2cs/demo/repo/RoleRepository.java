package com.project2cs.demo.repo;

import com.project2cs.demo.model.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
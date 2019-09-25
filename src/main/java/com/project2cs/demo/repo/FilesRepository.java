package com.project2cs.demo.repo;

import com.project2cs.demo.model.FileModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilesRepository extends JpaRepository<FileModel, Long>{
}
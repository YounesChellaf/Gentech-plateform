package com.project2cs.demo.repo;

import com.project2cs.demo.model.Localisation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocalisationRepository extends JpaRepository<Localisation,Integer>{

	List<Localisation> findByRessourceId(int ressource_id);

}

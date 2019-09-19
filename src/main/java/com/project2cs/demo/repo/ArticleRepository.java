package com.project2cs.demo.repo;

import com.project2cs.demo.model.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    Article findByTitle(String title);
}

package com.djw.search.dao;


import com.djw.search.model.ArticleEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends ElasticsearchRepository<ArticleEntity, Long> {
}

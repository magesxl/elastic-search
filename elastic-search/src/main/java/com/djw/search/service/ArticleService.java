package com.djw.search.service;



import com.djw.search.model.ArticleEntity;

import java.util.List;

public interface ArticleService {

    public boolean saveArticles(List<ArticleEntity> articleEntities);
}

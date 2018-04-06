package com.djw.search.service.impl;


import com.djw.search.dao.ArticleRepository;
import com.djw.search.model.ArticleEntity;
import com.djw.search.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;
    @Override
    public boolean saveArticles(List<ArticleEntity> articleEntities) {
        return false;
    }
}

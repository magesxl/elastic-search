package com.djw.search.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Document(indexName = "elasticsearch", type = "article")
@Data
public class ArticleEntity implements Serializable {
    // 作者信息
    private String      writer;

    // 文章信息
    @Id
    private Long      id;

    private String      title;

    private String      content;

    // 归属信息
    private Long      admin;
}

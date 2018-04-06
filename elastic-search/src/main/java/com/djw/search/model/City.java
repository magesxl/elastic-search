package com.djw.search.model;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * City 属性名不支持驼峰式。indexName 配置必须是全部小写，不然会出异常
 */
@Document(indexName = "province",type = "cityname")
public class City implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 城市编号
     */
    private Long id;

    private String province;

    /**
     * 城市名称
     */
    private String cityname;

    /**
     * 描述
     */
    private String description;

    /**
     * 城市评分
     */
    private Integer score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}

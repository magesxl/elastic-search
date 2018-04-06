package com.djw.search.controller;


import com.djw.search.model.City;
import com.djw.search.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    /**
     * 插入 ES 新城市
     *
     * @param city
     * @return
     */
    @RequestMapping(value = "/api/city", method = RequestMethod.POST)
    public Long createCity(@RequestBody City city) {
        String a="1";
        return cityService.saveCity(city);
    }

    /**
     * 搜索返回分页结果
     *
     * @param pageNumber 当前页码
     * @param pageSize 每页大小
     * @param searchContent 搜索内容
     * @return
     */
    @RequestMapping(value = "/api/city/search", method = RequestMethod.GET)
    public List<City> searchCity(@RequestParam(value = "pageNumber") Integer pageNumber,
                                 @RequestParam(value = "pageSize", required = false) Integer pageSize,
                                 @RequestParam(value = "searchContent") String searchContent) {
        return cityService.searchCity(pageNumber, pageSize,searchContent);
    }


    @RequestMapping(value = "/api/city/find", method = RequestMethod.GET)
    public City searchCity(@RequestParam(value = "id") Long id) {
        return cityService.findById(id);
    }
}

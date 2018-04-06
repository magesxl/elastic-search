package com.djw.search;

import com.alibaba.fastjson.JSON;
import com.djw.search.model.City;
import com.djw.search.service.CityService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.awt.Symbol;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElasticSearchApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private CityService cityService;

	@Test
	public void save(){
		City city = new City();
		city.setId(3L);
		city.setCityname("南京");
		city.setProvince("江苏");
		city.setDescription("nihao");
		cityService.saveCity(city);
	}

	@Test
	public void findById(){
		long id = 1L;
		City city = cityService.findById(id);
		System.out.println(JSON.toJSONString(city));
		Assert.assertNotNull(city);
		Assert.assertEquals(Optional.ofNullable(id),Optional.ofNullable(city.getId()));
	}

	@Test
	public void findByPage(){
		List<City> city = cityService.searchCity( null,null,"温岭");
		System.out.println(JSON.toJSONString(city));
	}
}

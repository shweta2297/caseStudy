package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Car;
@Controller
@Repository
public class CarRepository {

	
	@Autowired
	private JdbcTemplate template;
	
	public int addCar(Car entity) {
		SimpleJdbcInsert insert=new SimpleJdbcInsert(template);
		insert.withTableName("cardetails").usingColumns("carmodelname","year","kilometer","status");
		
		BeanPropertySqlParameterSource sql= new BeanPropertySqlParameterSource(entity);
		
		
		return insert.execute(sql);
		
	}
	
	public List<Car> getAllCars(){
		String sql= "select * from cardetails";
		
    List<Car> carList= template.query(sql,BeanPropertyRowMapper.newInstance(Car.class));
		return  carList ;
			
	}
}

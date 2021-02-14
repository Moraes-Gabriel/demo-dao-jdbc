	package model.dao;

import java.text.ParseException;
import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	
	void insert(Seller obj) throws ParseException;
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
	
	
}

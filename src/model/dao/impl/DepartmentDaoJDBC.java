package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao {

	private Connection conn;
	
	public DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Department obj) {
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(
					"INSERT INTO department "
					+ "(Id,Name) "
					+ "VALUES "
					+ "(?, ?)");
			
		
			st.setInt(1, obj.getId());
			st.setString(2, obj.getName());
			
			st.executeUpdate(); 
				
			
		} catch (Exception e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
		}
		
	}

	@Override
	public void update(Department obj) {
		
		PreparedStatement st = null;
		try {
			
			st = conn.prepareStatement(
					
					"UPDATE department "
					+"SET Id = ?, Name = ? "
					+"WHERE Id = ?");


		} catch (Exception e) {
			
		}
	}

	@Override
	public void deleteById(Integer id) {
		PreparedStatement st = null;
		try {
			
			st = conn.prepareStatement(
					
					"DELETE FROM department " 
					+"WHERE "
					+"Id = ?");
					
			st.setInt(1, id);
			st.executeUpdate();
			
		} catch (Exception e) {
			
		}
		
	}

	@Override
	public Department findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

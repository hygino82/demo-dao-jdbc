package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Statement;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao{
	
	private Connection conn;//cria conexão entre java e sql 
	
	
	public DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Department obj) {//insere departamento nome e identificação
		PreparedStatement st = null;//envia comandos ao mysql
		
		try {
				st = conn.prepareStatement("INSERT INTO department (Id, Name) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
				st.setInt(1, obj.getId());
				st.setString(2, obj.getName());
				
				int rowsAffected = st.executeUpdate();
				
				if (rowsAffected > 0) {
					ResultSet rs = st.getGeneratedKeys();
					if (rs.next()) {
						int id = rs.getInt(1);
						obj.setId(id);
					}
					DB.closeResultSet(rs);
				}
				else {
					throw new DbException("Unexpectd error! No rows affected");
				}
			
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
		
	}

	@Override
	public void update(Department obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
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

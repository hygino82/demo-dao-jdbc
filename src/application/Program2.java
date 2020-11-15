package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmenDao();
		/*
		System.out.println("-----------------------------------------------");
		System.out.println("Primeiro teste".toUpperCase());
		Department newDepartment = new Department(45, "Logistica");
		System.out.println(newDepartment);
		departmentDao.insert(newDepartment);
		
		System.out.println("Inserted New Department Id = " + newDepartment.getId());
		System.out.println("Deparment Created");
		*/
		
		//System.out.println("-----------------------------------------------");
		//System.out.println("Segundo teste".toUpperCase());
		//Department department = new Department();
		/*department = departmentDao.findById(6);
		System.out.println(department);
		department.setName("Delivery");
		department.setId(46);
		departmentDao.update(department);
		System.out.println("Update completed");*/
		/*
		System.out.println("-----------------------------------------------");
		System.out.println("Terceiro teste".toUpperCase());
		System.out.print("Enter id for delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");*/
		List <Department> list = new ArrayList<>();
		System.out.println("-----------------------------------------------");
		System.out.println("Quarto teste".toUpperCase());
		list = departmentDao.findAll();
		
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("Find all finished");
		sc.close();

	}

}

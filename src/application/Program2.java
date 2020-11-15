package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmenDao();
		
		System.out.println("-----------------------------------------------");
		System.out.println("Primeiro teste".toUpperCase());
		Department newDepartment = new Department(45, "Logistica");
		System.out.println(newDepartment);
		departmentDao.insert(newDepartment);
		
		System.out.println("Inserted New Department Id = " + newDepartment.getId());
		System.out.println("Deparment Created");
		
		sc.close();

	}

}

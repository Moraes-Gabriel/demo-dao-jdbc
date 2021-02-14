package Application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

public class Programa2 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
	/*	System.out.println("== Teste 1: Inserte ====");
		
		Department department = new Department(6, "gabriel");
		
		departmentDao.insert(department);
		System.out.println("Complete insert");*/

		System.out.println("== Teste 2: DELETE BY ID ====");
		
		System.out.println("Digite um id para ser deletado");
		int id = ler.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Complete delet");
		
		
	}

}

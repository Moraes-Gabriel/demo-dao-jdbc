package Application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		SellerDao sellerDao =  DaoFactory.createSellerDao();
	
		System.out.println("==TESTE 1: SELLER FindbyId	====");
		Seller seller = sellerDao.findById(4);
		System.out.println(seller);
		
		System.out.println("== Teste 2: Seller FindByDepartment ====");
		Department department = new Department(2, null);
			List<Seller> list = sellerDao.findByDepartment(department);
		
			for(Seller obj : list) {
				System.out.println(obj);
		}
				
				
	}

}

package Application;

import java.text.ParseException;
import java.util.Date;
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
		System.out.println("");
		
		/*System.out.println("== Teste 2: Seller FindByDepartment ====");
		Department department = new Department(2, null);
			List<Seller> list = sellerDao.findByDepartment(department);
		
			for(Seller obj : list) {
				System.out.println(obj);
		}
			System.out.println();
			System.out.println("== Teste 3: Seller FindAll ====");
			
			list = sellerDao.findAll();
			
				for(Seller obj : list) {
					System.out.println(obj);
			}
				
				/*System.out.println("== Teste 4: Inserte ====");
				Seller newSeller = new Seller(null, "Joao", "Joao@gmail.com", new Date(), 8000.0, new Department(4, null));
				try {
					sellerDao.insert(newSeller);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Inserted! New id = " + newSeller.getId());*/
				
				System.out.println("== Teste 5: Update ====");
				seller = sellerDao.findById(1);
				seller.setName("Martha wayne");
				sellerDao.update(seller);
				
				System.out.println("Update complete");
				
				System.out.println("== Teste 6: DELETE BY ID ====");
				
				System.out.println("Digite um id para ser deletado");
				int id = ler.nextInt();
				sellerDao.deleteById(id);
				System.out.println("Complete delet");
				
				ler.close();
				
	}

}

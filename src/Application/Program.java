package Application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		SellerDao sellerDao =  DaoFactory.createSellerDao();
	
		System.out.println("Digite o id que deseja procurar");
		int a = ler.nextInt();
		
		Seller seller = sellerDao.findById(a);
				
				System.out.println(seller);
				
				
	}

}

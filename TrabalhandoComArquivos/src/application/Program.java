package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		Product p1 = new Product("TV LED", 1290.99, 1);
		Product p2 = new Product("Iphone X", 900.0, 2);
		Product p3 = new Product("Samsung Galaxy", 9850.00, 2);
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		//String path = "D:\\workspace\\ws-eclipse\\java_exercises\\TrabalhandoComArquivos\\files";
		
		
		/*
		String path = "D:\\workspace\\ws-eclipse\\java_exercises\\TrabalhandoComArquivos\\files";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}*/
		
		sc.close();
				

	}

}

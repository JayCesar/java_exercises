package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		// D:\\workspace\\ws-eclipse\\java_exercises\\TrabalhandoComArquivos\\files_ex\\input.csv
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter file path:");
		String sourceFileStr = sc.nextLine();  // Esse é o str que irá guardar o caminho inserido;
		
		File sourceFile = new File(sourceFileStr);
		// Ele irá encapsular todo o processo de acessar os arquivo e trabalhar com os arquivos!
		
		// Para pegar o a pasta de origem: 
		String sourceFolderStr = sourceFile.getParent(); // Ou seja, eu obtenho o caminho do arquivo IGNORANDO o nome dele.
		System.out.println(sourceFolderStr);
		
		// Para criar uma pasta:
		// A operação indica um boolean indicando se conseguiu criar ou não esse diretório / pasta:
		boolean success = new File(sourceFolderStr + "\\out").mkdir(); // Make a directory
		
		String targetFileStr = sourceFolderStr + "\\out\\summery.csv"; // Criei o arquivo! Repare que ele só adicionou duas barras '\\' + o nome do arquivo;
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){ // Ele vai tentar ler o sourceFileStr e se lê, ele entra no Try
			
			String itemCsv = br.readLine();
			while (itemCsv != null) { // Enquanto não estiver no final do arquivo
				
				//  ideia a gora é instanciar o produto!
				String[]fields = itemCsv.split(","); // Eu quebrei em campos
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name,price,quantity));
				
				itemCsv = br.readLine();
			}
			
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){ // Eu vou escrever no arquivo 'ALVO'
				
				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f",item.total()));
					bw.newLine();
				}
				
				System.out.println(targetFileStr + "CREATED");
				
			}catch(IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
			
			
		} catch(IOException e) {
			System.out.println("Error writing file:: " + e.getMessage());
		}
		
		
		
		// O Filereader permite uma leitura de caracteres
		// BufferedReader é insntanciado a partir de um FileReader e é masi rápido
		// Normalmente, um buffer armazena os dados na memória RAM devido ao tempo de acesso rápido
		
		sc.close();
				

	}

}

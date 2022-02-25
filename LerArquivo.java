package curso.LeituraGravArq;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		
		/*Objeto para entrada de dados*/
		FileInputStream estradaArquivo = 
				new FileInputStream(new File("E:\\JDevTreinamentos\\OrientetacaoObjetos\\src\\curso\\LeituraGravArq\\aquivo.txt"));
		
		Scanner lerArquivo = new Scanner(estradaArquivo, "UTF-8");
		
		/*Faz a leitura de arquivos*/
		while(lerArquivo.hasNext()) 
			{
				String linha = lerArquivo.nextLine();
				if(linha != null && !linha.isEmpty())
					{
					System.err.println(linha);
					}
				
			}
		
	}
}

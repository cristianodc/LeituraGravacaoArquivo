package curso.LeituraGravArq;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoObjetoMercado {

	public static void main(String[] args) throws FileNotFoundException {
		/*Objeto para entrada de dados*/
		FileInputStream estradaArquivo = 
				new FileInputStream(new File("E:\\JDevTreinamentos\\OrientetacaoObjetos\\src\\curso\\LeituraGravArq\\compras.csv"));
		
		Scanner lerArquivo = new Scanner(estradaArquivo, "UTF-8");
		List<Pessoa> lista = new ArrayList<Pessoa>();
		/*Faz a leitura de arquivos*/
		while(lerArquivo.hasNext()) 
			{
				String linha = lerArquivo.nextLine();
				
				if(linha != null && !linha.isEmpty())
					{
					   /*cria um array de caracteres com delimitador*/
						String[] dados = linha.split("\\,");
						
						Pessoa p = new Pessoa();
						p.setNome(dados[0]);
						p.setEmail(dados[1]);
						//p.setIdade(Integer.parseInt(dados[2]));
						lista.add(p);
					}
				
			}
		
		for(Pessoa p: lista)
			{
				
				//System.out.println(p.getNome()+" ; "+p.getEmail()+" ; "+p.getIdade()+" \n");
			   System.out.println(p);
			
			}

	}

}

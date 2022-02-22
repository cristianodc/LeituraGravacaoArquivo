package curso.LeituraGravArq;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {

	public static void main(String[] args) throws IOException {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("cristiano");
		p1.setEmail("Cristianocoffi@gmail.com");
		p1.setIdade(42);
		Pessoa p2 = new Pessoa();
		
		p2.setNome("Dornelles ");
		p2.setEmail("dornelles@gmail.com");
		p2.setIdade(25);
		
		Pessoa p3 = new Pessoa();
		
		p3.setNome("coffy");
		p3.setEmail("coffy@gmail.com");
		p3.setIdade(30);
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		/*Arquivo com o seu caminho path*/
		File arquivo = new File("E:\\JDevTreinamentos\\OrientetacaoObjetos\\src\\curso\\LeituraGravArq\\aquivo.csv");
		
		if(!arquivo.exists())
			{
				arquivo.createNewFile();
			}
		/*Objeto que escrevo no arquivo*/
		FileWriter escrever = new FileWriter(arquivo,true);
		/*escrever.write("Escrevendo no arquivo 1 linha \n");
		escrever.write("Escrevendo no arquivo 2 linha\n");
		escrever.append("Escrevendo no arquivo 3 linha");*/
		
		/*for(int i=0; i <10; i++) 
			{
			escrever.write("Escrevendo no arquivo  linha"+ i +" \n");
			}*/
		
		for(Pessoa p: lista)
			{
				escrever.write(p.getNome()+";"+p.getEmail()+";"+p.getIdade()+"\n");
			}
		/*Para persistir os dados*/
		escrever.flush();
		escrever.close();
		
	}

}

package curso.LeituraGravArq;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePOI {

	public static void main(String[] args) throws IOException {

		/*Aqui falamos sobre pessoas
		 * testando */

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
		
        Pessoa p4= new Pessoa();
		
		p4.setNome("Beltrano");
		p4.setEmail("beltrano@hotmail.com");
		p4.setIdade(30);
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		
		File arquivo = new File("E:\\JDevTreinamentos\\OrientetacaoObjetos\\src\\curso\\LeituraGravArq\\aquivo_excel.xls");
		if(!arquivo.exists())
		{
			arquivo.createNewFile();
		}
		HSSFWorkbook hssWorkbook  = new HSSFWorkbook();/*Objeto que é usado para escrever a planilha*/
		
		HSSFSheet linhas_pessoas = hssWorkbook.createSheet("Planilha do Jdev Treinamento");
		
		int numeroLinhas=0;
		
		for(Pessoa p: lista)
		{
			
			Row linha = linhas_pessoas.createRow(numeroLinhas ++); /*cria a linha na tabela*/
			int celulaa=0;
			
			Cell celNome = linha.createCell(celulaa ++);/*celula 1*/
			celNome.setCellValue(p.getNome());
			
			Cell celEmail = linha.createCell(celulaa ++);
			celEmail.setCellValue(p.getEmail());
			
			Cell celIdade = linha.createCell(celulaa ++);/*celula 3*/
			celIdade.setCellValue(p.getIdade());
			
		}/*Terminou de montar a planilha*/
		
		/*Vamos escrever no arquivo */
		
		FileOutputStream saida = new FileOutputStream(arquivo);
		
		hssWorkbook.write(saida);/*Hora da escrita no arquivo*/
		saida.flush();
		saida.close();

	}

}

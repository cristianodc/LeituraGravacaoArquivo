package curso.LeituraGravArq;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePOILeitura {

	public static void main(String[] args) throws IOException {
		
		FileInputStream entrada =
				 new FileInputStream(new File("E:\\JDevTreinamentos\\OrientetacaoObjetos\\src\\curso\\LeituraGravArq\\aquivo_excel.xls"));
		
		HSSFWorkbook hssworKbook = new HSSFWorkbook(entrada);/*Prepara a entrada do arquivo excel*/
		HSSFSheet planilha = hssworKbook.getSheetAt(0);/*Pega a primiera planilha*/
		
		Iterator<Row> linhaIte = planilha.iterator();
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		while(linhaIte.hasNext())
		{
			Row linha  = linhaIte.next();
			
			Iterator<Cell> celulas = linha.iterator();
			
			Pessoa p  = new Pessoa();
			
			while(celulas.hasNext())
			{
				Cell cell = celulas.next();
			  
				switch (cell.getColumnIndex()) {
				case 0:
					p.setNome(cell.getStringCellValue());
					break;
                case 1:
					p.setEmail(cell.getStringCellValue());
					break;
                case 2:
					p.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
				default:
					break;
				}
			}/*fecha linha*/
			
			lista.add(p);
		}
		
		entrada.close();
		
		for(Pessoa p: lista) 
		{
			System.err.println(p);
		}
		
	}

}

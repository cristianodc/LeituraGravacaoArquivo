package curso.LeituraGravArq;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePOIEditando {

	public static void main(String[] args) throws Exception {
		
		File arquivo = new File("E:\\JDevTreinamentos\\OrientetacaoObjetos\\src\\curso\\LeituraGravArq\\aquivo_excel.xls");
		
		if(!arquivo.exists())
		{
			arquivo.createNewFile();
		}
		
		FileInputStream entrada = new FileInputStream(arquivo);
		
		HSSFWorkbook hssworkbood = new HSSFWorkbook(entrada);
		
		HSSFSheet planilha= hssworkbood.getSheetAt(0);
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		while(linhaIterator.hasNext())
		{
			Row linha = linhaIterator.next();
			
			int nroCelulas  = linha.getPhysicalNumberOfCells();
			
			Cell cell = linha.createCell(nroCelulas);
			
			cell.setCellValue("5.500,25");
		}
		
		entrada.close();
		
		FileOutputStream saida = new FileOutputStream(arquivo);
		hssworkbood.write(saida);
		saida.flush();
		saida.close();
		

	}

}

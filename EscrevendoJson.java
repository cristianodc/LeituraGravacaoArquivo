package curso.LeituraGravArq;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscrevendoJson {

	public static void main(String[] args) throws IOException {
		
		Usuario uso01 = new Usuario();
		
		uso01.setLogin("cris");
		uso01.setSenha("1234");
		uso01.setCpf("96683899053");
		uso01.setNome("Beltrano");
		
       Usuario uso02= new Usuario();
		uso02.setLogin("Coffy");
		uso02.setSenha("4321");
		uso02.setCpf("96683899053");
		uso02.setNome("Fulano");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(uso01);
		usuarios.add(uso02);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String JsonUser = gson.toJson(usuarios);
		
		FileWriter fileWriter = new FileWriter("E:\\JDevTreinamentos\\OrientetacaoObjetos\\src\\curso\\LeituraGravArq\\JsonUser.json");
		
		fileWriter.write(JsonUser);
		fileWriter.flush();
		fileWriter.close();
		System.out.println(JsonUser);
	}
}

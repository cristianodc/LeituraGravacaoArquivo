package curso.LeituraGravArq;

public class Pessoa {

	private String nome;
	private String email;
	private int idade;
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return " [" + nome + ", email=" + email + ", idade=" + idade + "]";
	}
	
	
}

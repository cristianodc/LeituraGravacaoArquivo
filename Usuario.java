package curso.LeituraGravArq;

import java.io.Serializable;

public class Usuario implements Serializable {

	/**
<<<<<<< HEAD
	 * 
=======
	 * Usuarios
>>>>>>> fd537b2893f16bde2c96bb9facb8b530fae34455
	 */
	private static final long serialVersionUID = 1L;
	private String login;
	private String senha;
	private String cpf;
	private String nome;
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
<<<<<<< HEAD

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + ", cpf=" + cpf + ", nome=" + nome + "]";
	}
=======
>>>>>>> fd537b2893f16bde2c96bb9facb8b530fae34455
	
	
}

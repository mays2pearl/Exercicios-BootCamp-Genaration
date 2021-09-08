
public class Paciente {
	
	private String nome;
	private int idade;
	private int prontuario;
	
	public Paciente(String nome, int idade, int prontuario) {
		
		this.setNome(nome);
		this.setIdade(idade);
		this.setProntuario(prontuario);
		
	

}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getProntuario() {
		return prontuario;
	}

	public void setProntuario(int prontuario) {
		this.prontuario = prontuario;
	}
	
public void imprimir () {
		
		System.out.println("\nO paciente "+nome+" tem "+idade+" anos, prontuario é "+prontuario);
		
		
	}
	
	
}
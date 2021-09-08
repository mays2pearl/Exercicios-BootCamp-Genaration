
public class Funcionario {
	
	private String nome;
	private String cargo;
	private int tempoDeEmpresa;
	
	public Funcionario(String nome, String cargo, int tempoDeEmpresa) {
		
		this.setNome(nome);
		this.setCargo(cargo);
		this.setTempoDeEmpresa(tempoDeEmpresa);
		
	

}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getTempoDeEmpresa() {
		return tempoDeEmpresa;
	}

	public void setTempoDeEmpresa(int tempoDeEmpresa) {
		this.tempoDeEmpresa = tempoDeEmpresa;
	}
	
	
public void imprimir () {
		
		System.out.println("\nO funcionario "+nome+" é "+cargo+" e esta na empresa há "+tempoDeEmpresa);
		
		
	}
	
	
	}

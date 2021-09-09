
public class Preguica extends Animal{

	private String acao;
	
public Preguica(String nome, int idade, String som,String acao) {
		
		super(nome,idade,som);
		this.acao = acao;
		
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	public void imprimirInfo() {
		
		System.out.println("\nO animal é: "+getNome()+"\nIdade: "+getIdade()+"\nEmite o som: "+getSom()+"\nE ela: "+acao);
		
	}
	
}

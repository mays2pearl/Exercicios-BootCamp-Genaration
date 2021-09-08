import java.text.NumberFormat;

public class Cliente {
	
	private String nome;
	private double conta;
	private int comanda;
	
	public Cliente(String nome, double conta, int comanda) {
		
		this.setNome(nome);
		this.setConta(conta);
		this.setComanda(comanda);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getConta() {
		return conta;
	}

	public void setConta(double conta) {
		this.conta = conta;
	}

	public int getComanda() {
		return comanda;
	}

	public void setComanda(int comanda) {
		this.comanda = comanda;
	}
	
	public String formatarConta () {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //metodo que converte o numero para moeda local
		nf.setMinimumFractionDigits(2); //metodo para casas decimais desejadas, quantidade de digitos depois da virgula
		String formatoConta = nf.format(conta);//formata o numero para informação financeira, ou saida monetaria
		return formatoConta;
	}
	
	public void imprimir () {
		
		System.out.println("\n"+nome+"\t\t"+"comanda: "+comanda+" conta: "+this.formatarConta());
		
		
	}
	
}

public class ContaBancaria {

	private String cliente;
	private String tipoConta;
	private int tempoDeConta;
	private String banco;
	
	public ContaBancaria(String cliente, String tipoConta, int tempoDeConta,String banco) {
		
		this.setCliente(cliente);
		this.setTipoConta(tipoConta);
		this.setTempoDeConta(tempoDeConta);
		this.setBanco(banco);
		
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public int getTempoDeConta() {
		return tempoDeConta;
	}

	public void setTempoDeConta(int tempoDeConta) {
		this.tempoDeConta = tempoDeConta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	public void imprimir () {
		
		System.out.println("\nO cliente "+cliente+" tem a conta de tipo "+tipoConta+" a "+tempoDeConta+" anos no banco "+banco);
		
		
	}
	
	
}

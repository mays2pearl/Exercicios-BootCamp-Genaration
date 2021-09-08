import java.text.NumberFormat;

public class produtoEletronico {

	
	private String produto;
	private String marca;
	private double preco;
	
	public produtoEletronico(String produto,String marca,double preco) {
		
		this.setProduto(produto);
		this.setMarca(marca);
		this.setPreco(preco);	
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String formatarPreco () {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //metodo que converte o numero para moeda local
		nf.setMinimumFractionDigits(2); //metodo para casas decimais desejadas, quantidade de digitos depois da virgula
		String formatoPreco = nf.format(preco);//formata o numero para informação financeira, ou saida monetaria
		return formatoPreco;
	}
	
	public void imprimir () {
		
		System.out.println("\nEste é um "+produto+" da marca "+marca+" e custa "+this.formatarPreco());
		
		
	
}
}
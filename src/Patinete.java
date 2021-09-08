
public class Patinete {
	
	private String tipo;
	private String marca;
	private String cor;
	
	public Patinete(String tipo, String marca, String cor) {
		
		this.setTipo(tipo);
		this.setMarca(marca);
		this.setCor(cor);
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
public void imprimir () {
		
		System.out.println("\n… um patinete "+tipo+" de marca "+marca+" e cor "+cor);
		
		
	}

}

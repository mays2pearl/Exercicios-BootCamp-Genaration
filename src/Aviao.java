
public class Aviao {
	
	private String tipo;
	private String porte;
	private int ano;
	
	public Aviao(String tipo,String porte,int ano) {
		
		this.setTipo(tipo);
		this.setPorte(porte);
		this.setAno(ano);	
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void imprimir () {
		
		System.out.println("\n… um avi„o do tipo "+tipo+" de porte "+porte+" fabricado no ano de "+ano);
		
		
	}
	
}

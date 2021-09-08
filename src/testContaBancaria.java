
public class testContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria[] lista = new ContaBancaria[5];
		
		lista [0] = new ContaBancaria("Maysa Andrade", "corrente", 12,"itau personalite");
		lista [1] = new ContaBancaria("Leandro Sousa", "corrente", 05,"itau");
		lista [2] = new ContaBancaria("Maria","poupança", 03,"caixa");
		lista [3] = new ContaBancaria("Aline","juridica", 07,"santander");
		lista [4] = new ContaBancaria("Elson","juridica", 02,"banco do Brasil");
		
		for (ContaBancaria roda:lista) {
			
			roda.imprimir();
	
		}

	}

}

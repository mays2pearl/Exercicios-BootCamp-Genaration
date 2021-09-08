
public class testCliente {

	public static void main(String[] args) {
		
		Cliente[] lista = new Cliente[5];
		
		lista [0] = new Cliente("Maysa Andrade", 550, 12);
		lista [1] = new Cliente("Leandro Sousa", 3500, 05);
		lista [2] = new Cliente("Maria e João",750, 03);
		lista [3] = new Cliente("Aline",1900, 07);
		lista [4] = new Cliente("Elson",55, 02);
		
		for (Cliente roda:lista) {
			
			roda.imprimir();
	
		}

	}

}

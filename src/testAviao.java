
public class testAviao {

	public static void main(String[] args) {
		
		Aviao[] lista = new Aviao[3];
		
		lista [0] = new Aviao("Helicoptero", "Pequeno", 2009);
		lista [1] = new Aviao("Boing", "Grande", 2005);
		lista [2] = new Aviao("Jato","Medio", 2012);
		
		
		for (Aviao roda:lista) {
			
			roda.imprimir();
	
		}

	}

}

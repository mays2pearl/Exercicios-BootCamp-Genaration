
public class testPatinete {

	public static void main(String[] args) {
		
Patinete[] lista = new Patinete[3];
		
		lista [0] = new Patinete("Eletrico", "honda", "preto");
		lista [1] = new Patinete("Manual", "sony","vermelho");
		lista [2] = new Patinete("Eletrico","microsoft", "rosa");
		
		for (Patinete roda:lista) {
			
			roda.imprimir();
	
		}

	}

}


public class testPaciente {

	public static void main(String[] args) {
		

		Paciente[] lista = new Paciente[5];
		
		lista [0] = new Paciente("Maysa Andrade", 30, 1200);
		lista [1] = new Paciente("Leandro Sousa", 31, 1567);
		lista [2] = new Paciente("Maria",65, 3121);
		lista [3] = new Paciente("Aline",45,2343);
		lista [4] = new Paciente("Elson",59, 2009);
		
		for (Paciente roda:lista) {
			
			roda.imprimir();
	
		}

	}

}

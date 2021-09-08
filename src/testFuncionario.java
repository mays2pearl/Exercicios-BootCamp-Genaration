
public class testFuncionario {

	public static void main(String[] args) {
		
		Funcionario[] lista = new Funcionario[5];
		
		lista [0] = new Funcionario("Maysa Andrade", "desenvolvedora senior", 12);
		lista [1] = new Funcionario("Leandro Sousa", "porteiro", 05);
		lista [2] = new Funcionario("Maria","ajudante geral", 03);
		lista [3] = new Funcionario("Aline","dsigner", 07);
		lista [4] = new Funcionario("Elson","diretor", 02);
		
		for (Funcionario roda:lista) {
			
			roda.imprimir();
	
		}

	}

}



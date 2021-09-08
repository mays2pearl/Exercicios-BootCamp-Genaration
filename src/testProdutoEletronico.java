
public class testProdutoEletronico {

	public static void main(String[] args) {
		
		produtoEletronico[] lista = new produtoEletronico[5];
		
		lista [0] = new produtoEletronico("Celular", "Apple", 6550);
		lista [1] = new produtoEletronico("Headset","Sony", 390);
		lista [2] = new produtoEletronico("Televisor","Samsung",4590);
		lista [3] = new produtoEletronico("VideoGame","Microsoft Xbox",4890);
		lista [4] = new produtoEletronico("Notebook","Dell",3950);
		
		for (produtoEletronico roda:lista) {
			
			roda.imprimir();
	
		}

	}

}

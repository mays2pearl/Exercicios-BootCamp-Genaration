//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

		

package exerciciosDia03_09;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		int linha=3, coluna=3, soma =0; 
		int numeros[][]= new int [linha][coluna];
		
		int contMais10 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		for(linha=0;linha<3;linha++) {
			
		
			for(coluna=0;coluna<3;coluna++) {
				
				System.out.println("\nDigite um numero: ");
				numeros[linha][coluna] = leia.nextInt();
				
				if(numeros[linha][coluna] > 10 ) {
					
					soma++;
					

	}

}
		}	
			System.out.println("\nNumeros maiores que 10: "+soma);
	
}
}

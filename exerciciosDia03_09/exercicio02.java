/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados*/


package exerciciosDia03_09;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		int num[] = new int [6];
		int par[] = new int [6];
		int impar[] = new int [6];
		
		int x,somaPares=0,quantImpares = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		for(x=0;x<6;x++) {
			
			System.out.println("\nDigite um numero: ");
			num[x] = leia.nextInt();
		
			
			if(num[x]% 2 == 0) {
				
				
				
				somaPares += num[x] ;
				
				
			
			}else {
				
				
				
				quantImpares++;
				
				
			}
			}
		
		System.out.println("\nOs n�meros pares digitados s�o: "+par+" e  A soma dos n�meros pares digitados � " +somaPares);
		System.out.println("\nOs n�meros impares digitados s�o: "+impar+" e  A quantidade foi: "+quantImpares);
	}

}

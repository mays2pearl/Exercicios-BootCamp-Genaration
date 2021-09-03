/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados*/


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
		
		System.out.println("\nOs números pares digitados são: "+par+" e  A soma dos números pares digitados é " +somaPares);
		System.out.println("\nOs números impares digitados são: "+impar+" e  A quantidade foi: "+quantImpares);
	}

}

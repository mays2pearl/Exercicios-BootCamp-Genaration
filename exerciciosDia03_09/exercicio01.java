/*1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/



package exerciciosDia03_09;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		
		int A[] = new int [6];
		int soma=0,x;
		
		Scanner leia = new Scanner(System.in);
		
		
		for(x=0;x<6;x++) {
			
			System.out.println("\nDigite um numero: ");
			A[x] = leia.nextInt();
			
			soma = A[0] + A[1] +A[5];
			
			A[4]= 100;
				/*if(x==-5) {
					
					A[x]=100;
				}*/

	}
		System.out.println("\nA soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e : "+soma);
		System.out.println("\nOs vetores s�o: "+A[0]);
		System.out.println("\nOs vetores s�o: "+A[1]);
		System.out.println("\nOs vetores s�o: "+A[2]);
		System.out.println("\nOs vetores s�o: "+A[3]);
		System.out.println("\nOs vetores s�o: "+A[4]);
		System.out.println("\nOs vetores s�o: "+A[5]);
		
		
		
		
		
}
}

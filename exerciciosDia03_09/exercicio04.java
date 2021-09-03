/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.*/



package exerciciosDia03_09;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		
		float matriz1[][] = new float [2][2];
		float matriz2[][] = new float [2][2];
		float matriz3[][] = new float [2][2];
		float constante;
		int l,c,op;
		
		Scanner leia = new Scanner (System.in);
		
		for(l=0;l<2;l++) {
			for (c=0;c<2;c++) {
				
				System.out.println("\nDigite os valores da matiz 1: ");
				matriz1[l][c] = leia.nextFloat();
				System.out.println("\nDigite os valores da matiz 2: ");
				matriz2[l][c] = leia.nextFloat();
			}
		}
		
		System.out.println("\nMenu de opções: ");
		System.out.println("\n(1) para somar as duas matrizes: ");
		System.out.println("\n(2) para subtrair a primeira matriz da segunda matriz: ");
		System.out.println("\n(3) para adicionar uma constante as duas matrizes: ");
		System.out.println("\n(4) para imprimir as  matrizes: ");
		System.out.println("\nDigite a sua opção: ");
		
		op = leia.nextInt();
		
		switch(op) {
		
		case 1:
			for (l=0;l<2;l++) {
				for (c=0;c<2;c++) {
					
					matriz3[l][c] = matriz1[l][c] + matriz2[l][c];
					System.out.println("\nA soma é: "+matriz3[l][c]);
					
				}
			}break;
			
		case 2:
			for (l=0;l<2;l++) {
				for (c=0;c<2;c++) {
					
					matriz3[l][c] = matriz2[l][c] - matriz1[l][c];
					System.out.println("\nA subtração é: "+matriz3[l][c]);
					
				}
			}break;
		case 3:
			System.out.println("\nDigite uma constante: ");
			constante = leia.nextFloat();
			for (l=0;l<2;l++) {
				for (c=0;c<2;c++) {
					
					matriz1[l][c] = matriz1[l][c] + constante;
					matriz2[l][c] = matriz2[l][c] + constante;
					
					
				}
			}break;
			
		case 4:
			for (l=0;l<2;l++) {
				for (c=0;c<2;c++) {
					System.out.println("\nA matriz 1 é: "+matriz1[l][c]);
					System.out.println("\nA matriz 2 é: "+matriz2[l][c]);
					
				}

		
		
			}
		
		}
	}
}


package exerciciosDia03_09;

import java.util.Scanner;

public class exerciciosDia03_09 {
	
	public static void main(String[] args) {
		
		float medias[]= new float [4];
		float somaMedia = 0,mediaGeral;
		
		Scanner ler = new Scanner(System.in);
		
		
		for(int x=0;x<4;x++) {
			
			System.out.println("\nDigite sua media: ");
			medias[x] = ler.nextFloat();
			
			somaMedia += medias[x];
			
			
		}
		
		mediaGeral = somaMedia /4;
		
		System.out.printf("\nMedia geral: %2.2f",mediaGeral);
		
	}

}

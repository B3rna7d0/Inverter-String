package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a string para inverter: ");
		String original = sc.nextLine();
		
		char[] caracteres = original.toCharArray();
		
		int inicio = 0;
		int fim = caracteres.length - 1;
		
		while(inicio < fim) {
			char temp = caracteres[inicio];
			caracteres[inicio] = caracteres[fim];
			caracteres[fim] = temp;
			
			inicio++;
			fim--;
		}
		String invertida = new String(caracteres);
		
		System.out.println("String invertida: " + invertida);
		
		sc.close();

	}

}

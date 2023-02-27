package view;

import controller.FatorialRecursividade;

public class Principal {

	public static void main(String[] args) {
		
		FatorialRecursividade fr = new FatorialRecursividade();
		int n = 5;
		int fatorial = fr.fatorial(n);
		System.out.println(fatorial);
	}

}

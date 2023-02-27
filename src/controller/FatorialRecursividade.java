package controller;

public class FatorialRecursividade {

	public FatorialRecursividade() {
		super();
	}

	public int fatorial(int n) {
		//A condição de parada é quando n é igual a 1.
		if(n == 1) {
			return 1;
		} else {
			//O valor do termo n é igual ao produto entre n e termo n-1
			return n*fatorial(n -1);
		}
		
	}
}

package controller;

public class FatorialRecursividade {

	public FatorialRecursividade() {
		super();
	}

	public int fatorial(int n) {
		//A condi��o de parada � quando n � igual a 1.
		if(n == 1) {
			return 1;
		} else {
			//O valor do termo n � igual ao produto entre n e termo n-1
			return n*fatorial(n -1);
		}
		
	}
}

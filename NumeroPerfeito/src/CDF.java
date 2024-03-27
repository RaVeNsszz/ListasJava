
public class CDF {
	public boolean ePerfeito(int n) {	
		int soma = 0;
		for ( int div = 1; div < n;div++) {
			if (n % div == 0) {
				soma+= div;			
			}
		}
		if (soma == n) {
			return true;
		}			
		return false;
	}
}

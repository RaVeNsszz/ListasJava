
public class MaiorValor {
	
	public static int valores(int i,int j,int k,int l,int m) {
		if(MaiorValor.valores(i,j,k,l)>m) {
			return MaiorValor.valores(i, j, k, l);
		}
		return m;
	}
	public static int valores(int i,int j,int k,int l) {
		if(MaiorValor.valores(i,j,k)>l) {
			return MaiorValor.valores(i, j, k);
		}
		return l;
	}
	public static int valores(int i,int j,int k) {
		if (MaiorValor.valores(i,j)>k) {
			return MaiorValor.valores(i, j);
		}
		return k;
	}
	public static int valores(int i,int j) {	
		if (i>j) {
			return i;
		}
		return j;
	}
	

}

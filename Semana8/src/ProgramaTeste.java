import java.util.Scanner;
public class ProgramaTeste {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		int num = Integer.parseInt(input.nextLine());
		int num2 = Integer.parseInt(input.nextLine());
		//System.out.println(MaiorValor.valores(num, num2));
		int num3 = Integer.parseInt(input.nextLine());
		//System.out.println(MaiorValor.valores(num, num2, num3));
		int num4 = Integer.parseInt(input.nextLine());
		//System.out.println(MaiorValor.valores(num, num2, num3, num4));
		int num5 = Integer.parseInt(input.nextLine());
		System.out.println(MaiorValor.valores(num, num2, num3, num4, num5));
		input.close();
	}

}

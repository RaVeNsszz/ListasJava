public class Nutricionista {
	public  ResultadoIMC resultadoIMC (Pasciente p) {
		
		float imc = p.getPeso()/(float)Math.pow(p.getAltura(),2);
				
		if (imc < 18.5 ) {
			return ResultadoIMC.BAIXOPESO;
			
		}else if((imc > 18.5  )&& (imc <=24.99)){			
			return ResultadoIMC.NORMAL;
			
		}else if ((imc > 24.99)&&(imc <= 29.99)){
			return ResultadoIMC.SOBREPESO;
		}
		return ResultadoIMC.OBESIDADE; 
				
	}
}

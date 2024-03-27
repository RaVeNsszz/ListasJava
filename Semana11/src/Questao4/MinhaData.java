package Questao4;

import java.time.DateTimeException;

public class MinhaData implements ClasseComparavel{
	
	private int dia;
	private int mes;
	private int ano;
	
	public MinhaData(int dia, int mes, int ano) throws DateTimeException {
        // Se passar uma data inválida, lança um DateTimeException
        LocalDate testeData = LocalDate.of(dia, mes, ano);
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
	
	
	
	
//	public int comparacao(Object objeto) {
//		
//	    // Downcasting para poder acessar os parâmetros
//        MinhaData dataParametro = (MinhaData) objeto;
//
//        //LocalDate primeiraData = LocalDate.of(this.dia, this.mes, this.ano);
//        //LocalDate segundaData = LocalDate.of(dataParametro.getDia(), dataParametro.getMes(), dataParametro.getAno());
//        
//        if(this.dia > dataParametro.getDia()|| this.mes > dataParametro.getMes()|| this.getAno()>dataParametro.getAno()) {
//        	return 1;
//        } else if (this.dia > dataParametro.getDia()|| this.mes > dataParametro.getMes()|| this.getAno()>dataParametro.getAno()) {
//        	return -1;
//        }
//
//        //int diferenca = primeiraData.compareTo(segundaData)
//        
//        
//        
//        // Aí só faltaria comparar se o valor é negativo ou positivo, para retornar -1 ou 1
//
////	    if (diferenca == -1) {
////	    	
////	    }else if(diferenca == 1) {
////	    	
////	    }
//	    return 0;
//    }
		
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}




	@Override
	public int comparacao(Object objeto) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

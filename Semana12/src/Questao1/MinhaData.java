package Questao1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Date;

public class MinhaData {
	private int dia;
	private int mes;
	private int ano;

	
	public MinhaData(int novoDia,int novoMes, int novoAno) throws Exception{
		String dataString = novoDia + "/" + novoMes + "/" + novoAno;
		
		if(!isDateValid(dataString)){
				throw new Exception();
		}
	}
		
		
//		try {
//			isDateValid(dataString);
//		}catch(Exception e) {
//			new Exception("Data Inválida");
//		}
	public int comparacao(Object objeto) {
		MinhaData minhaData = (MinhaData) objeto;

		if (ano < minhaData.getAno()) {
			return 1;
		} else if (ano > minhaData.getAno()) {
			return -1;
		} else {
			if (mes < minhaData.getMes()) {
				return 1;
			}else if (mes > minhaData.getMes()) {
				return -1;
			}else {
				if (dia < minhaData.getDia()  ) {
					return 1;
				} else if ( dia >minhaData.getDia()) {
					return -1;
				}else {
					return 0;
				}
			}
		}
	}
	
	public static boolean isDateValid(String strDate) {
	    String dateFormat = "dd/MM/uuuu";

	    DateTimeFormatter dateTimeFormatter = DateTimeFormatter
	    .ofPattern(dateFormat)
	    .withResolverStyle(ResolverStyle.STRICT);
	    try {
	        LocalDate date = LocalDate.parse(strDate, dateTimeFormatter);
	        return true;
	    } catch (DateTimeParseException e) {
	       return false;
	    } 
	}
	
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
	
	

}

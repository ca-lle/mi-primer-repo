package fechas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

//Texto de ejemplo

public class E01 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	LocalDate hoy = LocalDate.now();
	DayOfWeek dia = hoy.getDayOfWeek();
	System.out.println(hoy +" "+ dia);
	
	
	
	}
	
}
//1. Muestra el día, mes y año actual, incluido el día de la semana.

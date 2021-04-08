package boletin2;

import java.util.ArrayList;
import java.util.Scanner;

public class Fecha {
	
	static Scanner sc = new Scanner(System.in);
	
	
	/**
	 * Transforma una fecha en el formato 19 de Abril 2020
	 * @return fecha en formato indicado
	 */
	public static  String fechaFormatoLargo() {
		int year=0;
		int mes=0;
		int dia=0;
		String[] mesLetra= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre"};

		
		while (year==0){
			
			try {
				year=pedirYear();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				}
		}
		
		
		
		while (mes==0){
		try {
			mes=pedirMes();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}}
		
		
		
		while (dia==0){
		try {
			dia=pedirDia(mes, year);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}}

		
		
		
		return "La fecha en formato largo es "+ dia + " de "+ mesLetra[mes-1]+" del " +year;
	}
	
	
	/**
	 * Este método pide el día por teclado y gestiona las excepciones que pueden salir
	 * @param mes
	 * @param year
	 * @return
	 * @throws Exception
	 */
	public static int pedirDia(int mes, int year) throws Exception {
		int dia=0;
		System.out.println("Introduce Día");
		dia=Integer.parseInt(sc.nextLine());
		
		if((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia<1 || dia>31)) {
			
				throw new Exception("El día tiene que estar entre 1 y 31");			
		}else if((mes==4 || mes==6 || mes==9 || mes==11) && (dia<1 || dia>30)) {
				
				throw new Exception("El día tiene que estar entre 1 y 30");		
			
		}else if((mes==2) && comprobarBisiesto(year)&&(dia<1 || dia>29)) {
			
			
			throw new Exception("El día tiene que estar entre 1 y 29");		
		
		}else if((mes==2) && !comprobarBisiesto(year)&&(dia<1 || dia>28)) {
			
			throw new Exception("El día tiene que estar entre 1 y 28");	
		}else {
			
			
		} return dia;
	}
	
	/**
	 * Este método pide el día por teclado y gestiona las excepciones que pueden salir
	 * @return
	 * @throws Exception
	 */
	public static int pedirMes() throws Exception {
		int mes=0;
		
		
		System.out.println("Introduce Mes");
		mes=Integer.parseInt(sc.nextLine());
		
		if(mes<1 || mes>12) {
			throw new Exception("Introduce un mes del 1 al 12");
		}
		
		return mes;
	}
	
	
	public static int pedirYear() throws Exception {
		int year=0;
		
		System.out.println("Introduce Año");
		
		year=Integer.parseInt(sc.nextLine());
		
		if(year<0 || year>2021) {
			
			throw new Exception("Has introducido un año demasiado antiguo o demasiado moderno!!");
		}			
		return year;
	}
	
	/**
	 * Comprueba si el año es bisiest y devuelve True o False
	 * @param year
	 * @return true\\False
	 */
	public static boolean comprobarBisiesto(int year) {
				
		return ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)));
	}
	
}

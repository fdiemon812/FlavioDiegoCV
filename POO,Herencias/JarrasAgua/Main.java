package ej3Jarra;

import java.util.Scanner;

public class Main {

	
	public static void mostrarMenu() {
		System.out.println("\n 1. Llenar Jarra \n 2.Vaciar jarra \n 3.Volcar A en B \n 4.Volcar B en A \n 5.Ver estado de las jarras \n 6.Salir \n");
	}
	
	public static void  mostrarEleccionJarra() {
		System.out.println("\n ¿Qué Jarra? A=1,B=2 \n" );}
	
	
	
	
	
	public static void main(String[] args) throws Exception{

		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Introduce la capacidad de la jarra A");
		Jarra A = new Jarra(Integer.parseInt(sc.nextLine()));
		

		System.out.println("Introduce la capacidad de la jarra B");
		Jarra B=new Jarra(Integer.parseInt(sc.nextLine()));
		
		
	
		int option=0;
		while (option!=6) { 
			mostrarMenu();
		try {
			option=Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("El valor debe ser un número del 1 al 6");
		}
		
		switch (option) {
		case 1:
			int  option2=0;
			while (option2!=2 && option2!=1) {
				System.out.println("Escoge la opción correcta");
				mostrarEleccionJarra();
				
				
				try {
					option2=Integer.parseInt(sc.nextLine());
				} catch (Exception e2) {

					System.out.println("Debes introducir un numero entero: 1 o 2");
				
				}
				
			}
			
							try {
				
			
				if (option2==1) {
					A.llenarJarra();
					System.out.println("Jarra A llenada con éxito");
				} else {
					B.llenarJarra();
					System.out.println("Jarra B llenada con éxito");
					
				}
								} catch (Exception e) {
									System.out.println(e.getMessage());								}
				
			break;
					
		case 2:
			
			option2=0;
			while (option2!=2 && option2!=1) {
				mostrarEleccionJarra();
				
				try {
					option2=Integer.parseInt(sc.nextLine());
				} catch (Exception e2) {

					System.out.println("Debes introducir un numero entero: 1 o 2");
				
				}
				
			}
				if (option2==1) {
					A.vaciarJarra();
					System.out.println("Jarra A ha sido vaciada con éxito");
				} else {
					B.vaciarJarra();
					System.out.println("Jarra B ha sido vaciada con éxito");

				}
			
			
			break;	
		case 3:
			
			A.volcarEnJarra(B);
			
			System.out.println("Volcado de A en B");
			
			break;
			
		case 4:
			
			B.volcarEnJarra(A);
			System.out.println("Volcado de B en A");

			
			
			break;
			
		case 5:
			System.out.println("La jarra A tiene una capacidad de "+A.getCapacidad()+" y un estado de "+A.getEstado());

			System.out.println("La jarra B tiene una capacidad de "+B.getCapacidad()+" y un estado de "+B.getEstado());
			break;
			
		case 6:
			System.out.println("Hasta luego!!");
			System.out.println("El agua total gastada es "+A.getAguaTotal());
			option=6;
			break;
			
		}
		

		
			
			 
			 
		}
	}
	}



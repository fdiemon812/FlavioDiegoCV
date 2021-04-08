package boletin2;

import java.util.ArrayList;

import boletin1.Matriz;

public class CuentaLetras {

	
	/*
	 * Programa que solicite una frase e informe de cuantas veces
	 * aparecen   cada   una   de   las   letras   del   abecedario   en   la   frase  
	 *  (sólo   semostrarán las letras que aparezcan al menos una vez).
	 *  */
	
	
	
	
	/**
	 * Metodo que calcula cuantas letras de cada tiene el texto y las devuelve en forma de array
	 * @param frase
	 * @return
	 */
	final static String[] ABECEDARIO= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z",""};

	public static int[] contaLetras(String frase) {
		int[] contadorLetras=new int[ABECEDARIO.length-1];
		
		
		
		
		
		for (int i=0;i<frase.length();i++) {
			int pasaLetra=0;
			String letra=String.valueOf(frase.charAt(i)).toLowerCase();
			
			if(Character.isLetter(frase.charAt(i))) {
				
			
				while (pasaLetra<ABECEDARIO.length-1){ //-1 para que no de fallo de salida de rango, incluimos una ultima letra vacía
					
					if(letra.equals(ABECEDARIO[pasaLetra])) {
						contadorLetras[pasaLetra]++;
					}
						
					pasaLetra++;
					
				}
			}
		}
		
		return contadorLetras;
		
	}
	
	/**
	 * Nos da en formato bonito, cuantas letras de cada tipo hay en el texto
	 * @return
	 */
	
	
	public static String darFormato(int[] contador ) {
		StringBuilder result = new StringBuilder("");
		for(int i=0;i<contador.length;i++) {
			
			if (contador[i]>0) {
				
				result.append(ABECEDARIO[i] + "-"+contador[i]+"\n");
				
			}
			
		}
		
		return result.toString();
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(darFormato(contaLetras(" Hola amigos Z ")));
		

	}

}

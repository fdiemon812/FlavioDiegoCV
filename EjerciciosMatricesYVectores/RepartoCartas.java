package boletin2;

import java.util.ArrayList;
import java.util.Scanner;

public class RepartoCartas {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	static ArrayList<String> baraja =  new ArrayList();
	static ArrayList<String> jugador1 = new ArrayList<String>();
	static ArrayList<String> jugador2 = new ArrayList<String>();
	
	
	/**
	 * Crea una baraja Española nueva, con todos sus numeros y palos. 
	 * 
	 */
	public static void crearBaraja() {
		
		jugador1.clear();
		jugador2.clear();
		
		for(int i=1;i<49 ;i++) {
			String carta="";

			if(i<13) {
				carta= i + " de Oro ";
			}else if(i>10 && i<25) {
				carta= (i-12 )+ " de Espadas ";
			}else if(i>23 && i<37) {
				carta= (i-24 ) + " de Bastos ";
			}else if(i>34 && i<49) {
				carta= (i-36 ) + " de Copas ";
			}
			
			baraja.add(carta);
		}
		
		
	}
	
	/**
	 * Reparte cartas al jugador1 y las saca de la baraja
	 * @param cartasARepartir
	 * @return devuelve las cartas que debe recibir el jugador
	 */
	public static ArrayList<String> repartirJugador1(int cartasARepartir) {
		int i=0;
		 ArrayList<String> jugador = new ArrayList<String>();
		
		while(i!=cartasARepartir) {
			i++;
			int j=(int) (Math.random()*(baraja.size()));
			//System.out.println(baraja.get(j));
			jugador.add(baraja.get(j));
			baraja.remove(j);
		}
		
		return jugador;
	}
	
	
	public static void main(String[] args) {
		
		 ArrayList<String> jugador1 = new ArrayList<String>();
		 ArrayList<String> jugador2 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantas cartas quieres repartir??");
		int numCartas=Integer.parseInt(sc.nextLine());
		
		crearBaraja();
		jugador1=repartirJugador1(numCartas);
		jugador2=repartirJugador1(numCartas);
		
		
		System.out.println("Cartas del jugador 1:");
		System.out.println(jugador1);
		

		System.out.println("Cartas del jugador 2:");
		System.out.println(jugador2);
		
		System.out.println("\nQUE EMPIECE EL JUEGO!!");
		
	}

}

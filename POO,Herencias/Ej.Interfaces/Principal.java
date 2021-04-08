package ejemploInterfaces;

public class Principal {

	
	
	
	public static void main(String[] args) {

		
		
	IEdificio casa = new Casa(10,10,10);	
	System.out.println(casa.calculaSuperficie());
	System.out.println(casa.calculaPrecio());
	
	System.out.println(((Casa)casa).getHabitantes());
	
	
	Tienda mediamarkt = new Tienda(1000000,50, "Electronica");
	ILocalComercial media = new Tienda(100,50000, "Elecasdasdtronica");
	IEdificio media2 = new Tienda(1,5, " a");
	
	
	
		
	}

}

package ejemploInterfaces;

public class Tienda implements ILocalComercial {

	
	private double largo;
	private double ancho;
	private String actividad;
	
	
	
	public Tienda() {
		
	}
	
	public Tienda(double largo, double ancho, String actividad) {
		
		this.actividad=actividad;
		this.ancho=ancho;
		this.actividad=actividad;
		
	}
	
	@Override
	public double calculaSuperficie() {
		return 0;
	}

	@Override
	public double calculaPrecio() {
		return calculaSuperficie()*PRECIOCOMERCIAL;
	}

	@Override
	public String actividadComercial() {
		return actividad;
	}

}

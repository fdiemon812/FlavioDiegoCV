package ejemploInterfaces;

public class Casa implements IEdificio {

	private double largo;
	private double ancho;
	private int plantas;
	private int habitantes;
	
	
	public Casa() {
		
	}
	
	public Casa(double largo, double ancho, int plantas) {
		
		super();
		this.plantas=plantas;
		this.largo=largo;
		this.ancho=ancho;
	}
	
	public Casa(double largo, double ancho, int plantas, int habitantes) {
		
		this.habitantes=habitantes;
		this.plantas=plantas;
		this.largo=largo;
		this.ancho=ancho;
	}
	
	
	@Override
	public double calculaSuperficie() {
		return plantas*largo*ancho;
	}

	@Override
	public double calculaPrecio() {
		return calculaSuperficie()*PRECIO;
	}

	public int getHabitantes() {
		return habitantes;
	}

}

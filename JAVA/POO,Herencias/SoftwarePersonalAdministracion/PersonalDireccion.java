package examenFlaviodeDiegoMontes;

public class PersonalDireccion extends Profesor {

	
	// ubicación en el centro y competencias
	
	private String ubicacion;
	private String centro;
	private String competencias;
	
	
	
	public PersonalDireccion() {
		
	}
	
	public PersonalDireccion(String nombre, int edad, String genero, String horario, String password, String departamento, String curso, String modulo, String ubicacion, String centro, String competencias) throws PassIncorrectaException, CompetenciasIncorrectasException {
		
		super(nombre, edad, genero, horario, password, departamento, curso, modulo);
		this.ubicacion=ubicacion;
		this.centro=centro;
		
		//Vamos a filtrar que las competencias solo pueden ser de estos tres valores. 
		if(competencias.equals("SEC")||competencias.equals("JEF")||competencias.equals("DIR")) {

			this.competencias=competencias;	
		}else {
			throw new CompetenciasIncorrectasException();
		}
		
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public String getCentro() {
		return centro;
	}

	public String getCompetencias() {
		return competencias;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	public void setCompetencias(String competencias) throws CompetenciasIncorrectasException {
		if(competencias.equals("SEC")||competencias.equals("JEF")||competencias.equals("DIR")) {

			this.competencias=competencias;	
		}else {
			throw new CompetenciasIncorrectasException();
		}
	}

	@Override
	public String toString() {
		
		return super.toString()+" , "+ubicacion+" , "+centro+" , "+competencias;
	}
	
	
	
	
	
	
}

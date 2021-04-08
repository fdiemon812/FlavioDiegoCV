package examenFlaviodeDiegoMontes;

public class PersonalAdministracion extends Empleado{

	//su ubicación en el centro, teléfono y área de responsabilidad 
	
	private String ubicacion;
	private int telefono;
	private String area;
	
	public PersonalAdministracion() {
		
	}
	
	
public PersonalAdministracion(String nombre, int edad, String genero, String horario,  String password, String ubicacion, int telefono, String area ) throws PassIncorrectaException, AreaIncorrectaException{
	
	super(nombre, edad, genero, horario,password);
	this.ubicacion=ubicacion;
	this.telefono=telefono;
	
	
	if(area.equals("ALUMNADO")||area.equals("PROFESORADO")) {

		this.area=area;	
	}else {
		throw new AreaIncorrectaException();
	}
	}


public String getUbicacion() {
	return ubicacion;
}


public int getTelefono() {
	return telefono;
}


public String getArea() {
	return area;
}


public void setUbicacion(String ubicacion) {
	this.ubicacion = ubicacion;
}


public void setTelefono(int telefono) {
	this.telefono = telefono;
}


public void setArea(String area) throws AreaIncorrectaException {
	if(area.equals("ALUMNADO")||area.equals("PROFESORADO")) {

		this.area=area;	
	}else {
		throw new AreaIncorrectaException();
	}
}


@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString() +" , "+ ubicacion +" , "+ telefono +" , "+ area;
}
	


	
	
}

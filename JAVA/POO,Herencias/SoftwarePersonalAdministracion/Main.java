package examenFlaviodeDiegoMontes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//LOS OBJETOS TIENEN QUE CUMPLIR LOS REQUISITOS DE RESTRICCION, O SALTARA LA EXCEPCION CORRESPONDIENTE. 3 EJEMPLOS DONDE NO LOS CUMPLE CON CADA OBJETO
		/*
		try {	
			Empleado paco = new Empleado("paco", 23, "hombre", "mañana", "olaasdasdasdAA13"); //PASS INCORRECTA
		} catch (PassIncorrectaException e) {
			
			System.out.println(e.getMessage());
		}
	
		
		try {
			Profesor paquito=new Profesor("paco", 23, "hombre", "mañana", "oasdasdasdasdlaAA12", "lengua", "primero", "B"); //PASS INCORRECTA
		} catch (PassIncorrectaException e) {
			
			System.out.println(e.getMessage());
		}
		
	
		
		try {
			PersonalDireccion juan=new PersonalDireccion("paco", 23, "hombre", "mañana", "oasdasdasdasdlaAA123", "lengua", "primero", "B", "Sevilla", "Jacarandá", "SE");//COMPETENCIAS INCORRECTAS
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
		
		
		try {
			PersonalAdministracion paquita=new PersonalAdministracion("paco", 23, "hombre", "mañana", "oasdasdasdasdlaAA123", "Jacaranda",954414986,"ALUMN");//AREA INCORRECTA
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
		*/
		
		
		//VAMOS A CREARLOS BIEN PARA PROBAR LOS toString()
		
		
		
		try {	
			Empleado paco2 = new Empleado("paco", 23, "hombre", "mañana", "olaasdasdasdAA123"); 
			System.out.println(paco2);
		} catch (PassIncorrectaException e) {
			
			System.out.println(e.getMessage());
		}

	
		try {
			Profesor paquito2=new Profesor("paco", 23, "hombre", "mañana", "oasdasdasdasdlaAA122", "lengua", "primero", "B");
			System.out.println(paquito2);
		} catch (PassIncorrectaException e) {
			
			System.out.println(e.getMessage());
		}
		
	
		
		try {
			PersonalDireccion juan2=new PersonalDireccion("paco", 23, "hombre", "mañana", "oasdasdasdasdlaAA123", "lengua", "primero", "B", "Sevilla", "Jacarandá", "SEC");
			System.out.println(juan2);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	
	
	try {
		PersonalAdministracion paquita2=new PersonalAdministracion("paco", 23, "hombre", "mañana", "oasdasdasdasdlaAA123", "Jacaranda",954414986,"ALUMNADO");//AREA INCORRECTA
		System.out.println(paquita2);
		
		//paquita2.setPassword("1234444444");
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
	}
	
	
	PersonalAdministracion paquita3 = null;
	try {
		paquita3=new PersonalAdministracion("paco", 23, "hombre", "mañana", "oasdasdasdasdlaAA123", "Jacaranda",954414986,"ALUMNADO");//AREA INCORRECTA
		System.out.println(paquita3);
		
		paquita3.setPassword("1234444444"); //Los sets funcionan igual que el constructor probamos...
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
	}
	
	
	System.out.println(paquita3);
	
	
	
}}
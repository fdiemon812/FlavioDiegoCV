package examenFlaviodeDiegoMontes;

public class PassIncorrectaException extends Exception {

	
	public PassIncorrectaException() {
	

		super("ERROR - Recuerda que la contraseña debe tener más de 10 caracteres, siendo dos de ellos\n" + 
				"mayúsculas y tres, numéricos.");
		
	}	
}

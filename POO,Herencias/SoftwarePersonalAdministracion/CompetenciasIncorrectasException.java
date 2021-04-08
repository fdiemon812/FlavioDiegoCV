package examenFlaviodeDiegoMontes;

public class CompetenciasIncorrectasException extends Exception {

	
	
	public CompetenciasIncorrectasException() {
		super("ERROR- Las competencias solo pueden ser SEC , JEF, DIR");
	}
}

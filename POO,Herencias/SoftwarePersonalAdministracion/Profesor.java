package examenFlaviodeDiegoMontes;

public class Profesor extends Empleado{

	
	private String departamento;
	private String curso;
	private String modulo;
	
	
	
	public Profesor() {
		
	}
	
	
	public Profesor(String nombre, int edad, String genero, String horario,  String password, String departamento, String curso, String modulo) throws PassIncorrectaException {
		super(nombre, edad, genero, horario, password);
		this.departamento=departamento;
		this.curso=curso;
		this.modulo=modulo;
	}


	public String getDepartamento() {
		return departamento;
	}


	public String getCurso() {
		return curso;
	}


	public String getModulo() {
		return modulo;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +" , "+ departamento +" , "+ curso +" , "+ modulo;
	}
	
	
	
}

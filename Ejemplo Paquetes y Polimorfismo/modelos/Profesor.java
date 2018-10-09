package modelos;

public class Profesor{
	protected String nombre;

	public Profesor(String nombre){
		this.nombre=nombre;
	}
	public void imprimeProfesor(){
		System.out.println("El profesor es: "+nombre);
	}

	public void imprimeProfesor(String materia){
		System.out.println("El profesor es: "+nombre+" y enseña "+materia);
	}

	public void imprimeProfesor(String materia, String division){
		
	}
}
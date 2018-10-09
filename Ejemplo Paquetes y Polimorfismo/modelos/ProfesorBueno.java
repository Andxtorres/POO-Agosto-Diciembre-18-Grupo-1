package modelos;

public class ProfesorBueno extends Profesor{
	public ProfesorBueno(String nombre){
		super(nombre);
	}
	public void imprimeProfesor(){
		System.out.println("El profesor bueno es: "+nombre);
	}	
	public void imprimeProfesor(String materia){
		System.out.println("El profesor bueno es: "+nombre+" y enseña "+materia);
	}	

	public void imprimeProfesor(String materia, String division){
		System.out.println("El profesor bueno es: "+nombre+" y enseña "+materia+" en "+division);

	}
}
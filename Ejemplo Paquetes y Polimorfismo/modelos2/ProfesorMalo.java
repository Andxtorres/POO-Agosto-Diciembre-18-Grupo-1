package modelos2;
import modelos.Profesor;

public class ProfesorMalo extends Profesor{

	public ProfesorMalo(String nombre){
		super(nombre);
	}
	public void imprimeProfesor(){
		System.out.println("El profesor malo es: "+nombre);
	}

	public void imprimeProfesor(String materia, String division){
		System.out.println("El profesor malo es: "+nombre+" y enseña "+materia+" en "+division);

	}	
}
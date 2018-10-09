import modelos.Profesor;
import modelos.ProfesorBueno;
import modelos2.ProfesorMalo;

public class Main{
	public static void main(String args[]){
		Profesor[] profesores= new Profesor[2];
		ProfesorBueno p= new ProfesorBueno("Yoel Ledo");
		ProfesorMalo pM= new ProfesorMalo("Andres Torres");
		profesores[0]=p;
		profesores[1]=pM;
		for(int i=0; i< profesores.length;i++){
			profesores[i].imprimeProfesor("Computacion","DIA");
		}

	}
}
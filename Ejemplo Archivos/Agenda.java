import java.io.Serializable;

public class Agenda implements Serializable{
	public Contacto[] contactos= new Contacto[100];


	public void addContacto(int index, Contacto c){
		contactos[index]=c;
	}
}
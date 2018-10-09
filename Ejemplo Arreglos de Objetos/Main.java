public class Main{
	public static void main(String args[]){
		Contacto c1= new Contacto("Andres","5541302205");
		Direccion d1= new Direccion("Privada Agustin Gutierrez","100");
		c1.addDireccion(1,d1);
		Agenda.addContacto(20,c1);
		Contacto c2= new Contacto("Jorge","2291629106");
		Direccion d2= new Direccion("Puerta Negra","100");
		c2.addDireccion(0,d2);
		Agenda.addContacto(0,c2);
		Agenda.imprimeAgenda();
	}
}
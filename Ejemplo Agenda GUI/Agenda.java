public class Agenda{
	public static Contacto[] contactos= new Contacto[100];

	public static void addContacto(int index, Contacto c){
		contactos[index]=c;
	}

	public static void imprimeAgenda(){
		for(int i=0;i<contactos.length;i++){
			if(contactos[i]!=null){
				System.out.println(i+".- "+contactos[i].imprimeContacto());

			}else{
				System.out.println(i+".- Vacío");

			}
		}
	}

}
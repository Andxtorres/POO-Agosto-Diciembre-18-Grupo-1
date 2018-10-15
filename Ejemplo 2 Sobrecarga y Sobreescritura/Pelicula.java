public abstract class Pelicula implements Audiovisual{
	public String nombre;
	public String genero;


	public void proyectar(String cine){
		System.out.println("Se esta proyectando la película "+nombre+" del género "+genero+" en el cine "+cine);

	}
	
}
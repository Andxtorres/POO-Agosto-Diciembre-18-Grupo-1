import java.io.*;

public class Direccion implements Serializable{
	public String calle;
	public int numero;

	public Direccion(String calle, int numero){
		this.calle= calle;
		this.numero=numero;
	}
}
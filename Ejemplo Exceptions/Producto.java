public class Producto{
	public double precio;
	public Producto(double precio) throws PrecioNegativoException{
		if(precio<0){
			throw new PrecioNegativoException();
		}
		this.precio=precio;
	}
}


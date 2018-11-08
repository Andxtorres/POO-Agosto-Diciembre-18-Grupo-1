public class PrecioNegativoException extends Exception{
	public PrecioNegativoException(){
		super("No puede haber precios negativos");
	}
}
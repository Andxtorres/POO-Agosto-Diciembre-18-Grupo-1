public class Main{
	public static void main(String args[]){
		
		System.out.println("Antes");
		try{
			Producto producto = new Producto(-100);
			System.out.println("El precio es: "+ producto.precio);

		}catch(PrecioNegativoException e){
			e.printStackTrace();
		}
		System.out.println("Después");
		
		/*
		System.out.println("Antes");
		try{
			System.out.println("El resultado es:" +(10/0));

		}catch(ArithmeticException e){
			System.out.println("Ocurrió una excepción");
		}
		System.out.println("Después");	
		*/	
	}

}
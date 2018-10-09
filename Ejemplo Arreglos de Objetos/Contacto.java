public class Contacto{
	public String nombre;
	public String telefono;
	public Direccion[] direcciones;

	public Contacto(String nombre,String telefono){
		direcciones= new Direccion[3];
		this.nombre= nombre;
		this.telefono= telefono;
	}

	public void addDireccion(int index, Direccion d){
		direcciones[index]=d;
	}

	public String imprimeContacto(){
		String resultado=nombre+ " "+telefono;
		for(int i=0;i<direcciones.length;i++){
			if(direcciones[i]!=null){
				resultado=resultado+"\n";
				resultado= resultado+"["+direcciones[i].calle+" "+direcciones[i].numero+"]";
			}else{
				resultado=resultado+"\n";
				resultado= resultado+"["+"Sin dirección"+"]";
			}
		}
		return resultado;
	}
}
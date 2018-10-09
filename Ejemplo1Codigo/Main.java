import javax.swing.*;

public class Main{
	public static void main(String args[]){
		Persona p= new Persona();
		JOptionPane jp= new JOptionPane();
		String nombreInput= jp.showInputDialog("Ingresa tu nombre:");
		int edadInput= Integer.parseInt(jp.showInputDialog("Ingresa la edad")); 
		p.setNombre(nombreInput);
		p.setEdad(edadInput);
		System.out.println("Hola "+p.getNombre()+" tiene "+p.getEdad()+" años");
	}
}
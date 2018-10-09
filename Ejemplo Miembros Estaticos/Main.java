import javax.swing.JOptionPane;

public class Main{

	public static void main(String args[]){

		int respuesta=0;

		do{
			respuesta= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la conversión que quieres hacer \n"
				+"1.- Peso a dólar \n"
				+"2.- Dólar a peso \n"
				+"0.- Salir"
			));

			switch(respuesta){
				case 1: 
					double pesos= Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad en pesos"));
					JOptionPane.showMessageDialog(null, "El resultado es: "+Calculadora.convertirPesoADolar(pesos)+ " dólares");
				break;
			}
			System.out.println("El número de operaciones realizadas es: "+Calculadora.operacionesRealizadas);
			Calculadora c1= new Calculadora();
			System.out.println("El número de operaciones realizadas desde el objeto es: "+c1.operacionesRealizadas);
		
		}while(respuesta!=0);

		System.exit(0);
		/*
		double numero1= Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero 1"));
		double numero2= Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero 2"));
		JOptionPane.showMessageDialog(null, "El resultado es: "+Calculadora.sumar(numero1,numero2));
		*/	
	}
}
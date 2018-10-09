public class Calculadora{

	public static int operacionesRealizadas;

	public static double sumar(double x, double y){
		operacionesRealizadas++;
		return x+y;
	}

	public static double convertirPesoADolar(double pesos){
		operacionesRealizadas++;
		double resultado= (pesos/18.50)*100;
		int resultadoParcial= (int)resultado;
		resultado= resultadoParcial/100.0;
		return resultado;
	}

}
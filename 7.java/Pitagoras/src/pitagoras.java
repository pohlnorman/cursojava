
public class pitagoras {
	public double hipotenusa(double a, double b) {
		
		double Acuadrado = a * a;
		double Bcuadrado = b * b;
		double Ccuadrado = Acuadrado + Bcuadrado;
		double c= Math.sqrt(Ccuadrado);
		
		return c;
	}
	
	
}

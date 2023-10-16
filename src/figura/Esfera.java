package figura;

//Clase concreta que implementa metodos de una interfaz llamada Calculable
public class Esfera implements Calculable {
	
	//Atributos
	double radio;
	final double PI = 3.14d;
	
	Esfera() {}
	
	//Constructor
	Esfera(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
	double area = 4*PI * radio*radio;
		return area;
		
	}

	@Override
	public double calcularVolumen() {
		return 0d;
		//Volumen V = 4/3 π r³
	}

	@Override
	public double calcularPerimetro() {
		return 0d;
		//Perimetro 2 * π * r
	}
	
	
	
	

}//Cierre Esfera

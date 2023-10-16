package figura;

public class TestFiguras {

	public static void main(String[] args) {
		
		
		//Generar las instancias de nuestras clases
		
		//1. Instancia de la clase Fifura
		//Figura generica = new Figura();
		
		//2. Instancia de un rectangulo
		Figura rectangulo = new Rectangulo(5.0, 6.5);
		
		//3. Instancia de un circulo
		Figura circulo = new Circulo(3.14, 3.0);
		
		//Invocacion del metodo
		System.out.println(rectangulo.calcularArea());
		System.out.println(circulo.calcularArea());
		
		Esfera esfera = new Esfera();
		Esfera esfera2 = new Esfera(3);
		System.out.println(esfera.radio);
		System.out.println(esfera2.radio);
		System.out.println(esfera2.calcularArea());
		
		
		
		

	}//Cierre main

}//Cierre TestFiguras

//Vamos a usae clases abstractas para evitar la instanciacion de objetos que no necesito (generalmente son objetos muy abstractos, como Persona, Figura, TRansporte, Animal, Coida, Arte, Operaciones Matemacicas, Lecturas, Ropa, Lecturas, Ropa, Plantas, Paises, etc.).


package figura;


//Utilizando clases abstractas, evitamos las instancias no necesarias.
//Para que una clase se vuelva abstracta, usamos la palabra reservada abstracta antes de la class
public  abstract class Figura {
 
	//Declaramos un metodo abstracto (no tiene cuerpo)
	//Un metodo abstracto qué nos dice? QUE TENEMOS QUE HACER, pero NO NOS DICE EL COMO
	public abstract double calcularArea();
	
	
	
}//clase figura




/*
 * Clase Figura
 * NOTA: Las clases abtractas pierden la capacidad de instanciar. 
 * Una clase abstracta necesita si o si metodos abstractos.
 * Cuando usamos clases abstractas, estamos "obligados" a utilizar todos los metodos abstractos*/


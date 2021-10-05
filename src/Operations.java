import Objetos.Coche;

public class Operations {
	
	//Static variable -----> a global variable
	private static float velocidadMMaximaCarretera = 200.0f;
	
	//Getters & Setters-------------
	public static float getVelocidadMMaximaCarretera() {
		return velocidadMMaximaCarretera;
	}

	public static void setVelocidadMMaximaCarretera(float velocidadMMaximaCarretera) {
		Operations.velocidadMMaximaCarretera = velocidadMMaximaCarretera;
	}
	//----------------------
	
	
	
	
	//Static function
	public static void saludo() {
		System.out.println("Hola, quetal!");
	}
	
	public static void mostrearDatosCoche(Coche coche) {//Ctl+F -----> find and replace
		System.out.println(coche.getMarca() + " - " + coche.getColor() + " - " + coche.getNumeroRuedas() +" - " + coche.getNumeroCaballos() + 
				" - " + coche.getNumeroPuertas() +" - " +coche.getVelocidadMAxima());
	}

}

import Objetos.Coche;
import Objetos.Edificio;
import Personas.Bombero;
import Personas.Perros;
import Personas.Persona;
import Personas.Policia;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Definition & Instantiation
		
		Edificio edificio0 = new Edificio();
		Edificio edificio1 = new Edificio();
		
		
		
		
		Coche coche0 = new Coche();// like a
		//Builder Name = Instantiation (create)
		//Call the builder and create  the object with it's values
		
		//type name = Value
		String nombre = "juan";
		
		Coche coche1 = new Coche();
		Coche coche2 = new Coche();
		
		//builder overload 
		Coche coche3 = new Coche("seat", "Verde", 5, 220.0f, 350.0f);
		
		
		// The static functions doesn't create, only are called.
		Operations.saludo();
		Operations.getVelocidadMMaximaCarretera();
		
		//If I wanna change the "edifio0", I gotta use the Setter
		edificio0.setDuenyo("Pepito Guzman");
		edificio0.print();
		edificio1.print();
		System.out.println("***************************");
		
		
		//If I wanna change the brand, I gotta use the Setter
		coche0.setMarca("Renoult");
		System.out.println("El coche0 tiene de marca: " + coche0.getMarca());
		
		coche0.setColor("rojo");
		coche1.setColor("azul");
		coche2.setColor("amarillo");
		
		System.out.println("El coche0 tiene color: " + coche0.getColor());
		System.out.println("El coche1 tiene color: " + coche1.getColor());
		System.out.println("El coche2 tiene color: " + coche2.getColor());
		
		
		//I'm call the Coche class
		coche0.print();
		coche1.print();
		
		
		System.out.println("***************************");
		
		//I'm call the Statics functions
		Operations.mostrearDatosCoche(coche0);
		Operations.mostrearDatosCoche(coche1);
		Operations.mostrearDatosCoche(coche2);
		
		
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------");
		
		
		//Can't create a new object because the class Persona is ABSTRACT
		/*Persona persona0 = new Persona();
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();
		*/
		
		Perros perro1 = new Perros();
		perro1.Comunicarse();
		
		Coche  coche4 = new Coche("Mitsubishi", "Azul", 5, 280.0f, 300.0f);
		Coche  coche5 = new Coche("Lancer", "Amarillo", 4, 270.0f, 400.0f);
		
		Edificio estacionBomberos = new Edificio();
		estacionBomberos.setNombre("Estacion de Bomberos");
		estacionBomberos.setDuenyo("Ayuntamiento");
		
		
		Bombero bombero1 = new Bombero();
		Policia policia1 = new Policia();
		System.out.println("DNI Bombereo: " + bombero1.getDni());
		bombero1.setDni("111111B");
		System.out.println("DNNI mmodificado: "+ bombero1.getDni());
		bombero1.setEdificio(estacionBomberos);
		bombero1.getEdificio().print();
		bombero1.Comunicarse();
		
		Bombero bombero2 = new Bombero("888888Y",  "Pablo",  "Motos", 1980, true ,  45, 23);
		bombero2.print();
		System.out.println("La edad del bombero2 es: " + bombero2.obtenerEdad());
		System.out.println("Mi trabajo trata de: " );
		bombero2.mostrarDescripcionDeProfesion();
		
		System.out.println("Mi trabajo trata de: " );
		policia1.mostrarDescripcionDeProfesion();
	
		/*persona0.setDni("45678912P");
		persona0.setNombre("Alejandro");
		persona0.setApellido("Alonzo");
		persona0.setAnyoNacimiento(1987);
		persona0.setTieneCoche(false);
		
		System.out.println(persona0.obtenerEdad());
		System.out.println(persona0.obtenerEdad(true));//overload
		
		
		persona1.setDni("78945612E");
		persona1.setNombre("Rafael");
		persona1.setApellido("Galdamez");
		persona1.setAnyoNacimiento(1985);
		persona1.setTieneCoche(true);
		persona1.setCoche(coche4);// peona1 now has coche4, create relation.
		persona1.getCoche().setMarca("Toyota");//Set coche4's Marca, first get... then set...
		
		persona2.setDni("98765421F");
		persona2.setNombre("Victor");
		persona2.setApellido("Peraza");
		persona2.setAnyoNacimiento(1989);
		persona2.setTieneCoche(true);
		persona2.setCoche(coche5);
		
		persona3.setDni("65412387B");
		persona3.setNombre("Estefania");
		persona3.setApellido("Lopez");
		persona3.setAnyoNacimiento(1991);
		persona3.setTieneCoche(false);
		
		
		persona0.print();
		persona1.print();
		persona2.print();
		persona3.print();
		*/
	}

}

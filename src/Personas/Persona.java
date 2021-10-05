package Personas;


import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

import Objetos.Coche;
import Objetos.Edificio;

public abstract class Persona implements SeresVivos{//if the class has at least one abstract method, it has to be abstract as well 

	
	//Attribute
	protected String dni;
	protected String nombre;
	protected String apellido;
	protected int anyoNacimiento;
	protected boolean tieneCoche;
	protected Coche coche;
	private int anyoActual;
	protected Edificio edificio;
	
	
	
	//Builders
	public Persona() {
		this.dni = "0";
		this.nombre = "";
		this.apellido = "";
		this.anyoNacimiento = 0;
		this.tieneCoche = false;
		coche = null;
		
	}
	
	public Persona(String id, String name, String lastN, int birth, boolean tc) {
		this.dni = id;
		this.nombre = name;
		this.apellido = lastN;
		this.anyoNacimiento = birth;
		this.tieneCoche = tc;
		
	}
	
	public void comunicarse() {
		System.out.println("Hablar");
	}
	
	public void desplazarse() {
		System.out.println("Con dos pies");
	}
	
	
	
	//Getter & Setter--------------------------------------------------------------------
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}
	
	public boolean getTieneCoche() {
		return tieneCoche;
	}

	public void setTieneCoche(boolean tieneCoche) {
		this.tieneCoche = tieneCoche;
	}
	
	
	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	
	public int getAnyoActual() {
		return anyoActual;
	}

	public void setAnyoActual(int anyoActual) {
		this.anyoActual = anyoActual;
	}

	public Edificio getEdificio() {
		return edificio;
	}

	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}
	//Own method-------------------------------------------------------------------------------------------------------------
	
	public abstract void mostrarDescripcionDeProfesion(); // ABASTRACT is the opposite to FINAL, force to 

	

	public void print () {
		System.out.println(this.dni + " - " + this.apellido + " - " + this.nombre + " - " + this.anyoNacimiento);
		if(this.coche!=null) {
			System.out.println("Marca: " + this.coche.getMarca());
			System.out.println("Color: " + this.coche.getColor());
			System.out.println("Ruedas: " + this.coche.getNumeroRuedas());
			System.out.println("Velocidad: " + this.coche.getVelocidadMAxima());
			System.out.println("Caballos: " + this.coche.getNumeroCaballos());
		}if (this.edificio!= null) {
			this.edificio.print();
		}
	}
	
	public final int obtenerEdad() {//With FINAL the method isn't be able to overwrite. lock!
		Date date = new Date();
		ZonedDateTime localDate = date.toInstant().atZone(ZoneId.systemDefault());
		this.anyoActual = localDate.getYear();
		return (this.anyoActual - this.anyoNacimiento);	 
	}
	
	public final int obtenerEdad(boolean enDias) {//overload
		Date date = new Date();
		ZonedDateTime localDate = date.toInstant().atZone(ZoneId.systemDefault());
		this.anyoActual = localDate.getYear();
		if(enDias) {
			return (this.anyoActual - this.anyoNacimiento) * 365;	
		}else {
			return (this.anyoActual - this.anyoNacimiento);	
		}
		
	}
	
}

package Personas;

import Objetos.Coche;

public class Policia extends Persona{
	
	//Definition Policia's class (attributes)
	protected Coche cochePolicia;
	protected int nummeroPolicia;
	protected int numeroArma;
	
	// Builder
	public Policia() {
	this.cochePolicia = null;
	this.nummeroPolicia = 0;
	this.numeroArma = 0;
	}
	
	//Getter & Setter---------------------

	public Coche getCochePolicia() {
		return cochePolicia;
	}

	public void setCochePolicia(Coche cochePolicia) {
		this.cochePolicia = cochePolicia;
	}

	public int getNummeroPolicia() {
		return nummeroPolicia;
	}

	public void setNummeroPolicia(int nummeroPolicia) {
		this.nummeroPolicia = nummeroPolicia;
	}

	public int getNumeroArma() {
		return numeroArma;
	}

	public void setNumeroArma(int numeroArma) {
		this.numeroArma = numeroArma;
	}
	
	//Own method--------------------------------
	public void print() {
		System.out.println(this.numeroArma + " - " + this.cochePolicia);
	}

	@Override
	public void mostrarDescripcionDeProfesion() {
		// TODO Auto-generated method stub
		System.out.println("Mi profesion trata de atrapar ladrones");
	}

	@Override
	public void Comunicarse() {
		// TODO Auto-generated method stub
		System.out.println("Hablar");
	}
		
	
}

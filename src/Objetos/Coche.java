package Objetos;

public class Coche { // The class must starts with capital letter
	
	
	
	/*OOP
	 * Atributo ----> Variable
	 * Method   ----> Function
	 * Object   ----> Variable compleja/ compuesta
	 */
	
	protected String marca;//Protected can't see outside
	protected String color;
	protected int numeroRuedas;
	protected float  velocidadMAxima;
	protected float velocidadActual;
	protected int numeroPuertas;
	private float numeroCaballos;//private can't see outside but be able to inherit
	private boolean estaArrancado;
	  
	public Coche() {//builder has the same name of the class
		this.marca= "Opel";
		this.color= "blanco";
		this.numeroRuedas= 4;
		this.velocidadMAxima= 200.0f;
		this.velocidadActual= 0.0f;
		this.numeroCaballos= 300.0f;	
		this.estaArrancado= false;
	}
	
	//builder overloaded
	public Coche(String m, String color, int numeroRuedas, float velocidadMaxima, float numeroCaballos) {
		this.marca= m;
		this.color= color;
		this.numeroRuedas= numeroRuedas;
		this.velocidadMAxima= velocidadMaxima;
		this.numeroCaballos= numeroCaballos;	
		
	}
		
	
	
	

	//------------------------------GETTER & SETTER-----------------------------
	public String getMarca() {//getter, returns something, without parameter
		return this.marca;
	}
	
	public void setMarca(String m) {//Setter doesn't return anything, that's why void
		
		this.marca= m;
	}

	//Auto getter & setter >>> MENU> Source> Generate getter and setter...
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getNumeroRuedas() {
		return numeroRuedas;
	}


	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}


	public float getVelocidadMAxima() {
		return velocidadMAxima;
	}


	public void setVelocidadMAxima(float velocidadMAxima) {
		this.velocidadMAxima = velocidadMAxima;
	}


	public float getVelocidadActual() {
		return velocidadActual;
	}


	public void setVelocidadActual(float velocidadActual) {
		this.velocidadActual = velocidadActual;
	}


	public int getNumeroPuertas() {
		return numeroPuertas;
	}


	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}


	public float getNumeroCaballos() {
		return numeroCaballos;
	}


	public void setNumeroCaballos(float numeroCaballos) {
		this.numeroCaballos = numeroCaballos;
	}
	
	public boolean getEstaArrancado() {
		return estaArrancado;
	}


	public void setEstaArrancado(boolean estaArrancado) {
		this.estaArrancado = estaArrancado;
	}
	
	//-----------------------------------------------------------------------------------------
	
	
	//----------------------Definition of own method---------------------------
	public void arrancar() {
		this.estaArrancado= true;
	}
	
	public int acelerar(float incremento) {
		if(this.estaArrancado)
			this.velocidadActual+= incremento;
			if(this.velocidadActual > this.velocidadMAxima) {
				this.velocidadActual = this.velocidadMAxima;
				return 1;
			}
			
			else{
				return -1;
			}
	}

	public int frenar(float decremento) {
		if(this.estaArrancado)
			this.velocidadActual-= decremento;
			if(this.velocidadActual < 0.0f) {
				this.velocidadActual = 0.0f;
				return 1;
			}
			
			else{
				return -1;
			}
	}
	
	public void apagar() {
		this.estaArrancado= false;
	}
	
	//-------------------------------------------------------------------------------
	
	public void print() {
		System.out.println(this.marca + " - " + this.color + " - " + this.numeroRuedas +" - " + this.numeroCaballos + 
				" - " + this.numeroPuertas +" - " +this.velocidadMAxima);
	}

	

	

}

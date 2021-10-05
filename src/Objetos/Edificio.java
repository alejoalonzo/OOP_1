package Objetos;

public class Edificio {
	
	//Attribute definition 
	
	protected float altura;
	protected String empresaCostructora;
	protected String duenyo;
	protected int anyoConstruccion;
	protected String nombre;
	
	//Builders
	public Edificio() {
		this.altura = 10.0f;
		this.empresaCostructora = "Construcciones S.A.";
		this.duenyo = "Juan Lopez";
		this.anyoConstruccion = 2020;
		this.nombre = "";
	}
	
	//Builder overload
	public Edificio(float alt, String empC, String due, int anyoC) {
		this.altura = alt;
		this.empresaCostructora = empC;
		this.duenyo = due;
		this.anyoConstruccion = anyoC;	
	}
	
	
	
	//Getter & Setter-------------------------------------------------------------------------

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getEmpresaCostructora() {
		return empresaCostructora;
	}

	public void setEmpresaCostructora(String empresaCostructora) {
		this.empresaCostructora = empresaCostructora;
	}

	public String getDuenyo() {
		return duenyo;
	}

	public void setDuenyo(String duenyo) {
		this.duenyo = duenyo;
	}

	public int getAnyoConstruccion() {
		return anyoConstruccion;
	}

	public void setAnyoConstruccion(int anyoConstruccion) {
		this.anyoConstruccion = anyoConstruccion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//-------------------------------------------------------------------------------------------
	
	
	


	//Own method
	public void print() {
		System.out.println(this.nombre + " - " + this.altura + " - " + this.empresaCostructora + " - " + this.duenyo + " - " + this.anyoConstruccion);
	}

	
	
	

}

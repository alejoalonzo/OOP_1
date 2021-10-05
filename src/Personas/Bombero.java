package Personas;

//INHERITANCE...  'Persona' is parent class and the Bobero's class is  the child class.
//All  the attributes PUBLIC and PROTECTED now  are transmitted from parents to children.

public class Bombero extends Persona {
	
	//Definition Bombero's class (attributes)
	protected int numeroPlaca;
	protected int numeroTraje;
	
	// Builder
	public Bombero() {
		this.numeroPlaca= 10;
		this.numeroTraje= 20;
	}
	public Bombero(String id, String name, String lastN, int birth, boolean tc, int np, int nt) {
		super(id, name, lastN, birth, tc);//SUPER means same parameters and order  from parents
		this.numeroPlaca= np;
		this.numeroTraje= nt;
	}
	
	//Getter & Setter---------------------
	public int getNumeroPlaca() {
		return numeroPlaca;
	}

	public void setNumeroPlaca(int numeroPlaca) {
		this.numeroPlaca = numeroPlaca;
	}

	public int getNumeroTraje() {
		return numeroTraje;
	}

	public void setNumeroTraje(int numeroTraje) {
		this.numeroTraje = numeroTraje;
	}
	
	//Own method--------------------------------
	public void print() {
		super.print();//Call parent's print();
		System.out.println(this.numeroTraje + " -*-*-*-*-*- " + this.numeroPlaca);
	}
	
	public void mostrarDescripcionDeProfesion() {
		System.out.println("Mi profesion trata de aoagar fuegos");
	}
	@Override
	public void Comunicarse() {
		// TODO Auto-generated method stub
		System.out.println("Hablar");
	}

	
	
}

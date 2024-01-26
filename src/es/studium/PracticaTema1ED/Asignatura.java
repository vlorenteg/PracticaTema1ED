package es.studium.PracticaTema1ED;

public class Asignatura {

	//Atributos
	private String nombre;
	private int numeroHoras;
	private int codigo;
	
	//Constructor vacío
	public Asignatura() {
		nombre = "";
		numeroHoras = 0;
		codigo = 0;
	}
	
	//Constructor por parámetros
	public Asignatura(String nombre, int numeroHoras, int codigo) {
		this.nombre = nombre;
		this.numeroHoras = numeroHoras;
		this.codigo = codigo;
	}

	//Métodos gett y sett
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}	
}


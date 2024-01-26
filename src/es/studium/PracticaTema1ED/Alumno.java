package es.studium.PracticaTema1ED;

public class Alumno {

	//Atributos
	private String nombre;
	private String direccion;
	private int numeroMatricula;
	private Float nota;
	private Centro centro;
	private Asignatura asignatura;
	
	//Constructor vacío
	public Alumno() {
		nombre = "";
		direccion = "";
		numeroMatricula = 0;
		nota = (float) 0;
		centro = new Centro();
		asignatura = new Asignatura();
	}

	//Constructor por parámetros
	public Alumno(String nombre, String direccion, int numeroMatricula, Float nota, Centro centro,
			Asignatura asignatura) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.numeroMatricula = numeroMatricula;
		this.nota = nota;
		this.centro = centro;
		this.asignatura = asignatura;
	}

	//Métodos gett y sett
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public Float getNota() {
		return nota;
	}

	public void setNota(Float nota) {
		this.nota = nota;
	}

	public Centro getCentro() {
		return centro;
	}

	public void setCentro(Centro centro) {
		this.centro = centro;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
}

	
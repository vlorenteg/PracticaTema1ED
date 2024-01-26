package es.studium.PracticaTema1ED;

public class Centro {

	//Atributos
	private String nombre;
	private String direccion;
	private int codigo;
	
	//Constructor vacío
	public Centro() {
		nombre = "";
		direccion = "";
		codigo = 0;
	}

	//Constructor por parámetros
	public Centro(String nombre, String direccion, int codigo) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigo = codigo;
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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}

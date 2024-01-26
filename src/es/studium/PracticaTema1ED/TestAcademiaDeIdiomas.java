package es.studium.PracticaTema1ED;

public class TestAcademiaDeIdiomas {

	public static void main(String[] args) {
		
		Asignatura asignatura1 = new Asignatura();
		asignatura1.setNombre("Inglés B1");
		
		Asignatura asignatura2 = new Asignatura();
		asignatura2.setNombre("Inglés B2");
		
		Asignatura asignatura3 = new Asignatura();
		asignatura3.setNombre("Francés A2");
		
		Asignatura asignatura4 = new Asignatura();
		asignatura4.setNombre("Francés B1");
		
		Centro centro1 = new Centro();
		centro1.setNombre("Escuela de inglés");
		centro1.setDireccion("Reyes Católicos, 14");
		
		Centro centro2 = new Centro();
		centro2.setNombre("Escuela de francés");
		centro2.setDireccion("Cristobal Colón, 92");
		
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("Ana Abel");
		alumno1.setDireccion("Paseo de América, 15");
		alumno1.setCentro(centro1);
		alumno1.setAsignatura(asignatura1);
		alumno1.setNota((float) 7);
		
		Alumno alumno2 = new Alumno();
		alumno2.setNombre("Benito Bueno");
		alumno2.setDireccion("Reyes Católicos, 16");
		alumno2.setCentro(centro1);
		alumno2.setAsignatura(asignatura2);
		alumno2.setNota((float) 6);
		
		Alumno alumno3 = new Alumno();
		alumno3.setNombre("Carmen Cano");
		alumno3.setDireccion("Reyes Católicos, 2");
		alumno3.setCentro(centro1);
		alumno3.setAsignatura(asignatura1);
		alumno3.setNota((float) 5);
		
		Alumno alumno4 = new Alumno();
		alumno4.setNombre("Esteban Escalera");
		alumno4.setDireccion("Isabel la Católica, 28");
		alumno4.setCentro(centro2);
		alumno4.setAsignatura(asignatura2);
		alumno4.setNota((float) 9);
		
		Alumno alumno5 = new Alumno();
		alumno5.setNombre("Francisco Farfán");
		alumno5.setDireccion("Cristobal Colón, s/n");
		alumno5.setCentro(centro2);
		alumno5.setAsignatura(asignatura1);
		alumno5.setNota((float) 8.5);

		Alumno alumno6 = new Alumno();
		alumno6.setNombre("Valentín Lorente Gómez");
		alumno6.setDireccion("Brenes, 5");
		alumno6.setCentro(centro1);
		alumno6.setAsignatura(asignatura1);
		alumno6.setNota((float) 8);

		System.out.println("Estas son las direcciones de los centros: " + centro1.getDireccion() + "; " + centro2.getDireccion() + ".");
		System.out.println("La alumna " + alumno3.getNombre() + " está matriculada en el centro: " + centro1.getNombre() + " que se ubica en la dirección " + centro1.getDireccion() + ".");
		System.out.println("La nota que ha sacado " + alumno2.getNombre() + " en " + asignatura2.getNombre() + " es un " + alumno2.getNota() + ".");
	}
}

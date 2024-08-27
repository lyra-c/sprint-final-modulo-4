package SprintFinalM4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
* Declaración de la clase Profesional
*
*  Cuenta con el método toString() de "Profesional" para acceder a todos sus datos
*
* @author Nicolás Gajardo
* @author Jorge Lira
* @author Beatriz Maldonado
* @author Diego Rivera
*
* @version 1.0
* */
public class Profesional extends Usuario {
	private String titulo;
	private String fechaIngreso;

	public Profesional() {
	}

	public Profesional(String nombre, String fechaNacimiento, String run, String titulo, String fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo.length() < 10 || titulo.length() > 50) {
			throw new IllegalArgumentException("El título debe tener entre 10 y 50 caracteres.");
		}
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate.parse(fechaIngreso, dtf);
			this.fechaIngreso = fechaIngreso;
		} catch (DateTimeParseException e) {
			throw new IllegalArgumentException("La fecha de ingreso debe tener el formato dd/MM/yyyy.");
		}
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Título: " + titulo + ", Fecha de Ingreso: " + fechaIngreso);
	}

	@Override
	public String toString() {
		return super.toString() + " Profesional{" + "titulo='" + titulo + '\'' + ", fechaIngreso='" + fechaIngreso
				+ '\'' + '}';
	}
}

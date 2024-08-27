package SprintFinalM4;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;

/**
* Declaración de la clase Accidente
*
*  Cuenta con el método toString() de "Accidente" para acceder a todos sus datos
*
* @author Nicolás Gajardo
* @author Jorge Lira
* @author Beatriz Maldonado
* @author Diego Rivera
*
* @version 1.0
* */
public class Accidente {
	private int identificador;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencias;
	
	/**
	 * Constructor con parámetros
	 * */
	public Accidente(int identificador, String rutCliente, String dia, String hora, String lugar, String origen,
			String consecuencias) {
		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}
	
	/**
	 * Constructor sin parámetros
	 * */
	public Accidente() {
		
	}
	
	/**
	 * Getters y Setters
	 * */
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Integer identificador) {
		if (identificador == null) {
			throw new IllegalArgumentException("Identificador es un campo obligatorio.");
		}
		this.identificador = identificador;
	}
	public String getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(String rutCliente) {
		if (rutCliente == null) {
			throw new IllegalArgumentException("RUT es un campo obligatorio.");
		}
		this.rutCliente = rutCliente;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		if (dia == null || !(dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes")
				|| dia.equalsIgnoreCase("miércoles") || dia.equalsIgnoreCase("jueves")
				|| dia.equalsIgnoreCase("viernes") || dia.equalsIgnoreCase("sábado")
				|| dia.equalsIgnoreCase("domingo"))) {
			throw new IllegalArgumentException(
					"El día debe ser uno de los siguientes: lunes, martes, miércoles, jueves, viernes, sábado, domingo.");
		}
		this.dia = dia;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		try {
			// Intenta analizar la hora usando el formato HH:mm
			LocalTime.parse(hora);
		} catch (DateTimeParseException e) {
			throw new IllegalArgumentException("La hora debe estar en formato HH:mm y ser válida.");
		}
		this.hora = hora;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		if (lugar.length() < 10 || lugar.length() > 50 || lugar == null) {
			throw new IllegalArgumentException("Lugar no puede ser nulo, y debe tener entre 10 y 50 caracteres.");
		}
		this.lugar = lugar;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		if (origen.length() > 100) {
			throw new IllegalArgumentException("El campo origen debe tener menos de 100 caracteres.");
		}
		this.origen = origen;
	}
	public String getConsecuencias() {
		return consecuencias;
	}
	public void setConsecuencias(String consecuencias) {
		if (consecuencias.length() > 100) {
			throw new IllegalArgumentException("El campo origen debe tener menos de 100 caracteres.");
		}
		this.consecuencias = consecuencias;
	}

	@Override
	public String toString() {
		return "Accidente [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora="
				+ hora + ", lugar=" + lugar + ", origen=" + origen + ", consecuencias=" + consecuencias + "]";
	}
	
	
}

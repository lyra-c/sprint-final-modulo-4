package SprintFinalM4;

//package prevencionDeRiesgos;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

/**
 * Clase Capacitación
 *
 *
 * @author Nicolás Gajardo
 * @author Jorge Lira
 * @author Beatriz Maldonado
 * @author Diego Rivera
 *
 * @version 1.0
 */
public class Capacitacion {
	private int identificador;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantidadAsistentes;

	// Constructor sin parámetros
	public Capacitacion() {
	}

	// Constructor con parámetros
	public Capacitacion(int identificador, String rutCliente, String dia, String hora, String lugar, String duracion,
			int cantidadAsistentes) {
		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}

	// Setter y getter
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
		if (rutCliente == "") {
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
					"El día debe ser uno de los siguientes: Lunes, Martes, Miércoles, Jueves, Viernes, Sábado o Domingo.");
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
			throw new IllegalArgumentException("La hora debe estar en formato HH:mm");
		}
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		if (lugar.length() < 10 || lugar.length() > 50) {
			throw new IllegalArgumentException("Lugar debe tener entre 10 y 50 caracteres.");
		}
		this.lugar = lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		if (duracion.length() > 70) {
			throw new IllegalArgumentException("Duración debe tener menos de 70 caracteres.");
		}
		this.duracion = duracion;
	}

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(Integer cantidadAsistentes) {
		if (cantidadAsistentes == null || cantidadAsistentes > 1000) {
			throw new IllegalArgumentException(
					"La cantidad de asistentes es un campo obligatorio y la cantidad debe ser menor a 1000.");
		}
		this.cantidadAsistentes = cantidadAsistentes;
	}

	// Método toString()
	@Override
	public String toString() {
		return "Capacitacion [Identificador= " + identificador + " RUT= " + rutCliente + ", Día= " + dia + ", Hora= "
				+ hora + ", Lugar= " + lugar + ", Duración(En minutos)= " + duracion + ", Cantidad de Asistentes= "
				+ cantidadAsistentes + "]";
	}

	public String mostrarDetalle() {
		return "La capacitación será en " + lugar + " a las " + hora + " del día " + dia + " y durará " + duracion
				+ " minutos";
	}
}

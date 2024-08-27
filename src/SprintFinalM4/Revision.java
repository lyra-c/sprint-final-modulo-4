package SprintFinalM4;

/**
 * Declaración de la clase Revision
 * 
 *  Cuenta con el método toString() de "Revision" para acceder a todos sus datos
 * 
 * @author Nicolás Gajardo
 * @author Jorge Lira
 * @author Beatriz Maldonado
 * @author Diego Rivera
 * 
 * @version 1.0
 * */
public class Revision {
	private int idRevision; // Identificador de la revisión
	private int idVisitaTerreno; // Identificador de la visita en terreno
	private String nombreRevision; // Nombre alusivo a la revisión
	private String detalleRevision; // Detalle para revisar
	private int estado; // Estado de la revisión 1 (sin problemas), 2 (con observaciones), 3 (no
						// aprueba).

	// Constructor sin parámetros
	public Revision() {
	}

	// Constructor con parámetros
	public Revision(int idRevision, int idVisitaTerreno, String nombreRevision, String detalleRevision, int estado) {
		this.idRevision = idRevision;
		this.idVisitaTerreno = idVisitaTerreno;
		this.nombreRevision = nombreRevision;
		this.detalleRevision = detalleRevision;
		this.estado = estado;
	}

	// Getters y Setters
	public int getIdRevision() {
		return idRevision;
	}

	public void setIdRevision(int idRevision) {
		if (idRevision == 0) {
			throw new IllegalArgumentException(" Identificador de la revisión es un campo obligatorio.");
		}
		this.idRevision = idRevision;
	}

	public int getIdVisitaTerreno() {
		return idVisitaTerreno;
	}

	public void setIdVisitaTerreno(int idVisitaTerreno) {
		if (idVisitaTerreno == 0) {
			throw new IllegalArgumentException(" Identificador de la visita en terreno es un campo obligatorio.");
		}
		this.idVisitaTerreno = idVisitaTerreno;
	}

	public String getNombreRevision() {
		return nombreRevision;
	}

	public void setNombreRevision(String nombreRevision) {
		if (nombreRevision.length() < 10 || nombreRevision.length() > 50) {
			throw new IllegalArgumentException("Nombre de la Revisión debe tener entre 10 y 50 caracteres.");
		}
		this.nombreRevision = nombreRevision;
	}

	public String getDetalleRevision() {
		return detalleRevision;
	}

	public void setDetalleRevision(String detalleRevision) {
		if (detalleRevision.length() > 100) {
			throw new IllegalArgumentException("Duración debe tener menos de 100 caracteres.");
		}
		this.detalleRevision = detalleRevision;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		if (estado == 1 || estado == 2 || estado == 3) {
			this.estado = estado;
		} else {
			throw new IllegalArgumentException(
					"Solo Debe ingresar:  1 (sin problemas), 2 (con observaciones), 3 (no aprueba),");
		}
	}

	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision +
				", idVisitaTerreno=" + idVisitaTerreno +
				", nombreRevision=" + nombreRevision + 
				", detalleRevision=" + detalleRevision + 
				", estado=" + estado + "]";
	}

} 

package SprintFinalM4;

/**
* Declaración de la clase VisitaTerreno
*
*  Cuenta con el método toString() de "VisitaTerreno" para acceder a todos sus datos
*
* @author Nicolás Gajardo
* @author Jorge Lira
* @author Beatriz Maldonado
* @author Diego Rivera
*
* @version 1.0
* */
public class VisitaTerreno {
    // Atributos
    private int idVisita; // Identificador de la visita en terreno
    private String rutCliente; // RUT Cliente
    private String dia; // Día de la visita en formato DD/MM/AAAA
    private String hora; // Hora de la visita en formato HH:MM
    private String lugar; // Lugar de la visita
    private String comentarios; // Comentarios de la visita

    // Constructor vacío
    public VisitaTerreno() {
    }

    // Constructor con todos los atributos
    public VisitaTerreno(int idVisita, String rutCliente, String dia, String hora, String lugar, String comentarios) {
        this.idVisita = idVisita;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    // Métodos getters y setters
    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
    	if (lugar.length() < 10 || lugar.length() > 50) {
			throw new IllegalArgumentException("Lugar  debe tener entre 10 y 50 caracteres.");
		}
		this.lugar = lugar;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
    	if (comentarios.length() > 100) {
			throw new IllegalArgumentException("El comentarios debe tener menos de 100 caracteres.");
		}
		this.comentarios = comentarios;
	}

    
    // Método toString
    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "idVisita=" + idVisita +
                ", rutCliente='" + rutCliente + '\'' +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}

package SprintFinalM4;

import java.util.ArrayList;
import java.util.List;

/**
* Clase Contenedor
* 
* Cuenta con los métodos para:
* - Almacenar cliente
* - Almacenar profesional
* - Almacenar administrativo
* - Almacenar capacitación
* - Eliminar usuario
* - Listar usuarios
* - Listar usuarios por tipo
* - Listar capacitaciones
* 
* @author Nicolás Gajardo
* @author Jorge Lira
* @author Beatriz Maldonado
* @author Diego Rivera
*
* @version 1.0
* */
public class Contenedor {
	/*
	 * Lista de instancias de la interfaz Asesoria. Lista de instancias de la clase
	 * Capacitación.
	 * 
	 * @author Nicolás Gajardo
	 * @author Jorge Lira
	 * @author Beatriz Maldonado
	 * @author Diego Rivera
	 * @version 1.0
	 */
	private List<Asesoria> asesorias;
	private List<Capacitacion> capacitaciones;

	// Constructor que inicializa las listas
	public Contenedor() {
		this.asesorias = new ArrayList<>();
		this.capacitaciones = new ArrayList<>();
	}

	/*
	 * Método para almacenar un nuevo cliente en la lista de asesorias.
	 * 
	 * @param cliente El objeto Cliente que se desea almacenar.
	 */
	public void almacenarCliente(Cliente cliente) {
		asesorias.add(cliente);
	}

	/*
	 * Método para almacenar un nuevo profesional en la lista de asesorias.
	 * 
	 * @param profesional El objeto Profesional que se desea almacenar.
	 */
	public void almacenarProfesional(Profesional profesional) {
		asesorias.add(profesional);
	}

	// Método para almacenar un nuevo administrativo en la lista de asesorias.
	public void almacenarAdministrativo(Administrativo administrativo) {
		asesorias.add(administrativo);
	}

	// Método para almacenar una nueva capacitación en la lista de capacitaciones.
	public void almacenarCapacitacion(Capacitacion capacitacion) {
		capacitaciones.add(capacitacion);
	}

	/*
	 * Método para eliminar un usuario de la lista de asesorias en base a su RUN.
	 * Elimina el usuario si se encuentra en la lista, verificando que el objeto sea
	 * una instancia de la clase Usuario.
	 */
	public void eliminarUsuario(String run) {
		asesorias.removeIf(asesoria -> {
			if (asesoria instanceof Usuario) {
				Usuario usuario = (Usuario) asesoria;
				return usuario.getRun().equals(run);
			}
			return false;
		});
	}

	/*
	 * Método para listar todos los usuarios almacenados en la lista de asesorias.
	 * Filtra los objetos que son instancias de Usuario y los muestra en la consola.
	 */
	public void listarUsuarios() {
		for (Asesoria asesoria : asesorias) {
			if (asesoria instanceof Usuario) {
				Usuario usuario = (Usuario) asesoria;
				System.out.println(usuario.toString());
			}
		}
	}

	/*
	 * Método para listar usuarios por un tipo específico de Usuario. La clase
	 * específica de Usuario que se desea listar (por ejemplo, Cliente,
	 * Profesional). Filtra e imprime en la consola los objetos que son instancias
	 * del tipo especificado.
	 */
	public void listarUsuariosPorTipo(Class<? extends Usuario> tipo) {
		for (Asesoria asesoria : asesorias) {
			if (tipo.isInstance(asesoria)) {
				System.out.println(asesoria.toString());
			}
		}
	}

	/*
	 * Método para listar todas las capacitaciones almacenadas en la lista de
	 * capacitaciones. Imprime en la consola la representación en cadena de cada
	 * capacitación.
	 */
	public void listarCapacitaciones() {
		for (Capacitacion capacitacion : capacitaciones) {
			System.out.println(capacitacion.toString());
		}
	}
}

package SprintFinalM4;

import java.util.Scanner;

/**
* Clase Principal
*
* Cuenta con un menú desplegable para todas las acciones:
* 
* - Almacenar cliente
* - Almacenar profesional
* - Almacenar administrativo
* - Almacenar capacitación
* - Eliminar usuario
* - Listar usuarios
* - Listar usuarios por tipo
* - Listar capacitaciones
* - Salir
*
* @author Nicolás Gajardo
* @author Jorge Lira
* @author Beatriz Maldonado
* @author Diego Rivera
*
* @version 1.0
* */
public class ClasePrincipal {
	public static void main(String[] args) {
		Contenedor contenedor = new Contenedor();
		Scanner scanner = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("----------------------------");
			System.out.println("1. Almacenar Cliente");
			System.out.println("2. Almacenar Profesional");
			System.out.println("3. Almacenar Administrativo");
			System.out.println("4. Almacenar Capacitación");
			System.out.println("5. Listar Usuarios");
			System.out.println("6. Listar Usuarios por Tipo");
			System.out.println("7. Listar Capacitaciones");
			System.out.println("8. Eliminar Usuario");
			System.out.println("0. Salir");
			System.out.print("Seleccione una opción: ");
			System.out.println("\n----------------------------");
			opcion = scanner.nextInt();
			scanner.nextLine(); // Consumir la nueva línea
			switch (opcion) {
			case 1:
				Cliente cliente = new Cliente();
				// Solicitar y establecer los datos del cliente
				while (true) {
					try {
						System.out.print("Ingrese el nombre de usuario del Cliente (Entre 10 y 50 caracteres):   ");
						String nombre = scanner.nextLine();
						cliente.setNombre(nombre);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.print("Ingrese la fecha de nacimiento del Cliente, en formato (dd/MM/yyyy): ");
						String fechaNacimiento = scanner.nextLine();
						cliente.setFechaNacimiento(fechaNacimiento);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.print("Ingrese el RUN del Cliente  ");
						String run = scanner.nextLine();
						cliente.setRun(run);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.print("Ingrese el RUT del cliente. Menor a 99999999:  ");
						String rut = scanner.nextLine();
						cliente.setRut(rut);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.print(
								"Ingrese los nombres del Cliente (Campo Obligatorio), entre 5 y 30 caracteres: ");
						String nombres = scanner.nextLine();
						cliente.setNombres(nombres);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.print(
								"Ingrese los apellidos del Cliente (Campo Obligatorio), entre 5 y 30 caracteres: ");
						String apellidos = scanner.nextLine();
						cliente.setApellidos(apellidos);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.print("Ingrese el teléfono del Cliente (Campo obligatorio):  ");
						String telefono = scanner.nextLine();
						cliente.setTelefono(telefono);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.print("Ingrese la AFP del Cliente, entre 4 y 30 caracteres: ");
						String afp = scanner.nextLine();
						cliente.setAfp(afp);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.print("Ingrese el Sistema de Salud del Cliente, (1) Fonasa o (2) Isapre:  ");
						int sistemaSalud = scanner.nextInt();
						scanner.nextLine(); // Consumir el salto de línea pendiente
						cliente.setSistemaSalud(sistemaSalud);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.print("Ingrese la dirección del Cliente, máximo 70 caracteres: ");
						String direccion = scanner.nextLine();
						cliente.setDireccion(direccion);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.print("Ingrese la comuna del Cliente, máximo 50 caracteres: ");
						String comuna = scanner.nextLine();
						cliente.setComuna(comuna);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				contenedor.almacenarCliente(cliente);
				break;

			case 2:
				Profesional profesional = new Profesional();
				// Solicitar y establecer los datos del profesional
				while (true) {
					try {
						System.out.print("Ingrese el RUT del profesional: ");
						String run = scanner.nextLine();
						profesional.setRun(run);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.print("Ingrese el nombre del profesional: ");
						String nombre = scanner.nextLine();
						profesional.setNombre(nombre);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.print("Ingrese el título del profesional (10-50 carácteres): ");
						String titulo = scanner.nextLine();
						profesional.setTitulo(titulo);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Ocurrió un error. Intente nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.print("Ingrese la fecha de ingreso (DD/MM/YYYY): ");
						String fechaIngreso = scanner.nextLine();
						profesional.setFechaIngreso(fechaIngreso);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Ocurrió un error. Intente nuevamente.");
					}
				}
				System.out.print("Ingrese Fecha de Nacimiento (DD/MM/YYYY): ");
				profesional.setFechaNacimiento(scanner.nextLine());
				contenedor.almacenarProfesional(profesional);
				break;

			case 3:
				Administrativo administrativo = new Administrativo();
				// Validar y establecer el nombre
				while (true) {
					try {
						System.out.print("Ingrese el RUN del administrativo: ");
						String run = scanner.nextLine();
						administrativo.setRun(run);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.print("Ingrese el nombre del administrativo: ");
						String nombre = scanner.nextLine();
						administrativo.setNombre(nombre);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				// Validar y establecer el area del administrativo
				while (true) {
					try {
						System.out.print("Ingrese el area del administrativo: ");
						String area = scanner.nextLine();
						administrativo.setArea(area);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				// Validar y establecer la experiencia previa del administrativo
				while (true) {
					try {
						System.out.print("Ingrese la experiencia previa del administrativo: ");
						String experienciaPrevia = scanner.nextLine();
						administrativo.setExperienciaPrevia(experienciaPrevia);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				// Almacenar el administrativo
				contenedor.almacenarAdministrativo(administrativo);
				break;

			// Opción 4: Almacenar Capacitación
			case 4:
				Capacitacion capacitacion = new Capacitacion();
				// Validar y establecer el identificador de la capacitación
				while (true) {
					try {
						System.out.print("Ingrese el identificador de la capacitación: ");
						int identificador = scanner.nextInt();
						capacitacion.setIdentificador(identificador);
						scanner.nextLine(); // Consumir la nueva línea
						break;
					} catch (IllegalArgumentException e) {
						System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				// Validar y establecer el RUT del cliente asociado
				while (true) {
					try {
						System.out.print("Ingrese el RUT del cliente asociado: ");
						String rutCliente = scanner.nextLine();
						capacitacion.setRutCliente(rutCliente);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				// Validar y establecer el día de la capacitación
				while (true) {
					try {
						System.out.print("Ingrese el día de la capacitación (Día de la semana): ");
						String dia = scanner.nextLine();
						capacitacion.setDia(dia);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				// Validar y establecer la hora de la capacitación
				while (true) {
					try {
						System.out.print("Ingrese la hora de la capacitación (HH:MM): ");
						String hora = scanner.nextLine();
						capacitacion.setHora(hora);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				// Validar y establecer el lugar de la capacitación
				while (true) {
					try {
						System.out.print("Ingrese el lugar de la capacitación: ");
						String lugar = scanner.nextLine();
						capacitacion.setLugar(lugar);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				// Validar y establecer la duración de la capacitación
				while (true) {
					try {
						System.out.print("Ingrese la duración de la capacitación (en minutos): ");
						String duracion = scanner.nextLine();
						capacitacion.setDuracion(duracion);
						// scanner.nextLine(); // Consumir la nueva línea
						break;
					} catch (IllegalArgumentException e) {
						System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				// Validar y establecer la cantidad de asistentes
				while (true) {
					try {
						System.out.print("Ingrese la cantidad de asistentes a la capacitación: ");
						int cantidadAsistentes = scanner.nextInt();
						capacitacion.setCantidadAsistentes(cantidadAsistentes);
						scanner.nextLine(); // Consumir la nueva línea
						break;
					} catch (IllegalArgumentException e) {
						System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				// Almacenar la capacitación
				contenedor.almacenarCapacitacion(capacitacion);
				break;

			case 20: // Modificar numero
				Accidente accidente = new Accidente();
				while (true) {
					try {
						System.out.println("Ingrese el Identificador del accidente:");
						int idAccidente = scanner.nextInt();
						accidente.setIdentificador(idAccidente);
						scanner.nextLine();
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.println("Ingrese el RUT del cliente:");
						String rutCliente = scanner.nextLine();
						accidente.setRutCliente(rutCliente);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.println("Ingrese el día del accidente:");
						String diaAccidente = scanner.nextLine();
						accidente.setDia(diaAccidente);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.println("Ingrese la hora del accidente:");
						String horaAccidente = scanner.nextLine();
						accidente.setHora(horaAccidente);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.println("Ingrese el lugar del accidente:");
						String lugarAccidente = scanner.nextLine();
						accidente.setLugar(lugarAccidente);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.println("Ingrese el origen del accidente:");
						String origenAccidente = scanner.nextLine();
						accidente.setOrigen(origenAccidente);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				while (true) {
					try {
						System.out.println("Ingrese las consecuencias del accidente:");
						String consecuenciasAccidente = scanner.nextLine();
						accidente.setConsecuencias(consecuenciasAccidente);
						break;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage() + " Inténtelo nuevamente.");
					}
				}
				break;
			case 5:
				contenedor.listarUsuarios();
				break;
			case 6:
				System.out.println("Seleccione el tipo de usuario a listar:");
				System.out.println("1.Cliente, 2.Profesional, 3.Administrativo");
				int tipoUsuario = scanner.nextInt();
				scanner.nextLine();
				switch (tipoUsuario) {
				case 1:
					System.out.println("Listando Clientes:");
					contenedor.listarUsuariosPorTipo(Cliente.class);
					break;
				case 2:
					System.out.println("Listando Profesionales:");
					contenedor.listarUsuariosPorTipo(Profesional.class);
					break;
				case 3:
					System.out.println("Listando Administrativos:");
					contenedor.listarUsuariosPorTipo(Administrativo.class);
					break;
				default:
					System.out.println("Ocurrió un error el tipo de usuario no es válido. Intente nuevamente");
				}
				break;
			case 7:
				contenedor.listarCapacitaciones();
				break;
			case 8:
				System.out.print("Ingrese el RUT del usuario a eliminar: ");
				String rut = scanner.nextLine();
				contenedor.eliminarUsuario(rut);
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción no válida, intente de nuevo.");
			}
		} while (opcion != 0);
		scanner.close();
	}
}

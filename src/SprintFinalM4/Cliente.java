package SprintFinalM4;

/**
 * Declaración de la clase Cliente
 * 
 * Cuenta con el método obtenerNombre() para acceder al nombre completo
 * 
 * Cuenta con el método obtenerSistemaSalud() para desplegar el nombre del
 * sistema de salud del cliente a partir de un valor entero
 * 
 * Cuenta con el método analizarUsuario() que despliega los datos del método del mismo nombre
correspondiente a la clase padre (Usuario).
 * 
 * Cuenta con el método toString() de "Cliente" para acceder a todos sus datos
 * 
 * @author Nicolás Gajardo
 * @author Jorge Lira
 * @author Beatriz Maldonado
 * @author Diego Rivera
 * 
 * @version 1.0
 * */

public class Cliente extends Usuario {
    private String rut; // RUT del cliente empresa
    private String nombres; // Nombres del cliente para implementar metodo obtener nombre
    private String apellidos; // Apellidos del cliente para implementar metodo obtener nombre
    private String telefono; // Teléfono del cliente
    private String afp; // AFP del cliente
    private int sistemaSalud; // Sistema de salud del cliente (1 para Fonasa, 2 para Isapre)
    private String direccion; // Dirección del cliente
    private String comuna; // Comuna del cliente
    //private int edad; // Edad del cliente extiende de usuario, fecha de nacimiento.

    // Constructor sin parámetros
    public Cliente() {}
    
    
	public Cliente(String nombre, String fechaNacimiento, String run, String rut, String nombres, String apellidos, String telefono, 
            String afp, int sistemaSalud, String direccion, String comuna) {
		super(nombre, fechaNacimiento, run);
		this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
       // this.edad = edad;
    }

    // Getters y setters para todos los atributos con validaciones

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if (Integer.parseInt(rut) < 99999999) {
            this.rut = rut;
        } else {
            throw new IllegalArgumentException("El RUT debe ser menor a 99.999.999.");
        }
    }
    

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
    	if (nombres == "") {
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        } else if (nombres.length() < 5) {
            throw new IllegalArgumentException("El nombre debe tener al menos 5 caracteres");
        } else if (nombres.length() > 30) {
            throw new IllegalArgumentException("El nombre no puede tener más de 30 caracteres");
        } else {
            this.nombres = nombres;
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
    	if (apellidos == "") {
            throw new IllegalArgumentException("El apellido no puede ser nulo");
        } else if (apellidos.length() < 5) {
            throw new IllegalArgumentException("El apellido debe tener al menos 5 caracteres");
        } else if (apellidos.length() > 30) {
            throw new IllegalArgumentException("El apellido no puede tener más de 30 caracteres");
        } else {
            this.apellidos = apellidos;
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono != "" && !telefono.isEmpty()) {
            this.telefono = telefono;
        } else {
            throw new IllegalArgumentException("El teléfono es obligatorio.");
        }
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        if (afp.length() >= 4 && afp.length() <= 30) {
            this.afp = afp;
        } else {
            throw new IllegalArgumentException("La AFP debe tener entre 4 y 30 caracteres.");
        }
    }

    public int getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(int sistemaSalud) {
        if (sistemaSalud == 1 || sistemaSalud == 2) {
            this.sistemaSalud = sistemaSalud;
        } else {
            throw new IllegalArgumentException("El sistema de salud debe ser 1 (Fonasa) o 2 (Isapre).");
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion.length() <= 70) {
            this.direccion = direccion;
        } else {
            throw new IllegalArgumentException("La dirección debe tener máximo 70 caracteres.");
        }
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        if (comuna.length() <= 50) {
            this.comuna = comuna;
        } else {
            throw new IllegalArgumentException("La comuna debe tener máximo 50 caracteres.");
        }
    }

    /**public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad < 150) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad debe ser un número entre 0 y 149.");
        }
    }**/

    // Método obtenerNombre() que retorna el nombre completo del cliente
    public String obtenerNombre() {
        return nombres + " " + apellidos;
    }

    // Método obtenerSistemaSalud() que despliega el tipo de sistema de salud
    public String obtenerSistemaSalud() {
        return sistemaSalud == 1 ? "Fonasa" : "Isapre";
    }
    
    

    // Implementación del método analizarUsuario() de la interfaz Asesoria
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Dirección: " + direccion + ", Comuna: " + comuna);
    }
    

    @Override
	public String toString() {
		return "Cliente [RUT= " + rut + ", Nombres= " + nombres + ", Apellidos= " + apellidos + ", Teléfono= " + telefono
				+ ", AFP= " + afp + ", Sistema de Salud= " + obtenerSistemaSalud() + ", Dirección= " + direccion + ", Comuna= " + comuna
				+ ", Usuario Cliente= " + getNombre() + ", Fecha de Nacimiento= " + getFechaNacimiento() + ", RUN= "
				+ getRun() + ", Edad= " + mostrarEdad() + "]";
	}
}

package SprintFinalM4;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.Period;
/**
* Clase Usuario, clase padre de Administrativo, Cliente, y Profesional
*
* Implementa la interfaz Asesoria
* Crea el método analizarUsuario() para ser usado en otras clases,
* desde la interfaz Asesoria
*
* Cuenta con los métodos analizarUsuario() y toString() propios
*
* @author Nicolás Gajardo
* @author Jorge Lira
* @author Beatriz Maldonado
* @author Diego Rivera
*
* @version 1.0
* */
public class Usuario implements Asesoria {
   private String nombre;
   private String fechaNacimiento;
   private String run;


// Método constructor sin parámetros
   public Usuario() {
   }


   public Usuario(String nombre, String fechaNacimiento, String run) {
       this.nombre = nombre;
       this.fechaNacimiento = fechaNacimiento;
       this.run = run;
   }
   // Getters y setters
   public String getNombre() {
       return nombre;
   }
   // Validación para el largo del nombre, entre 10-50 caracteres.
   public void setNombre(String nombre) {
       if (nombre != "" && nombre.length() >= 10 && nombre.length() <= 50) {
           this.nombre = nombre;
       } else {
           throw new IllegalArgumentException("Ocurrió un error, el nombre ha de tener entre 10 y 50 carácteres.");
       }
   }
   public String getFechaNacimiento() {
       return fechaNacimiento;
   }
   // Validación para la fecha en el formato dd/MM/yyyy
   public void setFechaNacimiento(String fechaNacimiento) {
       try {
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
           LocalDate fechaNac = LocalDate.parse(fechaNacimiento, dtf);
           LocalDate fechaActual = LocalDate.now();
           
           // Calcular la diferencia en años entre la fecha de nacimiento y la fecha actual
           int edad = Period.between(fechaNac, fechaActual).getYears();
           
           if (edad > 149) {
               throw new IllegalArgumentException("La fecha de nacimiento no puede corresponder a una persona de más de 149 años.");
           }
           
           this.fechaNacimiento = fechaNacimiento;
       } catch (DateTimeParseException e) {
           throw new IllegalArgumentException("Ocurrió un error, la fecha debe tener el formato dd/MM/yyyy.");
       }
   }
   public String getRun() {
       return run;
   }
   // Validación para el RUN, debe ser un número válido y estar en el rango permitido de 0-99999999
   public void setRun(String run) {
       try {
           if (run == null || !run.matches("\\d+")) {
               throw new IllegalArgumentException("Ocurrió un error, el RUN debe ser un número válido.");
           }
          
           int runFormato = Integer.parseInt(run);
          
           if (runFormato > 0 && runFormato <= 99999999) {
               this.run = run;
           } else {
               throw new IllegalArgumentException("Ocurrió un error, el número debe estar entre 1 y 99.999.999.");
           }
       } catch (NumberFormatException e) {
           throw new IllegalArgumentException("Ocurrió un error, el RUN debe ser un número válido.");
       }
   }
   /**
    * Método validarDatos()
    *
    * Valida los datos de la instancia utilizando los setters.
    */
   private void validarDatos() {
       this.setNombre(this.nombre);
       this.setFechaNacimiento(this.fechaNacimiento);
       this.setRun(this.run);
   }
   /**
    * Método mostrarEdad()
    *
    * Calcula la edad del usuario basado en la fecha de nacimiento.
    * Devuelve un mensaje con la edad.
    */
   public String mostrarEdad() {
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       LocalDate nacimiento = LocalDate.parse(this.fechaNacimiento, formatter);
       int edad = Period.between(nacimiento, LocalDate.now()).getYears();
       return "El usuario tiene " + edad + " años.";
   }
   /**
    * Método analizarUsuario() de la interfaz Asesoria
    *
    * Indica el nombre del usuario con una descripción de su rol en la empresa
    * Hace uso de this instanceof para identificar la clase a la que se
    * refiere, y a partir de ahí imprimir el nombre de su cargo y nombre
    * */
   @Override
   public void analizarUsuario() {
       System.out.println("Nombre: " + this.nombre + ", RUN: " + this.run);
       if (this instanceof Cliente) {
           System.out.println("Rol: Cliente");
       } else if (this instanceof Profesional) {
           System.out.println("Rol: Profesional");
       } else if (this instanceof Administrativo) {
           System.out.println("Rol: Administrativo");
       }
   }
   // Método toString
   @Override
   public String toString() {
       return "Nombre: " + this.nombre + ", Fecha de Nacimiento: " + this.fechaNacimiento + ", RUN: " + this.run;
   }
}

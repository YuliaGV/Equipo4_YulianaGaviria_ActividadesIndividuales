/*
Ejercicio 1)
Vamos a crear una clase llamada Persona. Sus atributos son: id, nombre, edad, fecha de nacimiento y DNI. Construye los siguientes métodos para la clase:
Un constructor, donde los datos pueden estar vacíos.
Los setters y getters para cada uno de los atributos.
mostrar(): Muestra los datos de la persona.
esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad.

 */


import java.time.LocalDate;


public class Persona {

    private String id;
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;
    private String dni;



    //Constructores


    public Persona(){

    }
    public Persona(String id, String nombre, int edad, LocalDate fechaNacimiento, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }


    //Getters


    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    //Setters


    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //Mostrar datos
    public String mostrar(){
        return "Nombre: "+getNombre() +
                "\nEdad: "+getEdad() +
                "\nFecha de nacimiento: "+getFechaNacimiento() +
                "\nDNI: "+getDni();
    }


    //Indicar si es mayor de edad o no
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }


}

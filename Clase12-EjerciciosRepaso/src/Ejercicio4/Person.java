package Ejercicio4;

public abstract class Person {

    private String name;
    private String lastName;
    private String dni;



    //Constructor
    public Person(String name, String lastName, String dni) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;

    }


    //Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


}

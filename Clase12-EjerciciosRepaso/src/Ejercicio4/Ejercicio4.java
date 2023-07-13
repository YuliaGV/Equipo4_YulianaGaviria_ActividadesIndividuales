package Ejercicio4;

/*
Crear un programa para ingresar las notas de alumnos utilizando programación orientada a objetos:
El programa debe permitir al usuario cargar las notas de varios alumnos. Cada alumno debe tener atributos como nombre, apellido y una lista de notas.

 */

public class Ejercicio4 {

    public static void main(String[] args) {

        Teacher marc = new Teacher("Marc", "Johnson", "1020456321");
        Course inglés = new Course("Inglés A1", marc);

        Student tobias = new Student("Tobias", "Marín", "95123365");

        inglés.addStudent(tobias);

        inglés.addGrade(tobias, 4.5);

        System.out.println(inglés.getStudentList());
        System.out.println(inglés.getGrades());


    }


}

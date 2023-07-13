package Ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {


    private String name;
    private List<Student> studentList;

    private Teacher teacher;

    Map<String, Double> grades;




    //Constructor


    public Course(String name,Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.studentList = new ArrayList<>();
        this.grades= new HashMap<>();
    }



    //Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Double> grades) {
        this.grades = grades;
    }


//Methods

    public void addStudent(Student student){
        this.studentList.add(student);
    }

    public void addGrade (Student student, double grade){

        if(getStudentList().contains(student)) {
            this.grades.put(student.getDni(), grade);
        }
    }



}

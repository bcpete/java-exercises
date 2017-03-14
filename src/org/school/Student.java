package org.school;

/**
 * Created by Brady on 3/12/17.
 */
public class Student {

    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public String getName(){
        return name;
    }

    private void setName(String name){
        this.name = name;
    }

    public int getStudentId(){
        return studentId;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    private void setNumberOfCredits(int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa(){
        return gpa;
    }

    private void setGpa(double gpa){
        this.gpa = gpa;
    }

}

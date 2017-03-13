package org.school;

/**
 * Created by Brady on 3/12/17.
 */
public class Student {

    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
        this.numberOfCredits = numberOfCredits;
    }

    public String getName(){
        return name;
    }

    private void setName(String aName){
        name = aName;
    }

    public int getStudentId(){
        return studentId;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    private void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa(){
        return gpa;
    }

    private void setGpa(double aGpa){
        gpa = aGpa;
    }

}

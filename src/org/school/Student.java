package org.school;

/**
 * Created by Brady on 3/12/17.
 */
public class Student {

    public static final String FRESHMAN  = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR    = "Junior";
    public static final String SENIOR    = "Senior";

    private static int nextStudentId = 1;
    private double totalQualityScore;
    private String name;
    private final int studentId;
    private int numberOfCredits;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.totalQualityScore = gpa * numberOfCredits;
    }

    public Student(String name, int studentId){
        this(name, studentId, 0, 0);
    }

    public Student(String name){
        this(name, nextStudentId);
        nextStudentId++;
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
        double gpa = totalQualityScore / getNumberOfCredits();
        return gpa;
    }

    public void addGrade(int courseCredits, double grade){
        this.numberOfCredits += courseCredits;
        this.totalQualityScore += grade * courseCredits;
    }

    public String getGradeLevel(int numberOfCredits){
        if(numberOfCredits >=90){
            return SENIOR;
        }else if(numberOfCredits >=60){
            return JUNIOR;
        }else if(numberOfCredits >=30){
            return SOPHOMORE;
        }else {
            return FRESHMAN;
        }
    }

    @Override
    public String toString(){
        return name+ " (Credits :" + numberOfCredits
                + ", GPA: " + getGpa() +")";
    }

    public boolean equals(Student student) {
        return studentId == student.studentId;
    }

}

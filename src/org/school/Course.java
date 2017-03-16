package org.school;

import java.util.ArrayList;

/**
 * Created by Brady on 3/13/17.
 */
public class Course {
    private String name;
    private String courseNumber;
    private ArrayList<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString(){
        return name + " (Course Number :" + courseNumber
                + ", Students: " + getStudents() +")";
    }

    public boolean equals(Course course) {
        return name.equals(course.name);
    }
}

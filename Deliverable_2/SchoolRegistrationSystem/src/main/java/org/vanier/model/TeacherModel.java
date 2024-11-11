package org.vanier.model;

import java.util.List;

public class TeacherModel extends PersonModel{
    private List<CourseModel> coursesTeaching;

    public TeacherModel(String firstName, String lastName, String phoneNumber, String emailAddress, String password, List<CourseModel> coursesTeaching) {
        super(firstName, lastName, phoneNumber, emailAddress, password);
        this.coursesTeaching = coursesTeaching;
    }

    public List<CourseModel> getCoursesTeaching() {
        return coursesTeaching;
    }

    public void setCoursesTeaching(List<CourseModel> coursesTeaching) {
        this.coursesTeaching = coursesTeaching;
    }

    @Override
    public String toString() {
        return "TeacherModel{" +
                "coursesTeaching=" + coursesTeaching +
                '}';
    }
}

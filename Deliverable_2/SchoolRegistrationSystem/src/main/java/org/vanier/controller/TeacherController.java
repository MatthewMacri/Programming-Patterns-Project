package org.vanier.controller;

import org.vanier.model.TeacherModel;
import org.vanier.view.TeacherView;
import org.vanier.model.StudentModel;

public class TeacherController {
    private TeacherModel model;
    private TeacherView view;

    public TeacherController(TeacherModel model, TeacherView view) {
        view = new TeacherView();
        view.setVisible(true);
    }

    public void viewSchedule(StudentModel student) {

    }

    public void viewCourseDetails() {

    }

    public void logOut() {

    }

}

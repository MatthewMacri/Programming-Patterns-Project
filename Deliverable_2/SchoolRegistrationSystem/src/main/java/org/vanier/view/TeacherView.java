package org.vanier.view;

import org.vanier.view.teachersPanels.TeacherLoginPage;
import org.vanier.view.teachersPanels.TeacherMainMenuPage;
import org.vanier.view.teachersPanels.TeacherViewCourseDetailsPage;
import org.vanier.view.teachersPanels.TeacherViewSchedulePage;

import javax.swing.*;
import java.awt.*;

public class TeacherView extends JFrame {
    private JPanel mainPanel;
    private CardLayout cardLayout;

    private TeacherLoginPage teacherLoginPage;
    private TeacherMainMenuPage teacherMainMenuPage;
    private TeacherViewCourseDetailsPage teacherManageCoursesPage;
    private TeacherViewSchedulePage teacherViewSchedulePage;

    public TeacherView() throws HeadlessException {
        setTitle("Teacher Portal");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        teacherLoginPage = new TeacherLoginPage();
        teacherMainMenuPage = new TeacherMainMenuPage();
        teacherManageCoursesPage = new TeacherViewCourseDetailsPage();
        teacherViewSchedulePage = new TeacherViewSchedulePage();

//        mainPanel.add(teacherLoginPage.getTeacherLoginPanel(), "login");
//        mainPanel.add(teacherMainMenuPage.getTeacherMainMenuPanel(), "mainMenu");
//        mainPanel.add(teacherManageCoursesPage.getTeacherManageCoursesPanel(), "manageCourses");
//        mainPanel.add(teacherViewSchedulePage.getTeacherViewSchedulePanel(), "viewSchedule");

        add(mainPanel);
    }

    public void showPanel(String panelName) {
        cardLayout.show(mainPanel, panelName);
    }

    public void showLoginPanel() {
        cardLayout.show(mainPanel, "login");
    }

    public void showMainMenuPanel() {
        cardLayout.show(mainPanel, "mainMenu");
    }

    public void showManageCoursesPanel() {
        cardLayout.show(mainPanel, "manageCourses");
    }

    public void showViewSchedulePanel() {
        cardLayout.show(mainPanel, "viewSchedule");
    }

    public TeacherLoginPage getTeacherLoginPage() {
        return teacherLoginPage;
    }

    public TeacherMainMenuPage getTeacherMainMenuPage() {
        return teacherMainMenuPage;
    }

    public TeacherManageCoursePage getTeacherManageCoursesPage() {
        return teacherManageCoursesPage;
    }

    public TeacherViewSchedulePage getTeacherViewSchedulePage() {
        return teacherViewSchedulePage;
    }
}

package sg.edu.rp.c346.p03classjournal;

import java.io.Serializable;

public class Lesson implements Serializable {
    private String grade;
    private int week;

    public String getGrade() {

        return grade;
    }
    public int getWeek() {

        return week;
    }
    public Lesson(String grade, int week) {
        this.grade = grade;
        this.week = week;
    }

}
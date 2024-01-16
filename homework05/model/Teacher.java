package homework05.model;

import java.util.Date;

public class Teacher extends User{
    private static int studentIdTeacher = 1;
    private int idTeacher;

    public Teacher(String name, int age) {
        super(name, age);
        this.idTeacher = studentIdTeacher++;
    }

    public int getIdTeacher() {
        return idTeacher;
    }
}

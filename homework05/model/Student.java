package homework05.model;

import java.util.Date;

public class Student extends User{
    private static int studentIdCounter = 1;
    private int idStudent;

    public Student(String name, int age) {
        super(name, age);
        this.idStudent = studentIdCounter++;
    }

    public int getIdStudent() {
        return idStudent;
    }
}

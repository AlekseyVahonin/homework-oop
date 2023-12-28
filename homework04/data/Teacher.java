package homework04.data;

public class Teacher extends User{
    private String schoolSubject;
    private int idTeacher;
    public Teacher(String surname, String firstname, String patronymic, String schoolSubject) {
        super(surname, firstname, patronymic);
        this.schoolSubject = schoolSubject;
    }
    public String getSchoolSubject() {
        return schoolSubject;
    }

    public void setSchoolSubject(String schoolSubject) {
        this.schoolSubject = schoolSubject;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    @Override
    public String toString() {
        return String.format("id-%d %s %s %s %s",
                this.idTeacher, super.getSurname(), super.getFirstname(), super.getPatronymic(), schoolSubject);
    }
}

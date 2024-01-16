package homework05.view;

import homework05.model.Student;
import homework05.model.StudyGroup;
import homework05.model.Teacher;

import java.util.List;

public class StudyGroupView {

    public String displayStudyGroupInfo(StudyGroup studyGroup) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Преподаватель\n");
        stringBuilder.append("id=");
        stringBuilder.append(studyGroup.getTeacher().getIdTeacher());
        stringBuilder.append(", ");
        stringBuilder.append(studyGroup.getTeacher().getName());
        stringBuilder.append(", ");
        stringBuilder.append(studyGroup.getTeacher().getAge());
        stringBuilder.append(" лет");
        stringBuilder.append("\nСписок студентов\n");
        for (Student student : studyGroup.getStudents()) {
            stringBuilder.append("id=");
            stringBuilder.append(student.getIdStudent());
            stringBuilder.append(", ");
            stringBuilder.append(student.getName());
            stringBuilder.append(", ");
            stringBuilder.append(student.getAge());
            stringBuilder.append(" лет");
            stringBuilder.append("\n");
        }
        stringBuilder.append("--------------------------------------------------------");
        return stringBuilder.toString();
    }
}

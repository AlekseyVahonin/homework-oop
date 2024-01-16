package homework05;

import homework05.controller.Controller;
import homework05.model.Student;
import homework05.model.StudyGroup;
import homework05.model.Teacher;
import homework05.service.StudyGroupService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Преподаватель Семен", 40);
        List<Student> students = List.of(
                new Student("Студент Маша", 17),
                new Student("Студент Паша", 19),
                new Student("Студент Саша", 20));

        Controller controller = new Controller();

        StudyGroup studyGroup = controller.createAndReturnStudyGroup(teacher, students);
        controller.printStudyGroupInfo(studyGroup);
    }
}

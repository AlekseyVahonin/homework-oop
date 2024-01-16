package homework05.service;

import homework05.model.Student;
import homework05.model.StudyGroup;
import homework05.model.Teacher;
import homework05.model.User;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }

}

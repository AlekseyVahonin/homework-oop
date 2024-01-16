package homework05.controller;

import homework05.model.Student;
import homework05.model.StudyGroup;
import homework05.model.Teacher;
import homework05.service.StudyGroupService;
import homework05.view.StudyGroupView;

import java.util.List;

public class Controller {
    private StudyGroupService studyGroupService;
    private StudyGroupView studyGroupView;

    public Controller() {
        this.studyGroupService = new StudyGroupService();
        this.studyGroupView = new StudyGroupView();
    }

    public StudyGroup createAndReturnStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.createStudyGroup(teacher, students);
    }
    public void printStudyGroupInfo(StudyGroup studyGroup) {
        System.out.println(studyGroupView.displayStudyGroupInfo(studyGroup));
    }
}

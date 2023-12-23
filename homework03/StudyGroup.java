package homework03;

/**
 * Класс для создания группы студентов
 */
public class StudyGroup {
    private String groupName;
    private int countStudents;

    public StudyGroup(String groupName, int countStudents) {
        this.groupName = groupName;
        this.countStudents = countStudents;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getCountStudents() {
        return countStudents;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setCountStudents(int countStudents) {
        this.countStudents = countStudents;
    }

    @Override
    public String toString() {
        return String.format("%s - %d студентов", groupName, countStudents);
    }
}

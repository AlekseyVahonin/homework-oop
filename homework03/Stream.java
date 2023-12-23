package homework03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable
 */

public class Stream<StudyGroup> implements Iterable<StudyGroup> {
    List<StudyGroup> studyGroup = new ArrayList<>();

    public void addGroup(StudyGroup group) {
        studyGroup.add(group);
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return studyGroup.iterator();
    }

    @Override
    public String toString() {
        return String.format("Количество групп - %d шт", studyGroup.size());
    }
}

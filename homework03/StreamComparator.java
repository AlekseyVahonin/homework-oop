package homework03;

import java.util.Comparator;

/**
 * Класс StreamComparator, реализующий сравнение количества групп в разных потоках
 */

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream stream1, Stream stream2) {
        return Integer.compare(stream1.studyGroup.size(), stream2.studyGroup.size());
    }
}

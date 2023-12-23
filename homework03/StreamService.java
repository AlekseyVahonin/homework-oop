package homework03;

import java.util.Collections;
import java.util.List;

/**
 * Класс ПотокСервис, сортирует список потоков, используя StreamComparator
 */

public class StreamService {
    public boolean sortStream(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
        return false;
    }
}
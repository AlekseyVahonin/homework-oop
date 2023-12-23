package homework03;

import java.util.List;

/**
 * Класс Контроллер, сортирует список потоков, путём вызова созданного сервиса
 */

public class Controller {
    private StreamService streamService;

    public Controller(StreamService streamService) {
        this.streamService = streamService;
    }

    public void sortStream(List<Stream> streams) {
        streamService.sortStream(streams);
    }
}

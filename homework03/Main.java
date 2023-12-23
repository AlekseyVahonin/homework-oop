package homework03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * Тест заполнения списка потока группами студентов и вывод групп в потоке в консоль
         */
        Stream<StudyGroup> stream = new Stream<>();
        stream.addGroup(new StudyGroup("Группа 1", 5));
        stream.addGroup(new StudyGroup("Группа 2", 10));
        stream.addGroup(new StudyGroup("Группа 3", 15));
        System.out.println("================================================================");
        for (StudyGroup group : stream) {
            System.out.println(group);
        }
        System.out.println("================================================================");


        /**
         * Тест сравнения количества групп в разных потоках
         * 1 количество групп в потоке1 больше чем в потоке2
         * 0 количество групп в потоке1 и в потоке2 равны
         * -1 количество групп в потоке2 больше чем в потоке1
         */
        Stream<StudyGroup> stream1 = new Stream<>();
        stream1.addGroup(new StudyGroup("Группа 4", 5));
        stream1.addGroup(new StudyGroup("Группа 5", 27));
        stream1.addGroup(new StudyGroup("Группа 6", 3));

        Stream<StudyGroup> stream2 = new Stream<>();
        stream2.addGroup(new StudyGroup("Группа 7", 9));
        stream2.addGroup(new StudyGroup("Группа 8", 8));
        stream2.addGroup(new StudyGroup("Группа 8", 8));
        stream2.addGroup(new StudyGroup("Группа 8", 8));

        StreamComparator streamComparator = new StreamComparator();
        System.out.println(streamComparator.compare(stream1, stream2));
        System.out.println("================================================================");


        /**
         * Тест сортировки списка потоков по количеству групп через StreamService и через Controller
         */
        Stream<StudyGroup> stream4 = new Stream<>();
        stream4.addGroup(new StudyGroup("Группа 4", 5));
        stream4.addGroup(new StudyGroup("Группа 5", 27));
        stream4.addGroup(new StudyGroup("Группа 6", 3));

        Stream<StudyGroup> stream5 = new Stream<>();
        stream5.addGroup(new StudyGroup("Группа 7", 9));
        stream5.addGroup(new StudyGroup("Группа 8", 8));
        stream5.addGroup(new StudyGroup("Группа 8", 8));
        stream5.addGroup(new StudyGroup("Группа 8", 8));

        Stream<StudyGroup> stream6 = new Stream<>();
        stream6.addGroup(new StudyGroup("Группа 7", 9));

        List<Stream> streams = new ArrayList<>();
        streams.add(stream4);
        streams.add(stream5);
        streams.add(stream6);

        /**
         * Тест сортировки через StreamService
         */
//        StreamService streamService = new StreamService();
//        streamService.sortStream(streams);
//        System.out.println(streams);
//        System.out.println("================================================================");


        /**
         * Тест сортировки через Controller
         */
        Controller controller = new Controller(new StreamService());
        controller.sortStream(streams);
        System.out.println(streams);
        System.out.println("================================================================");
    }
}

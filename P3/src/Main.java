import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        {
            stringList.add("Lorem");
            stringList.add("ipsum");
            stringList.add("dolor");
            stringList.add("sit");
            stringList.add("amet");
            stringList.add("consectetur");
            stringList.add("adipiscing");
            stringList.add("elit");
            stringList.add("Lorem");
            stringList.add("ipsum");
            stringList.add("dolor");
            stringList.add("sit");
            stringList.add("amet");
            stringList.add("consectetur");
            stringList.add("adipiscing");
            stringList.add("elit");
            stringList.add("Lorem");
            stringList.add("ipsum");
            stringList.add("dolor");
            stringList.add("sit");
            stringList.add("amet");
            stringList.add("consectetur");
            stringList.add("adipiscing");
            stringList.add("elit");
        } // dodawanie ręczne elemwntów do tablicy

        // Przykład zwykłego strumienia (stream)
        long streamStartTime = System.currentTimeMillis();
        stringList.stream()
                .forEach(System.out::println);
        long streamEndTime = System.currentTimeMillis();
        long streamExecutionTime = streamEndTime - streamStartTime;
        System.out.println("Czas wykonania strumienia (stream): " + streamExecutionTime + " ms");

        // Przykład równoległego strumienia (parallelStream)
        long parallelStreamStartTime = System.currentTimeMillis();
        stringList.parallelStream()
                .forEach(System.out::println);
        long parallelStreamEndTime = System.currentTimeMillis();
        long parallelStreamExecutionTime = parallelStreamEndTime - parallelStreamStartTime;
        System.out.println("Czas wykonania równoległego strumienia (parallelStream): " + parallelStreamExecutionTime + " ms");
    }
}

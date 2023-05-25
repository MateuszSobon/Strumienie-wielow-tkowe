import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    //funkcja generuje losowe napisy
    public static List<String> generateRandomStrings(int count, int length) {

        List<String> randomStrings = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < count; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < length; j++) {
                char randomChar = (char) (random.nextInt(26) + 'a');
                sb.append(randomChar);
            }
            randomStrings.add(sb.toString());
        }

        return randomStrings;
    }
    //funkcja sortuje i zamienia w liste za pomoca strumienia
    public static List<String> sort(List<String> stringsToSort) {

        List<String> sortedList = stringsToSort.stream()
                .filter(x-> x.contains("ala"))
                .sorted()
                .collect(Collectors.toList());

        return sortedList;
    }
    //funkcja sortuje i zamienia w liste za pomoca strumienia równoległego
    public static List<String> sortParell(List<String> stringsToSort) {

        List<String> sortedList = stringsToSort.parallelStream()
                .filter(x-> x.contains("ala"))
                .sorted()
                .collect(Collectors.toList());
        return sortedList;
    }
    public static void main(String[] args) {

        List<String> randomStrings = generateRandomStrings(45000000, 10);

        System.out.println(randomStrings);

        long startTime = System.currentTimeMillis();// licze czas pracy funkcji
        sort(randomStrings);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        long startTime2 = System.currentTimeMillis();// licze czas pracy funkcji2
        sortParell(randomStrings);
        long endTime2 = System.currentTimeMillis();
        long executionTime2 = endTime2 - startTime2;

        System.out.println("Czas wykonania: " + executionTime + " ms");
        System.out.println("Czas wykonania Parell: " + executionTime2 + " ms");
    }
}

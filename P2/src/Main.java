import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // tworze liczby całkowitego
        List<Integer> liczby = generuj(80000000);

        // zamiana na typ intiger i działania na strumieniu
        long startTime = System.currentTimeMillis();
        int sum = liczby.stream()
                .filter(x-> x % 2 ==0)
                .mapToInt(Integer::intValue)
                .sum();
        long EndTime = System.currentTimeMillis();
        long time = EndTime - startTime;

        // zamiana na typ intiger i działania na strumieniu równolegle




        long startTime2 = System.currentTimeMillis();
        int sum2 = liczby.parallelStream()
                .filter(x-> x % 2 ==0)
                .mapToInt(Integer::intValue)
                .sum();
        long endTime2 = System.currentTimeMillis();
        long time2 = endTime2 - startTime2;

        // Wyświetlanie wyników
        System.out.println("Suma wartości: " + sum);
        System.out.println("Czas wykonania stream: " + time + " ms");
        System.out.println("Suma wartości " + sum2);
        System.out.println("Czas wykonania parell: " + time2 + " ms");
    }
    // Metoda do generowania listy losowych liczb całkowitych
    private static List<Integer> generuj(int count) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(4000));
        }
        return numbers;
    }
}

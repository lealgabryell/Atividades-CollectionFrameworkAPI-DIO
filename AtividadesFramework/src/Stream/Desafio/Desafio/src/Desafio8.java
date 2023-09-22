import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    List<Integer> numeros = Arrays.asList(1, -1, 0, -16, 12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -5);

    int somaTudo = numeros.stream()
            .mapToInt(Integer::intValue)
            .sum();
}

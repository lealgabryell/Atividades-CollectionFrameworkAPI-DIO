import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio9{
    List<Integer> numeros = Arrays.asList(1, -1, 0, -16, 12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -5);

    Map<Integer, Long> contagem = numeros.stream()
        .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

    // Verifique quais números têm contagem maior que 1 (repetidos)
    List<Integer> numerosRepetidos = contagem.entrySet().stream()
        .filter(entry -> entry.getValue() > 1)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());

    boolean temRepetidos = !numerosRepetidos.isEmpty();
}


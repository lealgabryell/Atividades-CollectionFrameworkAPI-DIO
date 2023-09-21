import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio7 {
        List<Integer> numeros = Arrays.asList(1, -1, 0, -16, 12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -5);

        List<Integer> numerosEmOrdem = numeros.stream()
            .sorted()
            .collect(Collectors.toList());
        int segundoMaior = numerosEmOrdem.get(numerosEmOrdem.size()-2);
}

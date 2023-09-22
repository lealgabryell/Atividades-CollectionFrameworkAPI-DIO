import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio10 {
    List<Integer> numeros = Arrays.asList(1, -1, 0, -16, 12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -5);

    List<Integer> multiplosTresCinco = numeros.stream()
            .filter(numero -> numero % 3 == 0 || numero % 5 == 0)
            .collect(Collectors.toList());
    List<Integer> multiplosImpares = multiplosTresCinco.stream()
            .filter(numero -> numero % 2 != 0)
            .collect(Collectors.toList());

}

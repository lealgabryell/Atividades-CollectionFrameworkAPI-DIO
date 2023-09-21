import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio5 {
    List<Integer> numeros = Arrays.asList(1, -1, 0, -16, 12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -5);

    //criar uma lista com numeros maiores que 5
    List<Integer> maioresQueCinco = numeros.stream()
        .filter(numero -> numero> 5)
        .collect(Collectors.toList());
    int somaMaioresQueCinco = maioresQueCinco.stream()
    .mapToInt(Integer::intValue)    
    .sum();

    int media = somaMaioresQueCinco/maioresQueCinco.size();
}





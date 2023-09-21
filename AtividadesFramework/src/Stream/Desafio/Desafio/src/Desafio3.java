import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio3 {
   List<Integer> numeros = Arrays.asList(1, -1, 0, -16, 12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -5);
      List<Integer> numerosPositivos = numeros.stream()
      .filter(numero -> numero>0)
      .collect(Collectors.toList());
      
      
}

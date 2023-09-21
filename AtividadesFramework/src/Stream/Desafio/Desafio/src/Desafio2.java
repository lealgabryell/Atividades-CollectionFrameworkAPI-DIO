import java.util.Arrays;
import java.util.List;

public class Desafio2 {
     List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    
     int somaPares = numeros.stream()
        .filter(numero -> numero %2 == 0) //pegar apenas os pares
        .mapToInt(Integer::intValue) //pegar esses caracteres que foram aceitos na condicao e transformar em Int
        .sum(); //somar todos os numero que foram transformados em int e guardar na variavel somaPares
}

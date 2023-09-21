import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio6 {
    List<Integer> numeros = Arrays.asList(1, -1, 0, -16, 12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -5);
    List<Integer> maiorQueDez = numeros.stream()
    .filter(numero -> numero > 10)
    .collect(Collectors.toList());

    public boolean checar(){
        boolean checagem;
        if(maiorQueDez.isEmpty()){
            checagem = false;
        }else{
            checagem = true;
        }
        return checagem;
    }
}

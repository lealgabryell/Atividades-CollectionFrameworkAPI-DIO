package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo
    private static List<Pessoa> pessoaList;
    
    public OrdenacaoPessoa(){
        OrdenacaoPessoa.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;      
    }

    public List<Pessoa> ordernarPorAltura(){
            List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
    }


    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome2", 30, 1.81);
        ordenacaoPessoa.adicionarPessoa("Nome3", 25, 1.78);
        ordenacaoPessoa.adicionarPessoa("Nome4", 17, 1.56);
        /*
        for(Pessoa i:ordenacaoPessoa.ordernarPorAltura()){
           i.imprimirPessoa();
        }
        */
        for (Pessoa i:ordenacaoPessoa.ordenarPorIdade()){
            i.imprimirPessoa();
        }
        }
    
}

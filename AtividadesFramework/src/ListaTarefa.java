import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // atributo
    private List<Tarefa> tarefaList;

    // criar um construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) { // t = index
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        for (Tarefa i : tarefaList){
        System.out.println(i.getDescricao());
        }
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista eh: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O numero total de elementos na lista eh: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 3");
        System.out.println("O numero total de elementos na lista eh: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}

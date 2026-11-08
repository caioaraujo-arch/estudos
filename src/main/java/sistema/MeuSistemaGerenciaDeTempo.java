package sistema;
import java.util.ArrayList;
import java.util.List;

public class MeuSistemaGerenciaDeTempo implements SistemaGerenciaDeTempo {
    private List<Tarefa> tarefas;

    public MeuSistemaGerenciaDeTempo() {
        this.tarefas = new ArrayList<>();
    }


    public List<Tarefa> pesquisarTarefasDaCategoria(String categoria) {
        List<Tarefa> tarefasPesq = new ArrayList<>();
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getCategoria().equals(categoria)) {
                tarefasPesq.add(tarefa);
            }
        }
        return tarefasPesq;
    }
}
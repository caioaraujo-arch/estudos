package sistema;
import java.util.List;

public interface SistemaGerenciaTempo {
    public void cadastrarTarefa(String descricao, String categoria, int tempoMinutos);
    public List<Tarefa> pesquisarTarefasDaCategoria(String categoria);
    public List<Tarefa> pesquisarTarefasQueDuramMaisDe(int tempoMinutos);
    public int calcularTempoTotalDeTarefasDaCategoria(String categoriaTarefa);
    public int calcularTempoTotalDeTarefasComDescricao(String descricaoTarefa);
    public List<Tarefa> pesquisarTarefasPorDescricao(String descricao);


}

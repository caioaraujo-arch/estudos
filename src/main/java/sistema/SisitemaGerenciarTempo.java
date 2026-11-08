package sistema;
import java.util.List;

public interface SisitemaGerenciarTempo {
    public void cadastrarTarefas(String descricao, String categoria, int tempoMinutos);
    public List<Tarefas> pesquisarTarefasDaCategoria(String categoria);
    public List<Tarefa> procurarTarefasQueDuramMaisDe(int tempoMinitos);
    public int calcularTempoTotalDeTarefasDaCategoria(String categoriaTarefa);
    public int calcularTempoTotalDeTarefasComDescricao(String descricaoTarefa);
    public List<Tarefa> pesquisarTarefaPorDescricao(String descricao);


}

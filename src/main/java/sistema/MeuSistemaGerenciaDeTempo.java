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
    public void cadastrarTarefa(String descricao, String categoria, int tempoTarefaEmMinutos){
        Tarefa tarefa = new Tarefa(descricao,categoria,tempoTarefaEmMinutos);
        this.tarefas.add(tarefa);
    }
    public int calcularTempoTotalDeTarefasComDescricao(String descricao) {
        int total = 0;
        for (Tarefa daVez : this.tarefas) {
            if (daVez.getDescricao().equals(descricao)) {
                total += daVez.getTempotarefaEmMinutos();
            }
        }
        return total;
    }
    public int calcularTempoTotalDeTarefasDaCategoria(String categoria){
        int totalTempo = 0;
        for (Tarefa tarefaDaVez : this.tarefas){
           if (tarefaDaVez.getCategoria().equals(categoria)){
               totalTempo+= tarefaDaVez.getTempotarefaEmMinutos();
           }
        }


        return totalTempo;
    }
    public List<Tarefa> pesquisarTarefasQueDuraramMaisDe(int tempoMAX){
        List<Tarefa> tarefalist= new ArrayList<>();
        for(Tarefa l : this.tarefas){
            if(l.getTempotarefaEmMinutos()>tempoMAX){
                tarefalist.add(l);
            }
        }
        return tarefalist;

    }
    public List<Tarefa> pesquisarTarefasPorDescricao( String descricao){
        List<Tarefa> tarefaPesqDescricao = new ArrayList<>();
        for(Tarefa j : this.tarefas){
            if(j.getDescricao().equals(descricao)){
                tarefaPesqDescricao.add(j);
            }
        }


        return tarefaPesqDescricao;
    }
}
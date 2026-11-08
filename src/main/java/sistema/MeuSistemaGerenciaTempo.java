package sistema;
import java.util.ArrayList;
import java.util.List;

public class MeuSistemaGerenciaTempo implements SisitemaGerenciarTempo{
    private List<Tarefa> tarefas;
    public MeuSistemaGerenciaTempo(){
        this.tarefas= new ArrayList<>();
    }
    public List<Tarefa> pesquisarTarefaDaCategoria(String categoria) {
        List<Tarefa> tarefapesq = new ArrayList<>();
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getCategoria().equals(categoria)) {
                tarefapesq.add(tarefa);
            }
        }
        return tarefapesq;
    }
}
public class TestaMeuSistemaGerenciaTempo{
    public static void main (String[] args){
        SistemaGerenciaTempo sistema =new ArrayList<>();
        sitema.cadastrarTarefas("Estudar LP","Estudo", 1200);
        sitema.cadastrarTarefa("EStudar LP","Estudo",80);
        sistema.cadastrarTarefas("Estudar LP","Estudo",60);
        System.out.println(sistema.calcularTempoTotalDeTarefasPorDescricao("Estudar LP"));
        List<Tarefa> tarefasEstudo= sistema.pesquisarTarefasDaCategoria("Estudo");
        for(Tarefa f :tarefasEstudo){
            System.out.println(f.toString());
        }
    }

}
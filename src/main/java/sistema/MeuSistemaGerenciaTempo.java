package sistema;
import java.util.ArrayList;
import java.util.List;

public class TestaMeuSistemaGerenciaTempo{
    public static void main (String[] args){
        SistemaGerenciaTempo sistema =new MeuSistemaGerenciaTempo();
        sitema.cadastrarTarefa("Estudar LP","Estudo", 1200);
        sitema.cadastrarTarefa("EStudar LP","Estudo",80);
        sistema.cadastrarTarefa("Estudar LP","Estudo",60);
        System.out.println(sistema.calcularTempoTotalDeTarefasComDescricao("Estudar LP"));
        List<Tarefa> tarefasEstudo= sistema.pesquisarTarefasDaCategoria("Estudo");
        for(Tarefa f :tarefasEstudo){
            System.out.println(f.toString());
        }
    }


}
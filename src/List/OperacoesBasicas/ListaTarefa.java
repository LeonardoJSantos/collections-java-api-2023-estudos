package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasPraRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if(t.getDecricao().equalsIgnoreCase(descricao)){
                tarefasPraRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasPraRemover);
    }
    public int obterNumeroDeTarefas(){
        return tarefaList.size();
    }
    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }


}

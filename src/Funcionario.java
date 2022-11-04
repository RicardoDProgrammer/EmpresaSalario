import java.util.List;

public class Funcionario {
    String nome;
    int salario;
    List<Tarefa> tarefas;

    public Funcionario(String nome, int salario, List<Tarefa> tarefas) {
        this.nome = nome;
        this.salario = 505;
    }

    void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    public String getNome() {
        return nome;
    }

    public int getSalario() {
        return salario;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }
}

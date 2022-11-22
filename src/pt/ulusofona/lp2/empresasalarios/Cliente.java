package pt.ulusofona.lp2.empresasalarios;

import java.util.ArrayList;

public class Cliente {
    String nome;
    int contacto;
    int nif;
    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public Cliente(String nome, int contacto, int nif) {
        this.nome = nome;
        this.contacto = contacto;
        this.nif = nif;
    }

    public void adicionartarefa(Tarefa t){
        tarefas.add(t);
    }

    public int calcularCusto(){
        int numHoras = 0;
        for (Tarefa tarefa : tarefas) {
            numHoras =+ tarefa.getNumHoras();
        }
        return 500 + 10 * numHoras;
    }
}

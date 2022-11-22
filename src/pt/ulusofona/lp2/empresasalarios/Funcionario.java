package pt.ulusofona.lp2.empresasalarios;

import java.util.ArrayList;

public class Funcionario {
    String nome;
    ArrayList<Tarefa> tarefas;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public int calcularSalario() {
        int salario = 0;
        if(tarefas.size() == 0){
            return 505;
        }else{
            int bonus = 0;
            if(tarefas.size() > 10 && calcularHoras() <= 50){
                for(int i = 5; i < tarefas.size(); i++){
                    bonus++;
                }
            }

            salario = 505 + 2*calcularHoras() + bonus;
        }

        return salario;
    }

    public int calcularHoras(){
        int numHoras = 0;
        for (Tarefa tarefa : tarefas) {
            numHoras += tarefa.getNumHoras();
        }
        return numHoras;
    }
}

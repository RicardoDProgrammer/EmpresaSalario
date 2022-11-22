package pt.ulusofona.lp2.empresasalarios;

public class Tarefa {
    String descricao;
    int numHoras;

    public Tarefa(String nome) {
        this.descricao = nome;
        this.numHoras = 0;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    boolean terminarTarefa(int duracao){
        return false;
    }
}

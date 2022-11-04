public class Tarefa {
    String nome;
    int numHoras;

    public Tarefa(String nome, int numHoras) {
        this.nome = nome;
        this.numHoras = numHoras;
    }

    public String getNome() {
        return nome;
    }

    public int getNumHoras() {
        return numHoras;
    }
}

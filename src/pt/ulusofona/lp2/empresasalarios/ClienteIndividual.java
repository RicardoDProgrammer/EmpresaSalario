package pt.ulusofona.lp2.empresasalarios;

public class ClienteIndividual extends Cliente{

    public ClienteIndividual(String nome, int contacto, int nif) {
        super(nome, contacto, nif);
    }

    protected  String[] obtemInfo(){
        return null;
    }

    @Override
    public String toString() {
        return nome + " | " + contacto + " | " + nif + "(Ind)";
    }
}
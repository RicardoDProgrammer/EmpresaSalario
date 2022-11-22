package pt.ulusofona.lp2.empresasalarios;

public class ClienteEmpresarial extends Cliente{
    String nomeResponsavel;
    int telefoneResponsavel;

    public ClienteEmpresarial(String nome, int contacto, int nif, String nomeResponsavel, int telefoneResponsavel) {
        super(nome, contacto, nif);
        this.nomeResponsavel = nomeResponsavel;
        this.telefoneResponsavel = telefoneResponsavel;
    }

    protected String[] obtemInfo(){
        return null;
    }

    @Override
    public String toString() {
        return nome + " | " + contacto + " | " + nif + " | " + nomeResponsavel + " | " + telefoneResponsavel + "(Emp)";
    }
}
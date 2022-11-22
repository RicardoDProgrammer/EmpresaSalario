package pt.ulusofona.lp2.empresasalarios;

import java.util.ArrayList;

public class Empresa {
    String nome;
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    ArrayList<ClienteIndividual> clientesSingulares = new ArrayList<>();
    ArrayList<ClienteEmpresarial> clientesEmpresas = new ArrayList<>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public void adicionarClienteInd(ClienteIndividual cliente){
        clientesSingulares.add(cliente);
    }

    public void adicionarClienteIEmp(ClienteEmpresarial cliente){
        clientesEmpresas.add(cliente);
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public ArrayList<ClienteIndividual> getClientesSingulares() {
        return clientesSingulares;
    }

    public ArrayList<ClienteEmpresarial> getClientesEmpresas() {
        return clientesEmpresas;
    }
}

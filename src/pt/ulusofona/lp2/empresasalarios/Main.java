package pt.ulusofona.lp2.empresasalarios;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    static void registarCliente(Empresa emp, ClienteEmpresarial cliente){
        emp.adicionarClienteIEmp(cliente);
    }

    static void registarCliente(Empresa emp, ClienteIndividual cliente){
        emp.adicionarClienteInd(cliente);
    }

    static void registarEncomenda(Empresa empresa, ClienteEmpresarial cliente, Tarefa t){
        for (ClienteEmpresarial clienteEmp : empresa.getClientesEmpresas()) {
            if(clienteEmp == cliente){
                clienteEmp.adicionartarefa(t);
            }
        }
    }

    static void registarEncomenda(Empresa empresa, ClienteIndividual cliente, Tarefa t) {
        for (ClienteIndividual clienteInd : empresa.getClientesSingulares()) {
            if (clienteInd == cliente) {
                clienteInd.adicionartarefa(t);
            }
        }
    }

    static ArrayList<ClienteEmpresarial> getClientesEmpresariais(Empresa empresa){
        return  empresa.getClientesEmpresas();
    }

    static ArrayList<ClienteIndividual> getClientesIndividuais(Empresa empresa){
        return empresa.getClientesSingulares();
    }

    static ArrayList<String> obterListaClientes(Empresa emp){
        ArrayList<String> clientesInfo = new ArrayList<>();
        for (ClienteEmpresarial cliente : emp.getClientesEmpresas()) {
            clientesInfo.add(cliente.toString());
        }

        for (ClienteIndividual cliente : emp.getClientesSingulares()) {
            clientesInfo.add(cliente.toString());
        }
        return clientesInfo;
    }

    static ArrayList<String> relatorioEncomendasMensais(Empresa e, String mes){
        return null;
    }

    static Empresa obterUmaEmpresa(){
        return null;
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa("XPTO");

    }
}

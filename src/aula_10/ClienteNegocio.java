/*
 * Criar uma classe "Cliente" conforme diagrama de classe (nome, email, salario , telefone)
 * - criar uma classe "ClienteNegocio", criar um metodo para gerar a lista de clientes, um metodo que receba uma lista de clientes e retorne a soma de todos os salarios dos clientes
 * - um metodo que receba uma lista de clienets e retorne o cliente com o menor salario e outro metodo que retorne cliente com o maior salario
 * - criar uma classe de "TesteCliente" onde carregue a lista de cliente e depois mostre o total de salario da lista de cliente e o cliente que tenha maior e menor salario.
 */
package aula_10;

import java.util.ArrayList;
import java.util.List;
import util.UtilGerador;

/**
 *
 * @author david.maria
 */
public class ClienteNegocio {

    //para não precisar digitar 10 objetos clientes
    public List<Cliente> gerarListaCliente() {
        Cliente cliente01; //objeto 
        List<Cliente> clientes = new ArrayList<>(); 
       
        int qtdCliente = UtilGerador.criarNumeroAleatorioEntre2Valores(1, 10);
       
        for (int i = 0; i < qtdCliente; i++) {
            cliente01 = new Cliente( //criado objeto
                    UtilGerador.gerarNome(6),
                    UtilGerador.gerarEmail(6, "senac"),
                    UtilGerador.gerarTelefone(),
                    UtilGerador.gerarNumInteiro(4)
            );
            clientes.add(cliente01);
        }
        return clientes;
    }

    public double somarSalarios(List<Cliente> clientes) {
        double totalSalario = 0;
        for (Cliente cliente : clientes) {
            totalSalario += cliente.getSalario();
        }
        return totalSalario;
    }

    /**
     * Este metodo verifica o maio salário.
     * @param clientes
     * @return cliente
     */
    public Cliente pesquisarClienteMaiorSalario(List<Cliente> clientes) {
        Cliente cliente = clientes.get(0);
        for (Cliente cliente1 : clientes) {
            if (cliente.getSalario() < cliente1.getSalario()) {
                cliente = cliente1;
            }
        }
        return cliente;
    }
    
     public Cliente pesquisarClienteMenorSalario(List<Cliente> clientes) {
        Cliente cliente = clientes.get(0);
        for (Cliente cliente1 : clientes) {
            if (cliente.getSalario() > cliente1.getSalario()) {
                cliente = cliente1;
            }
        }
        return cliente;
    }
     
     
     

}

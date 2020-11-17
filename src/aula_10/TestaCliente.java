/*
 * Criar uma classe "Cliente" conforme diagrama de classe (nome, email, salario , telefone)
- criar uma classe "ClienteNegocio", onde tenha um metodo que receba uma lista de clientes e mostre a soma de todos os salarios dos clientes
- um metofo que receba uma lista de clienets e retorne o cliente com o menor salario e outro metodo que retorne cliente com o maior salario
- criar uma classe de "TesteCliente" onde carregue a lista de cliente e depois mostre o total de salario da lista de cliente e um metodo que retorne o cliente que tenha maior e menor salario.
 */
package aula_10;

import java.util.List;

/**
 * POO - Faculdade Palhoça Professor Silvio
 *
 * @author david.maria
 */
public class TestaCliente {

    public static void main(String[] args) {

        //Cliente cliente01 = new Cliente();
        ClienteNegocio cliente01 = new ClienteNegocio();
        List<Cliente> clientes = cliente01.gerarListaCliente();

        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("e-mail: " + cliente.getEmail());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("Salário: " + cliente.getSalario());
            System.out.println("");
        }

        double soma = cliente01.somarSalarios(clientes);
        
        Cliente clMaiorSal = cliente01.pesquisarClienteMaiorSalario(clientes);
        Cliente clMenorSal = cliente01.pesquisarClienteMenorSalario(clientes);
        
        System.out.println("Total de cliente: "+clientes.size());
        System.out.printf("A soma de todos os salários: R$" + soma);
        System.out.println("");
        System.out.printf("\nO cliente com maior salário:\nNome: "+ clMaiorSal.getNome()+ "\nSalario R$:"+clMaiorSal.getSalario()+"\n");
        System.out.printf("\nO cliente com menor salário:\nNome: "+ clMenorSal.getNome()+ "\nSalario R$:"+clMenorSal.getSalario());

    }

}

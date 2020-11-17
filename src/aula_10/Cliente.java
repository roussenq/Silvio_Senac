/*
 * Criar uma classe "Cliente" conforme diagrama de classe (nome, email, salario , telefone)
- criar uma classe "ClienteNegocio", onde tenha um metodo que receba uma lista de clientes e mostre a soma de todos os salarios dos clientes
- um metofo que receba uma lista de clienets e retorne o cliente com o menor salario e outro metodo que retorne cliente com o maior salario
- criar uma classe de "TesteCliente" onde carregue a lista de cliente e depois mostre o total de salario da lista de cliente e o cliente que tenha maior e menor salario.
 */
package aula_10;

/**
 *
 * @author david.maria
 */
public class Cliente {
    
    private String nome;
    private String email;
    private String telefone;
    private double salario;

    public Cliente() {
    }

    public Cliente(String nome, String email, String telefone, double salario) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
    
}

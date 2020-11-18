/*
 *  Criar um sistema de Agenda com uma classe contato (nome, e-mail, cidade, telefone)
 *   - criar uma classe AgendaNegocio
 *   - criar um metodo que receba uma lista de contatos e retorne o total de contatos cadastrados.
 *   - criar um metodo que receba uma lista de contatos e um nome para pesquisar e retorne a lista que contenha o nome pesquisado
 *   - criar um metodo que receba uma lista de contatos e um numero de telefone para ser pesquisado. retorne o contato ue tenha o numero que foi pesquisado.
 *   - criar a classe de teste onde carregue a lista de contato e depois mostrar os resultados quando os metodos forem executados.
 */
package aula_12;

/**
 * aula 17/09 prof Silvio - Faculdade Senac Palhoça
 *
 * @author david.maria
 */
public class Contato {

    private String nome;
    private String email;
    private String cidade;
    private String telefone;

    public Contato() {
    }

    public Contato(String nome, String email, String cidade, String telefone) {
        this.nome = nome;
        this.email = email;
        this.cidade = cidade;
        this.telefone = telefone;
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}

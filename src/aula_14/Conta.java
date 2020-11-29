/*
 * Crie uma classe Conta onde tenha os atributos: cliente, numero de conta, saldo, limite,
 * login e senha.
 * - criar a classe ContaNegocio
 * - declarar a lista de conta dentro da classe contaNegocio como variavel
 * de instancia com seu objeto ArrayList. De o nome de contas para a variavel
 * - criar um metodo para carregar uma conta e gravar na lista contas, 
 * não pode ter conta com o mesmo número. Os números das contas devem ter 6 dígitos. exemplo: 123456.
 * - cria um método que pesquise uma conta passando o numero.
 * - criar um metodo que receba o login e senha e retorne a conta.
 * - criar um metodo que faça saque na conta caso ela tenha limite. É obrigatório
 *   para a operação fazer validação com o login e senha da conta.
 * - criar um método que faça deposito na conta. É necessário passar o número da conta.
 * - criar um método que retorne o saldo de uma conta é preciso fazer o login e senha.
 *
 */
package aula_14;

/**
 *
 * @author David
 */
public class Conta {

    private String cliente;
    private String numeroConta;
    private float saldo;
    private float limite;
    private String login;
    private String senha;

    public Conta() {
    }

    public Conta(String cliente, String numeroConta, float saldo, float limite, String login, String senha) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limite = limite;
        this.login = login;
        this.senha = senha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}

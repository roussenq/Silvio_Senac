/*
 * - Crie uma classe Conta onde tenha os atributos: cliente, numero de conta,
 *  saldo, limite, login e senha. ok
 * - criar a classe ContaNegocio ok
 * - declarar a lista de conta dentro da classe contaNegocio como variavel de
 * instancia com seu objeto ArrayList. De o nome de contas para a variavel ok
 * - criar um metodo para carregar uma conta e gravar na lista contas, não pode
 * ter conta com o mesmo número. Os números das contas devem ter 6 dígitos. ok
 * - cria um método que pesquise uma conta passando o numero. ok
 * - criar um metodo que receba o login e senha e retorne a conta. ok
 * - criar um metodo que faça saque na conta caso ela tenha limite. É obrigatório
 *   para a operação fazer validação com o login e senha da conta. ok

* - criar um método que faça deposito na conta. É necessário passar o número da conta.
 * - criar um método que retorne o saldo de uma conta é preciso fazer o login e senha.
 *
 */
package aula_14;

import java.util.ArrayList;
import java.util.List;
import util.UtilGerador;

/**
 *
 * @author David
 */
public class ContaNegocio {

    private List<Conta> contas = new ArrayList<>();

    public Conta gerarConta() {
        Conta novaConta = new Conta(
                UtilGerador.gerarNome(),
                UtilGerador.gerarNumInteiro("6"),
                1000.56f,
                3000.02f,
                UtilGerador.gerarLogin(),
                UtilGerador.gerarSenha()
        );
        for (Conta conta : contas) {
            if (conta.getNumeroConta().equals(novaConta.getNumeroConta())) {
                novaConta.setNumeroConta(UtilGerador.gerarNumInteiro("6"));
            }
        }
        contas.add(novaConta);
        System.out.println("Conta criada com Sucesso!");
        return novaConta;
    }

    public Conta buscarConta(String numeroConta) {
        Conta conta = null;
        for (Conta conta1 : contas) {
            if (conta1.getNumeroConta().equals(numeroConta)) {
                conta = conta1;
            }
        }
        if (conta == null) {
            System.out.println("Conta não encontrada!");
        }
        return conta;
    }

    public Conta buscarContaPorLoginSenha(String login, String senha) {
        Conta pesquisa = null;

        for (Conta conta : contas) {
            if (conta.getLogin().equalsIgnoreCase(login) && conta.getSenha().equalsIgnoreCase(senha)) {
                pesquisa = conta;
                System.out.println("Sucesso!");
            } else {
                System.out.println("erro!");
            }
        }
        return pesquisa;
    }

    public String realizarSaque(String login, String senha, float valorSaque) {
        String mensagem = "";

        Conta clienteConta = null;
        for (Conta conta : contas) {
            if (conta.getLogin().equals(login) && conta.getSenha().equals(senha)) {
                clienteConta = conta;
                if (clienteConta.getSaldo() >= valorSaque) {
                    float saldo = clienteConta.getSaldo() - valorSaque;
                    clienteConta.setSaldo(saldo);
                } else if (clienteConta.getSaldo() < valorSaque && (clienteConta.getLimite() + clienteConta.getSaldo()) >= valorSaque) {
                    float novoSaldo = clienteConta.getSaldo() - valorSaque;
                    float novoLimite = (clienteConta.getSaldo() + clienteConta.getLimite()) - valorSaque;
                    clienteConta.setLimite(novoLimite);
                    clienteConta.setSaldo(novoSaldo);
                }
                System.out.println("Saque de: R$" + valorSaque + " efetuado com"
                        + " Sucesso\nNovo saldo: R$" + clienteConta.getSaldo()
                        + "\nNovo limite: R$" + clienteConta.getLimite());
                break;
            } else {
                System.out.println("Login/Senha inválidos");
            }
        }

        return mensagem;
    }

}

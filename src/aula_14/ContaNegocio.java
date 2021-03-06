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
 * - criar um método que faça deposito na conta. É necessário passar o número da conta.ok
 * - criar um método que retorne o saldo de uma conta é preciso fazer o login e senha. ok
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

    public String gerarConta() {
        Conta novaConta = new Conta(
                UtilGerador.gerarNome(), //cliente
                UtilGerador.gerarNumInteiro("6"), //numeroConta
                1000.56f, //saldo
                3000.02f, //limite
                UtilGerador.gerarLogin(),
                UtilGerador.gerarSenha()
        );
        for (Conta conta : contas) {
            if (conta.getNumeroConta().equals(novaConta.getNumeroConta())) {
                novaConta.setNumeroConta(UtilGerador.gerarNumInteiro("6"));
            }
        }
        contas.add(novaConta);
        return "Conta criada com Sucesso!\nConta n°" + novaConta.getNumeroConta()
                + "\nLogin: " + novaConta.getLogin()
                + "\nSenha: " + novaConta.getSenha();
    }

    public Conta buscarConta(String numeroConta) {
        Conta pesquisa = null;
        for (Conta conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                pesquisa = conta;
                break;
            }
        }
        if (pesquisa == null) {
            System.out.println("Conta não encontrada!");
        }
        return pesquisa;
    }

    public Conta buscarContaPorLoginSenha(String login, String senha) {
        Conta pesquisa = null;

        for (Conta conta : contas) {
            if (conta.getLogin().equalsIgnoreCase(login)
                    && conta.getSenha().equalsIgnoreCase(senha)) {
                pesquisa = conta;
                System.out.println("Sucesso!");
                break;
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
                    saqueOK(valorSaque, clienteConta);
                } else if (clienteConta.getSaldo() < valorSaque && (clienteConta.getLimite() + clienteConta.getSaldo()) >= valorSaque) {
                    float novoSaldo = clienteConta.getSaldo() - valorSaque;
                    float novoLimite = (clienteConta.getSaldo() + clienteConta.getLimite()) - valorSaque;
                    clienteConta.setLimite(novoLimite);
                    clienteConta.setSaldo(novoSaldo);
                    saqueOK(valorSaque, clienteConta);
                } else {
                    System.out.println("Saldo Insuficiente!");
                }
                break;
            } else {
                System.out.println("Login/Senha inválidos");
            }
        }
        return mensagem;
    }

    private void saqueOK(float valorSaque, Conta clienteConta) {
        System.out.println("Saque de: R$" + valorSaque + " efetuado com"
                + " Sucesso\nNovo saldo: R$" + clienteConta.getSaldo()
                + "\nNovo limite: R$" + clienteConta.getLimite());
    }

    public String realizaDeposito(String numeroConta, float valorDeposito) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                float saldo = conta.getSaldo() + valorDeposito;
                conta.setSaldo(saldo);
                break;
            } else {
                System.out.println("Conta Inválida!");
            }
        }
        return "Deposito realizado com sucesso!";
    }

    public void mostrarSaldo(String login, String senha) {
        float saldo;
        for (Conta conta : contas) {
            if (conta.getLogin().equals(login) && conta.getSenha().equals(senha)) {
                System.out.println("Saldo: R$" + conta.getSaldo());
                break;
            } else {
                System.out.println("Login/Senha inválidos");
            }
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_14;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class TestaConta {

    public static void main(String[] args) {
        ContaNegocio negocio = new ContaNegocio();
        String menu;
        do {
            menu = JOptionPane.showInputDialog("Banco do David\nInforme a opção"
                    + " desejada:\n1-Criar conta\n2-Saldo\n3-Saque\n4-Deposito"
                    + "\n5-Sair ");
            String login = "";
            String senha = "";
            String numeroConta = "";
            float retorno = 0;
            switch (menu) {
                case "1":
                    String mensagem = negocio.gerarConta();
                    System.out.println(mensagem);

                    break;
                case "2":
                    login = JOptionPane.showInputDialog("Login: \n");
                    senha = JOptionPane.showInputDialog("Senha: ");
                    negocio.mostrarSaldo(login, senha);
                    break;
                case "3":
                    login = JOptionPane.showInputDialog("-==SAQUE==-\nLogin: ");
                    senha = JOptionPane.showInputDialog("-==SAQUE==-\nSenha: ");
                    retorno = Float.parseFloat(JOptionPane.showInputDialog("-==SAQUE==-\nValor do saque\nR$: "));
                    negocio.realizarSaque(login, senha, retorno);
                    break;
                case "4":
                    numeroConta = JOptionPane.showInputDialog("-==Deposito==-"
                            + "\nInforme o n° da conta: ");
                    retorno = Float.parseFloat(JOptionPane.showInputDialog("-==DEPOSITO===-"
                            + "\nInforme o valor do deposito: \nR$"));
                    negocio.realizaDeposito(numeroConta, retorno);
                    break;
                case "5":
            }
        } while (!menu.equals("5"));

        /*  Conta conta1 = negocio.gerarConta();

        mostrarConta(conta1);

        Conta pesquisaContaPorNumero = negocio.buscarConta(JOptionPane.showInputDialog("Qual conta quer pesquisar? "));
        mostrarConta(pesquisaContaPorNumero);
        
        String login=JOptionPane.showInputDialog("Informe seu Login: ");
        String senha=JOptionPane.showInputDialog("Informe sua Senha: ");
        
        Conta pesquisaPorLoginSenha = negocio.buscarContaPorLoginSenha(login, senha);
        mostrarConta(pesquisaPorLoginSenha);
        
        System.out.println("Saque:\n");
        negocio.realizarSaque(login, senha, 2000);
         */
    }

    public static void mostrarConta(Conta conta) {
        if (conta == null) {
        } else {
            System.out.println("\n=====================================\n");
            System.out.println("Cliente:" + conta.getCliente());
            System.out.println("N° conta:" + conta.getNumeroConta());
            System.out.println("Saldo:" + conta.getSaldo());
            System.out.println("Limite:" + conta.getLimite());
            System.out.println("Login:" + conta.getLogin());
            System.out.println("Senha:" + conta.getSenha());
        }
    }

}

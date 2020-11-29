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
        Conta conta1 = negocio.gerarConta();

        mostrarConta(conta1);

        Conta pesquisa = negocio.buscarConta(JOptionPane.showInputDialog("Qual conta quer pesquisar? "));
        mostrarConta(pesquisa);

    }

    public static void mostrarConta(Conta conta) {
        if (conta == null) {
        } else {
            System.out.println("Cliente:" + conta.getCliente());
            System.out.println("N° conta:" + conta.getNumeroConta());
            System.out.println("Saldo:" + conta.getSaldo());
            System.out.println("Limite:" + conta.getLimite());
            System.out.println("Login:" + conta.getLogin());
            System.out.println("Senha:" + conta.getSenha());
        }
    }

}

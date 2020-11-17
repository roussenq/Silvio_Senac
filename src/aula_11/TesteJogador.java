/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_11;

import java.util.List;

/**
 *
 * @author david.maria
 */
public class TesteJogador {

    public static void main(String[] args) {

        JogadorNegocio jogadorNegocio = new JogadorNegocio();
        List<Jogador> jogadores = jogadorNegocio.gerarListaJogadores();

        for (Jogador jogador : jogadores) {
            System.out.println("Nome: " + jogador.getNome());
            System.out.println("Idade: " + jogador.getIdade());
            System.out.println("Nivel: " + jogador.getNivel());
            System.out.println("Pontos: " + jogador.getPonto());
            System.out.println("");
        }

        System.out.println("Total de jogadores: " + jogadores.size());
        System.out.printf("\nIdade média: %.2f", jogadorNegocio.calcularMediaIdade(jogadores));
        System.out.println("\nO pior jogador: "
                + "\n" + jogadorNegocio.mostrarJogadorMenorPontos(jogadores).getNome()
                + "\nPontos: " + jogadorNegocio.mostrarJogadorMenorPontos(jogadores).getPonto());
        System.out.println("\nO melhor jogador: "
                + "\n" + jogadorNegocio.mostrarJogadorMaiorPontos(jogadores).getNome()
                + "\nPontos: " + jogadorNegocio.mostrarJogadorMaiorPontos(jogadores).getPonto());

    }

}

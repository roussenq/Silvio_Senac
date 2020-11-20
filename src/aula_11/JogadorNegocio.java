/*
 * Criar uma classe JogadorNegocio
 * - criar um metodo que receba uma lista de jogadores e retorne a media
 *   de idade dos jogadores.(ok)
 * - criar um metodo que receba uma lista de jogadores e retorne o jogador
 *   com a menor quantidade de pontos.
 * - criar um metodo que receba uma lista de jogadores e retorne o jogador 
 *   com maior quantidade de pontos.
 */
package aula_11;

import java.util.ArrayList;
import java.util.List;
import util.UtilGerador;

/**
 *
 * @author david.maria
 */
public class JogadorNegocio {
    
    public List<Jogador> gerarListaJogadores() {
        List<Jogador> jogadores = new ArrayList<>();
        Jogador jogador;
        int qtdJogador = util.UtilGerador.criarNumeroAleatorioEntre2Valores(10, 20);
        for (int i = 0; i < qtdJogador; i++) {
            jogador = new Jogador(
                    "Nome: " + UtilGerador.gerarNome(),
                    "Nivel: " + UtilGerador.criarNumeroAleatorioEntre2Valores(50, 100),
                    UtilGerador.gerarNumInteiro(1),
                    UtilGerador.gerarNumInteiro(1)
            );
            jogadores.add(jogador);
        }
        return jogadores;
    }
    
    public double calcularMediaIdade(List<Jogador> jogadores) {
        double mediaIdades = 0;
        for (int i = 0; i < jogadores.size(); i++) {
            mediaIdades += jogadores.get(i).getIdade();
        }
        mediaIdades = mediaIdades / jogadores.size();
        return mediaIdades;
    }
    
    public Jogador mostrarJogadorMenorPontos(List<Jogador> jogadores) {
        Jogador piorJogador = jogadores.get(0);
        
        for (Jogador jogador : jogadores) {
            if (piorJogador.getPonto() > jogador.getPonto()){
                piorJogador = jogador;
            }
        }
        return piorJogador;
    }
    
    public Jogador mostrarJogadorMaiorPontos(List<Jogador> jogadores) {
        Jogador melhorJogador = jogadores.get(0);
        
        for (Jogador jogador : jogadores) {
            if (melhorJogador.getPonto() < jogador.getPonto()){
                melhorJogador = jogador;
            }
        }
        return melhorJogador;
    }
}

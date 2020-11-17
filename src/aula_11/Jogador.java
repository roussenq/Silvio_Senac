/*
 * Criar uma classe Jogador conforme diagrama: (Nome, ponto, nivel, idade)
 * 
 */
package aula_11;

/**
 *
 * @author david.maria
 */
public class Jogador {
    private String nome;
    private String nivel;
    private int ponto;
    private int idade;

    public Jogador() {
    }
    
    public Jogador(String nome, String nivel, int ponto, int idade) {
        this.nome = nome;
        this.nivel = nivel;
        this.ponto = ponto;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getPonto() {
        return ponto;
    }

    public void setPonto(int ponto) {
        this.ponto = ponto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
    
}
